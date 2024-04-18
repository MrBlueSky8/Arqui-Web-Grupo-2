package pe.edu.upc.visually_impaired.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.visually_impaired.dtos.ComentariosValoracionesRutasDTO;
import pe.edu.upc.visually_impaired.dtos.ValoracionesRutasDTO;
import pe.edu.upc.visually_impaired.entities.ComentaiosValoracionesRutas;
import pe.edu.upc.visually_impaired.serviceinterfaces.IComentariosValoracionesRutasService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comentariosvaloracionesrutas")
public class ComentariosValoracionesRutasController {
    @Autowired
    private IComentariosValoracionesRutasService ccS;
    @PostMapping
    public void insertar(@RequestBody ComentariosValoracionesRutasDTO comentariosValoracionesRutasDTO){
        ModelMapper a = new ModelMapper();
        ComentaiosValoracionesRutas comentaiosValoracionesRutas=a.map(comentariosValoracionesRutasDTO,ComentaiosValoracionesRutas.class);
        ccS.insert(comentaiosValoracionesRutas);
    }
    @PutMapping
    public void modificar(@RequestBody ComentariosValoracionesRutasDTO comentariosValoracionesRutasDTO) {
        ModelMapper d=new ModelMapper();
        ComentaiosValoracionesRutas comentaiosValoracionesRutas = d.map(comentariosValoracionesRutasDTO, ComentaiosValoracionesRutas.class);
        ccS.insert(comentaiosValoracionesRutas);
    }
    @GetMapping
    public List<ComentaiosValoracionesRutas> listar(){
        return ccS.list().stream().map(y->{
            ModelMapper e = new ModelMapper();
            return e.map(y,ComentaiosValoracionesRutas.class);

        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        ccS.delete(id);
    }

    @GetMapping("/{id}")
    public ComentariosValoracionesRutasDTO listarId(@PathVariable Integer id){
        ModelMapper m = new ModelMapper();
        ComentariosValoracionesRutasDTO dto=m.map(ccS.listId(id),ComentariosValoracionesRutasDTO.class);
        return dto;
    }
    @GetMapping("/rutasvaloracionmasde10")
    public List<ValoracionesRutasDTO> valoracionesRutas(){
        List<String[]> filaLista = ccS.valoracionesRutas();
        List<ValoracionesRutasDTO> dtoLista=new ArrayList<>();
        for (String[] fila : filaLista){
            ValoracionesRutasDTO dto = new ValoracionesRutasDTO();
            dto.setDistancia(Integer.parseInt(fila[0]));
            dto.setId(Integer.parseInt(fila[1]));
            dto.setDescripcion(fila[2]);
            dto.setPunto_destino(fila[3]);
            dto.setPunto_origen(fila[4]);
            dto.setLista_coordenadas(fila[5]);
            dto.setValoracion(Integer.parseInt(fila[6]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
