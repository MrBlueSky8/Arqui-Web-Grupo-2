package pe.edu.upc.visually_impaired.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.visually_impaired.dtos.HistorialNavegacionDTO;
import pe.edu.upc.visually_impaired.dtos.HistorialXFechaDTO;
import pe.edu.upc.visually_impaired.dtos.RutaMasTransitadaDTO;
import pe.edu.upc.visually_impaired.dtos.ValoracionesRutasDTO;
import pe.edu.upc.visually_impaired.entities.HistorialNavegacion;
import pe.edu.upc.visually_impaired.serviceinterfaces.IHistorialNavegacionService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/historialnavegacion")
public class HistorialNavegacionController {
    @Autowired
    private IHistorialNavegacionService hS;
    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody HistorialNavegacionDTO historialNavegacionDTO){
        ModelMapper a = new ModelMapper();
        HistorialNavegacion historialNavegacion=a.map(historialNavegacionDTO,HistorialNavegacion.class);
        hS.insert(historialNavegacion);
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void modificar(@RequestBody HistorialNavegacionDTO historialNavegacionDTO) {
        ModelMapper d=new ModelMapper();
        HistorialNavegacion historialNavegacion = d.map(historialNavegacionDTO,HistorialNavegacion.class);
        hS.insert(historialNavegacion);
    }
    @GetMapping //reparado
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
    public List<HistorialNavegacionDTO> listar(){
        return hS.list().stream().map(y->{
            ModelMapper e = new ModelMapper();
            return e.map(y,HistorialNavegacionDTO.class);

        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") Integer id){
        hS.delete(id);
    }
    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('CLIENT')")
    public HistorialNavegacionDTO listarId(@PathVariable Integer id){
        ModelMapper m = new ModelMapper();
        HistorialNavegacionDTO dto=m.map(hS.listId(id),HistorialNavegacionDTO.class);
        return dto;
    }

    @GetMapping("/rutamasviajadas")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<RutaMasTransitadaDTO> Ruta_mas_transitada(){
        List<String[]> filaLista = hS.Ruta_mas_transitada();
        List<RutaMasTransitadaDTO> dtoLista=new ArrayList<>();
        for (String[] fila : filaLista){
            RutaMasTransitadaDTO dto = new RutaMasTransitadaDTO();
            dto.setId(Integer.parseInt(fila[0]));
            dto.setPunto_destino(fila[1]);
            dto.setPunto_origen(fila[2]);
            dto.setCantidad_de_viajes(Integer.parseInt(fila[3]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
    @GetMapping("/historialporfecha")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<HistorialXFechaDTO> HistorialPorFecha(@RequestParam int usuario_id, @RequestParam LocalDate fechas){
        List<String[]> filaLista = hS.FiltrarHistorialXFecha(usuario_id, fechas);
        List<HistorialXFechaDTO> dtoLista=new ArrayList<>();
        for (String[] fila : filaLista){
            HistorialXFechaDTO dto = new HistorialXFechaDTO();
            dto.setDestino(fila[0]);
            dto.setOrigen(fila[1]);
            dto.setFechayHoraOrigen(LocalDateTime.parse(fila[2].replace(" ","T")));
            dto.setFechayHoraDestino(LocalDateTime.parse(fila[3].replace(" ","T")));
            dto.setDetalles(fila[4]);
            dto.setFinalizado(Boolean.parseBoolean(fila[5]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
    @GetMapping("/historialporperiodo")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<HistorialXFechaDTO> HistorialPorPeriodo(@RequestParam int usuario_id, @RequestParam String periodo){
        List<String[]> filaLista = hS.HistorialNavegacion_Por_Periodo(usuario_id, periodo.toLowerCase());
        List<HistorialXFechaDTO> dtoLista=new ArrayList<>();
        for (String[] fila : filaLista){
            HistorialXFechaDTO dto = new HistorialXFechaDTO();
            dto.setDestino(fila[0]);
            dto.setOrigen(fila[1]);
            dto.setFechayHoraOrigen(LocalDateTime.parse(fila[2].replace(" ","T")));
            dto.setFechayHoraDestino(LocalDateTime.parse(fila[3].replace(" ","T")));
            dto.setDetalles(fila[4]);
            dto.setFinalizado(Boolean.parseBoolean(fila[5]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
