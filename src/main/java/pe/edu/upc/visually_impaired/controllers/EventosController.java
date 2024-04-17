package pe.edu.upc.visually_impaired.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.visually_impaired.dtos.EventosDTO;
import pe.edu.upc.visually_impaired.entities.Eventos;
import pe.edu.upc.visually_impaired.serviceinterfaces.IEventosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/eventos")
public class EventosController {
    @Autowired
    private IEventosService eS;

    @PostMapping
    public void insertar(@RequestBody EventosDTO eventosDTO) {
        ModelMapper d=new ModelMapper();
        Eventos eventos = d.map(eventosDTO,Eventos.class);
        eS.insert(eventos);
    }

    @PutMapping
    public void modificar(@RequestBody EventosDTO eventosDTO) {
        ModelMapper d=new ModelMapper();
        Eventos eventos = d.map(eventosDTO,Eventos.class);
        eS.insert(eventos);
    }

    @GetMapping
    public List<EventosDTO> listar(){
        return eS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,EventosDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        eS.delete(id);
    }
    @GetMapping("/{id}")
    public EventosDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        EventosDTO dto=m.map(eS.listId(id),EventosDTO.class);
        return dto;
    }
}
