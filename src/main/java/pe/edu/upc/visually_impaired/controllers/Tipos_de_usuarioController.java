package pe.edu.upc.visually_impaired.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.visually_impaired.dtos.Tipos_de_usuarioDTO;
import pe.edu.upc.visually_impaired.dtos.UsuarioDTO;
import pe.edu.upc.visually_impaired.entities.Tipos_de_usuario;
import pe.edu.upc.visually_impaired.entities.Usuario;
import pe.edu.upc.visually_impaired.serviceinterfaces.ITipos_de_usuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipos_usuario")
public class Tipos_de_usuarioController {
    @Autowired
    private ITipos_de_usuarioService tuS;
    @PostMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody Tipos_de_usuarioDTO tiposDeUsuarioDTO) {
        ModelMapper d=new ModelMapper();
        Tipos_de_usuario tiposDeUsuario = d.map(tiposDeUsuarioDTO,Tipos_de_usuario.class);
        tuS.insert(tiposDeUsuario);
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void modificar(@RequestBody Tipos_de_usuarioDTO tiposDeUsuarioDTO) {
        ModelMapper d=new ModelMapper();
        Tipos_de_usuario tiposDeUsuario = d.map(tiposDeUsuarioDTO,Tipos_de_usuario.class);
        tuS.insert(tiposDeUsuario);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('CLIENT')")
    public List<Tipos_de_usuarioDTO> listar(){
        return tuS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,Tipos_de_usuarioDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") Integer id){
        tuS.delete(id);
    }
    @GetMapping("/{id}")
    public Tipos_de_usuarioDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        Tipos_de_usuarioDTO dto=m.map(tuS.listId(id),Tipos_de_usuarioDTO.class);
        return dto;
    }
}
