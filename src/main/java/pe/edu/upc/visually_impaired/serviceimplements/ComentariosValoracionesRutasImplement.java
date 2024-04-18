package pe.edu.upc.visually_impaired.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.visually_impaired.entities.ComentaiosValoracionesRutas;
import pe.edu.upc.visually_impaired.repositories.IComentariosValoracionesRutasRepository;
import pe.edu.upc.visually_impaired.serviceinterfaces.IComentariosValoracionesRutasService;

import java.util.List;
@Service
public class ComentariosValoracionesRutasImplement implements IComentariosValoracionesRutasService {
    @Autowired
        private IComentariosValoracionesRutasRepository cR;
    @Override
    public void insert(ComentaiosValoracionesRutas comentaiosValoracionesRutas){
        cR.save(comentaiosValoracionesRutas);
    }
    @Override
    public List<ComentaiosValoracionesRutas> list(){
        return cR.findAll();
    }
    @Override
    public void delete(int id){
        cR.deleteById(id);
    }
    @Override
    public ComentaiosValoracionesRutas listId(int id){
        return cR.findById(id).orElse(new ComentaiosValoracionesRutas());
    }
    @Override
    public List<String[]> valoracionesRutas(){
        return cR.valoracionesRutas();
    }
}
