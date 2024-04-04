package pe.edu.upc.visually_impaired.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.visually_impaired.entities.Tipos_de_usuario;
import pe.edu.upc.visually_impaired.repositories.ITipos_de_usuario;
import pe.edu.upc.visually_impaired.serviceinterfaces.ITipos_de_usuarioService;

import java.util.List;

@Service
public class Tipos_de_usuarioImplement implements ITipos_de_usuarioService {

    @Autowired
    private ITipos_de_usuario tuR;
    @Override
    public void insert(Tipos_de_usuario tipos_de_usuario){ tuR.save(tipos_de_usuario); }
    @Override
    public List<Tipos_de_usuario> list() { return tuR.findAll(); }
}
