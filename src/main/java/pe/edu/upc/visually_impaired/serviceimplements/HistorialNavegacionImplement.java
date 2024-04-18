package pe.edu.upc.visually_impaired.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.visually_impaired.entities.HistorialNavegacion;
import pe.edu.upc.visually_impaired.repositories.IHistorialNavegacionRepository;
import pe.edu.upc.visually_impaired.serviceinterfaces.IHistorialNavegacionService;

import java.util.List;
@Service
public class HistorialNavegacionImplement implements IHistorialNavegacionService {
    @Autowired
    private IHistorialNavegacionRepository hR;
    @Override
    public void insert(HistorialNavegacion historialNavegacion){
        hR.save(historialNavegacion);
    }
    @Override
    public List<HistorialNavegacion> list(){
        return hR.findAll();
    }
    @Override
    public void delete(int id){
        hR.deleteById(id);
    }
    @Override
    public HistorialNavegacion listId(int id){
        return hR.findById(id).orElse(new HistorialNavegacion());
    }
}
