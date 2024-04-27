package pe.edu.upc.visually_impaired.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.visually_impaired.dtos.Tipos_eventoDTO;
import pe.edu.upc.visually_impaired.entities.Tipos_evento;
import pe.edu.upc.visually_impaired.serviceinterfaces.ITipos_eventoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipoevento")
public class Tipos_de_eventoController {
    @Autowired
    private ITipos_eventoService teS;
    @PostMapping
    public void insertar(@RequestBody Tipos_eventoDTO eventoDTO) {
        ModelMapper d=new ModelMapper();
        Tipos_evento movie = d.map(eventoDTO,Tipos_evento.class);
        teS.insert(movie);
    }
    @PutMapping
    public void modificar(@RequestBody Tipos_eventoDTO eventoDTO) {
        ModelMapper d=new ModelMapper();
        Tipos_evento movie = d.map(eventoDTO,Tipos_evento.class);
        teS.insert(movie);
    }
    @GetMapping
    public List<Tipos_eventoDTO> listar(){
        return teS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,Tipos_eventoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        teS.delete(id);
    }
    @GetMapping("/{id}")
    public Tipos_eventoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        Tipos_eventoDTO dto=m.map(teS.listId(id),Tipos_eventoDTO.class);
        return dto;
    }
}
