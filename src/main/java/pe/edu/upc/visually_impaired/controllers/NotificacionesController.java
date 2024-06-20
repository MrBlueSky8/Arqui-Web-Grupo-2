package pe.edu.upc.visually_impaired.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.visually_impaired.dtos.EventosxvenirDTO;
import pe.edu.upc.visually_impaired.dtos.NotificacionesDTO;
import pe.edu.upc.visually_impaired.dtos.NotificacionesNoLeidasDTO;
import pe.edu.upc.visually_impaired.dtos.NotificacionesXTipoDTO;
import pe.edu.upc.visually_impaired.entities.Notificaciones;
import pe.edu.upc.visually_impaired.serviceinterfaces.INotificacionesService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/notificaciones")
public class NotificacionesController {
    @Autowired
    private INotificacionesService nS;
    @PostMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody NotificacionesDTO notificacionesDTO){
        ModelMapper a = new ModelMapper();
        Notificaciones notificaciones=a.map(notificacionesDTO,Notificaciones.class);
        nS.insert(notificaciones);
    }
    @PutMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void modificar(@RequestBody NotificacionesDTO notificacionesDTO) {
        ModelMapper d=new ModelMapper();
        Notificaciones notificaciones = d.map(notificacionesDTO,Notificaciones.class);
        nS.insert(notificaciones);
    }
    @GetMapping
    //@PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
    public List<NotificacionesDTO> listar(){
        return nS.list().stream().map(y->{
            ModelMapper e = new ModelMapper();
            return e.map(y,NotificacionesDTO.class);

        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") Integer id){
        nS.delete(id);
    }

    @GetMapping("/{id}")
    //@PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
    public NotificacionesDTO listarId(@PathVariable Integer id){
        ModelMapper m = new ModelMapper();
        NotificacionesDTO dto=m.map(nS.listId(id),NotificacionesDTO.class);
        return dto;
    }
    @GetMapping("/notificacionessinleer")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<NotificacionesNoLeidasDTO> notificacionessinleer(@RequestParam int id_usuario){
        List<String[]> filaLista = nS.notificacionesinleer(id_usuario);
        List<NotificacionesNoLeidasDTO> dtoLista=new ArrayList<>();
        for (String[] fila : filaLista){
            NotificacionesNoLeidasDTO dto = new NotificacionesNoLeidasDTO();
            dto.setId(Integer.parseInt(fila[0]));
            dto.setContenido(fila[1]);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
            LocalDateTime dateTime = LocalDateTime.parse(fila[2], formatter);
            dto.setFechayhora(dateTime);

            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/notificacionesportipo")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<NotificacionesXTipoDTO> notificacionesportipo(@RequestParam String tipos,@RequestParam int idUsuarios){
        List<String[]> filaLista = nS.notifiacionesXtipo(tipos,idUsuarios);
        List<NotificacionesXTipoDTO> dtoLista=new ArrayList<>();
        for (String[] fila : filaLista){
            NotificacionesXTipoDTO dto = new NotificacionesXTipoDTO();
            dto.setTipoNotificacion(fila[0]);
            dto.setEstado(Boolean.parseBoolean(fila[1]));
            dto.setContenido(fila[2]);
            dtoLista.add(dto);
        }
        return dtoLista;
    }

}
