package pe.edu.upc.visually_impaired.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.visually_impaired.dtos.RutaSeguraTiempoPromedioDTO;
import pe.edu.upc.visually_impaired.dtos.Rutas_segurasDTO;
import pe.edu.upc.visually_impaired.dtos.RutasxDistanciaIngresadaDTO;
import pe.edu.upc.visually_impaired.entities.Rutas_seguras;
import pe.edu.upc.visually_impaired.serviceinterfaces.IRutas_segurasService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rutas_seguras")
public class Rutas_segurasController {
    @Autowired
    private IRutas_segurasService rsS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody Rutas_segurasDTO segurasDTO) {
        ModelMapper d=new ModelMapper();
        Rutas_seguras rutas_seguras = d.map(segurasDTO,Rutas_seguras.class);
        rsS.insert(rutas_seguras);
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void modificar(@RequestBody Rutas_segurasDTO segurasDTO) {
        ModelMapper d=new ModelMapper();
        Rutas_seguras rutas_seguras = d.map(segurasDTO,Rutas_seguras.class);
        rsS.insert(rutas_seguras);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('COSTUMER')")
    public List<Rutas_segurasDTO> listar(){
        return rsS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,Rutas_segurasDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") Integer id){
        rsS.delete(id);
    }
    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('COSTUMER')")
    public Rutas_segurasDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        Rutas_segurasDTO dto=m.map(rsS.listId(id),Rutas_segurasDTO.class);
        return dto;
    }
    @GetMapping("/distancias_menores")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('COSTUMER')")
    public List<RutasxDistanciaIngresadaDTO> rutasSegurasanterioresxDistancia(@RequestParam int distancia){
        List<String[]> filaLista= rsS.rutasSegurasanterioresxDistancia(distancia);
        List<RutasxDistanciaIngresadaDTO> dtoLista = new ArrayList<>();
        for(String[] columna:filaLista){

            RutasxDistanciaIngresadaDTO dto = new RutasxDistanciaIngresadaDTO();
            dto.setDistancia(Integer.parseInt(columna[0]));
            dto.setPunto_origen(columna[1]);
            dto.setPunto_destino(columna[2]);
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/tiempopromedioxruta")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<RutaSeguraTiempoPromedioDTO> tiempopromedioxruta(){
        List<String[]> filaLista= rsS.tiempopromedioxruta();
        List<RutaSeguraTiempoPromedioDTO> dtoLista = new ArrayList<>();
        for(String[] columna:filaLista){
            RutaSeguraTiempoPromedioDTO dto = new RutaSeguraTiempoPromedioDTO();
            dto.setPunto_origen(columna[0]);
            dto.setPunto_destino(columna[1]);
            dto.setDescripcion(columna[2]);
            dto.setTiempo_promedio_navegacion_minutos(Float.parseFloat(columna[3]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
    
}
