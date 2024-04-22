package pe.edu.upc.visually_impaired.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.visually_impaired.dtos.HistorialNavegacionDTO;
import pe.edu.upc.visually_impaired.dtos.RutaMasTransitadaDTO;
import pe.edu.upc.visually_impaired.dtos.ValoracionesRutasDTO;
import pe.edu.upc.visually_impaired.entities.HistorialNavegacion;
import pe.edu.upc.visually_impaired.serviceinterfaces.IHistorialNavegacionService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/historialnavegacion")
public class HistorialNavegacionController {
    @Autowired
    private IHistorialNavegacionService hS;
    @PostMapping
    public void insertar(@RequestBody HistorialNavegacionDTO historialNavegacionDTO){
        ModelMapper a = new ModelMapper();
        HistorialNavegacion historialNavegacion=a.map(historialNavegacionDTO,HistorialNavegacion.class);
        hS.insert(historialNavegacion);
    }
    @PutMapping
    public void modificar(@RequestBody HistorialNavegacionDTO historialNavegacionDTO) {
        ModelMapper d=new ModelMapper();
        HistorialNavegacion historialNavegacion = d.map(historialNavegacionDTO,HistorialNavegacion.class);
        hS.insert(historialNavegacion);
    }
    @GetMapping
    public List<HistorialNavegacion> listar(){
        return hS.list().stream().map(y->{
            ModelMapper e = new ModelMapper();
            return e.map(y,HistorialNavegacion.class);

        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        hS.delete(id);
    }
    @GetMapping("/{id}")
    public HistorialNavegacionDTO listarId(@PathVariable Integer id){
        ModelMapper m = new ModelMapper();
        HistorialNavegacionDTO dto=m.map(hS.listId(id),HistorialNavegacionDTO.class);
        return dto;
    }

    @GetMapping("/rutamasviajadas")
    public List<RutaMasTransitadaDTO> Ruta_mas_transitada(){
        List<String[]> filaLista = hS.Ruta_mas_transitada();
        List<RutaMasTransitadaDTO> dtoLista=new ArrayList<>();
        for (String[] fila : filaLista){
            RutaMasTransitadaDTO dto = new RutaMasTransitadaDTO();
            dto.setId(Integer.parseInt(fila[0]));
            dto.setPunto_destino(fila[1]);
            dto.setPunto_origen(fila[2]);
            dto.getCantidad_de_viajes(fila[3]);
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}