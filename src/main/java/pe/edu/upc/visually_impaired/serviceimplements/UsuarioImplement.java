package pe.edu.upc.visually_impaired.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.visually_impaired.entities.Usuario;
import pe.edu.upc.visually_impaired.repositories.IUsuarioRepository;
import pe.edu.upc.visually_impaired.serviceinterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioImplement implements IUsuarioService {
    @Autowired
    private IUsuarioRepository uR;
    @Override
    public void insert(Usuario usuario) {
        uR.save(usuario);
    }

    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int id) {
        uR.deleteById(id);
    }

    @Override
    public Usuario listId(int id) {
        return uR.findById(id).orElse(new Usuario());
    }
    @Override
    public List<String[]> cantidadporGenero(){
        return uR.cantidadporGenero();
    }

    @Override
    public int GetIdByEmail(String emailusr) {
        return uR.GetIdByEmail(emailusr);
    }

    @Override
    public int ultimoidregistrado() {
        return uR.ultimoidregistrado();
    }
}
