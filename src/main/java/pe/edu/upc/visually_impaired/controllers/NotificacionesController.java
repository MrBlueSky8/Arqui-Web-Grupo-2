package pe.edu.upc.visually_impaired.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.visually_impaired.dtos.NotificacionesDTO;
import pe.edu.upc.visually_impaired.entities.Notificaciones;
import pe.edu.upc.visually_impaired.serviceinterfaces.INotificacionesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/notificaciones")
public class NotificacionesController {
    @Autowired
    private INotificacionesService nS;
    @PostMapping
    public void insertar(@RequestBody NotificacionesDTO notificacionesDTO){
        ModelMapper a = new ModelMapper();
        Notificaciones notificaciones=a.map(notificacionesDTO,Notificaciones.class);
        nS.insert(notificaciones);
    }
    @PutMapping
    public void modificar(@RequestBody NotificacionesDTO notificacionesDTO) {
        ModelMapper d=new ModelMapper();
        Notificaciones notificaciones = d.map(notificacionesDTO,Notificaciones.class);
        nS.insert(notificaciones);
    }
    @GetMapping
    public List<Notificaciones> listar(){
        return nS.list().stream().map(y->{
            ModelMapper e = new ModelMapper();
            return e.map(y,Notificaciones.class);

        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        nS.delete(id);
    }

    @GetMapping("/{id}")
    public NotificacionesDTO listarId(@PathVariable Integer id){
        ModelMapper m = new ModelMapper();
        NotificacionesDTO dto=m.map(nS.listId(id),NotificacionesDTO.class);
        return dto;
    }

}
