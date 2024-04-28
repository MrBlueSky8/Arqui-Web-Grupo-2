package pe.edu.upc.visually_impaired.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.visually_impaired.dtos.ComentariosValoracionesRutasDTO;
import pe.edu.upc.visually_impaired.dtos.ValoracionesRutasDTO;
import pe.edu.upc.visually_impaired.dtos.ValoracionpromedioRutasDTO;
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
    public List<ComentariosValoracionesRutasDTO> listar(){
        return ccS.list().stream().map(y->{
            ModelMapper e = new ModelMapper();
            return e.map(y,ComentariosValoracionesRutasDTO.class);

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
    @GetMapping("/rutaspromediovaloracion")
    public List<ValoracionpromedioRutasDTO> valoracionespromedioRutas(){
        List<String[]> filaLista = ccS.valoracionesRutas();
        List<ValoracionpromedioRutasDTO> dtoLista=new ArrayList<>();
        for (String[] fila : filaLista){
            ValoracionpromedioRutasDTO dto = new ValoracionpromedioRutasDTO();
            dto.setId(Integer.parseInt(fila[0]));
            dto.setPunto_origen(fila[1]);
            dto.setPunto_destino(fila[2]);
            dto.setDescripcion(fila[3]);
            if (fila[4] != null)
            {
                dto.setValoracion_promedio(Float.parseFloat(fila[4]));
            }
            else {
                dto.setValoracion_promedio(0);
            }

            dto.setCantidad_comentarios(Integer.parseInt(fila[5]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
