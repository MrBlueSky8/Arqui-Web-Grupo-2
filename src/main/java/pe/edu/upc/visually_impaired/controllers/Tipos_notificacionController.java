package pe.edu.upc.visually_impaired.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.visually_impaired.dtos.Tipos_de_usuarioDTO;
import pe.edu.upc.visually_impaired.dtos.Tipos_notificacionDTO;
import pe.edu.upc.visually_impaired.entities.Tipos_de_usuario;
import pe.edu.upc.visually_impaired.entities.Tipos_notificacion;
import pe.edu.upc.visually_impaired.serviceinterfaces.ITipos_notificacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipos_notificacion")
public class Tipos_notificacionController {
    @Autowired
    private ITipos_notificacionService tiS;
    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody Tipos_notificacionDTO tiposNotificacionDTO) {
        ModelMapper d=new ModelMapper();
        Tipos_notificacion tipos_notificacion = d.map(tiposNotificacionDTO,Tipos_notificacion.class);
        tiS.insert(tipos_notificacion);
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void modificar(@RequestBody Tipos_notificacionDTO tiposNotificacionDTO) {
        ModelMapper d=new ModelMapper();
        Tipos_notificacion tipos_notificacion = d.map(tiposNotificacionDTO,Tipos_notificacion.class);
        tiS.insert(tipos_notificacion);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('COSTUMER')")
    public List<Tipos_notificacionDTO> listar(){
        return tiS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,Tipos_notificacionDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") Integer id){
        tiS.delete(id);
    }
    @GetMapping("/{id}")
    public Tipos_notificacionDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        Tipos_notificacionDTO dto=m.map(tiS.listId(id),Tipos_notificacionDTO.class);
        return dto;
    }
}
