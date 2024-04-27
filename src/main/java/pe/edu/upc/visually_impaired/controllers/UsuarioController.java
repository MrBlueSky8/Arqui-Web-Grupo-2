package pe.edu.upc.visually_impaired.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.visually_impaired.dtos.CantidadporGeneroDTO;
import pe.edu.upc.visually_impaired.dtos.UsuarioDTO;
import pe.edu.upc.visually_impaired.entities.Usuario;
import pe.edu.upc.visually_impaired.serviceinterfaces.IUsuarioService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService uS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody UsuarioDTO usuarioDTO) {
        ModelMapper d=new ModelMapper();
        Usuario usuario = d.map(usuarioDTO, Usuario.class);
        uS.insert(usuario);
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void modificar(@RequestBody UsuarioDTO usuarioDTO) {
        ModelMapper d=new ModelMapper();
        Usuario usuario = d.map(usuarioDTO, Usuario.class);
        uS.insert(usuario);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<UsuarioDTO> listar(){
        return uS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") Integer id){
        uS.delete(id);
    }

    @GetMapping("/{id}")
    public UsuarioDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        UsuarioDTO dto=m.map(uS.listId(id),UsuarioDTO.class);
        return dto;
    }
    @GetMapping("/usuariosxgenero")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<CantidadporGeneroDTO> cantidadgenero(){
        List<String[]> filaLista = uS.cantidadporGenero();
        List<CantidadporGeneroDTO> dtoLista=new ArrayList<>();
        for (String[] fila : filaLista){
            CantidadporGeneroDTO dto = new CantidadporGeneroDTO();
            dto.setGenero(fila[0]);
            dto.setCantidad_Usuarios(Integer.parseInt(fila[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
