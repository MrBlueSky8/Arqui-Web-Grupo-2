package pe.edu.upc.visually_impaired.serviceinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.visually_impaired.entities.HistorialNavegacion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface IHistorialNavegacionService {
    public void insert(HistorialNavegacion historialNavegacion);
    public List<HistorialNavegacion> list();
    public void delete(int id);
    public HistorialNavegacion listId(int id);
    public List<String[]> Ruta_mas_transitada();
    public List<String[]> FiltrarHistorialXFecha(int usuarioId, LocalDate fechas);
    public List<String[]> HistorialNavegacion_Por_Periodo(int usuarioId,String periodos);


}
