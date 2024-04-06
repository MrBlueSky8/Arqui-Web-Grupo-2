package pe.edu.upc.visually_impaired.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.visually_impaired.entities.Tipos_de_usuario;
import pe.edu.upc.visually_impaired.repositories.ITipos_de_usuarioRepository;
import pe.edu.upc.visually_impaired.serviceinterfaces.ITipos_de_usuarioService;

import java.util.List;

@Service
public class Tipos_de_usuarioImplement implements ITipos_de_usuarioService {

    @Autowired
    private ITipos_de_usuarioRepository tuR;
    @Override
    public void insert(Tipos_de_usuario tipos_de_usuario){ tuR.save(tipos_de_usuario); }
    @Override
    public List<Tipos_de_usuario> list() { return tuR.findAll(); }
    @Override
    public void delete(int id) {
        tuR.deleteById(id);
    }
    @Override
    public Tipos_de_usuario listId(int id) {
        return tuR.findById(id).orElse(new Tipos_de_usuario());
    }}
