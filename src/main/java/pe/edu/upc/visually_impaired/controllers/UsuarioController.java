package pe.edu.upc.visually_impaired.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.visually_impaired.dtos.UsuarioDTO;
import pe.edu.upc.visually_impaired.entities.Usuario;
import pe.edu.upc.visually_impaired.serviceinterfaces.IUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService uS;

    @PostMapping
    public void insertar(@RequestBody UsuarioDTO usuarioDTO) {
        ModelMapper d=new ModelMapper();
        Usuario usuario = d.map(usuarioDTO, Usuario.class);
        uS.insert(usuario);
    }

    @PutMapping
    public void modificar(@RequestBody UsuarioDTO usuarioDTO) {
        ModelMapper d=new ModelMapper();
        Usuario usuario = d.map(usuarioDTO, Usuario.class);
        uS.insert(usuario);
    }

    @GetMapping
    public List<UsuarioDTO> listar(){
        return uS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        uS.delete(id);
    }
    @GetMapping("/{id}")
    public UsuarioDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        UsuarioDTO dto=m.map(uS.listId(id),UsuarioDTO.class);
        return dto;
    }
}
