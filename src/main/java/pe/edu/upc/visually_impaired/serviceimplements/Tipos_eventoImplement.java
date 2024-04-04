package pe.edu.upc.visually_impaired.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.visually_impaired.entities.Tipos_evento;
import pe.edu.upc.visually_impaired.repositories.ITipos_evento;
import pe.edu.upc.visually_impaired.serviceinterfaces.ITipos_eventoService;

import java.util.List;

@Service
public class Tipos_eventoImplement implements ITipos_eventoService {
    @Autowired
    private ITipos_evento teR;
    @Override
    public void insert(Tipos_evento tipos_evento) { teR.save(tipos_evento); }
    @Override
    public List<Tipos_evento> list() { return teR.findAll(); }
}
