package pe.edu.upc.visually_impaired.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.visually_impaired.entities.Rutas_seguras;
import pe.edu.upc.visually_impaired.repositories.IRutas_seguras;
import pe.edu.upc.visually_impaired.serviceinterfaces.IRutas_segurasService;

import java.util.List;

@Service
public class Rutas_segurasImplement implements IRutas_segurasService {
    @Autowired
    private IRutas_seguras rsR;
    @Override
    public void insert(Rutas_seguras rutas_seguras) { rsR.save(rutas_seguras); }
    @Override
    public List<Rutas_seguras> list() { return rsR.findAll(); }
}
