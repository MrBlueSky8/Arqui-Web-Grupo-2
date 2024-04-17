package pe.edu.upc.visually_impaired.serviceimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.visually_impaired.serviceinterfaces.ICoordenadasConverterService;

@Service
public class CoordenadasConverterImplement implements ICoordenadasConverterService {
    @Override
    public double[] convertirDMSToDecimal(String dms) {
        String[] partes = dms.split("[°'\"NSWE]");

        double gradosLatitud = Double.parseDouble(partes[0]);
        double minutosLatitud = Double.parseDouble(partes[1]);
        double segundosLatitud = Double.parseDouble(partes[2]);
        char direccionLatitud = dms.charAt(dms.length() - 1);

        double gradosLongitud = Double.parseDouble(partes[3]);
        double minutosLongitud = Double.parseDouble(partes[4]);
        double segundosLongitud = Double.parseDouble(partes[5]);
        char direccionLongitud = dms.charAt(dms.length() - 1);

        if (direccionLatitud == 'S') {
            gradosLatitud = -gradosLatitud;
            minutosLatitud = -minutosLatitud;
            segundosLatitud = -segundosLatitud;
        }
        if (direccionLongitud == 'W') {
            gradosLongitud = -gradosLongitud;
            minutosLongitud = -minutosLongitud;
            segundosLongitud = -segundosLongitud;
        }

        double latitudDecimal = gradosLatitud + (minutosLatitud / 60) + (segundosLatitud / 3600);
        double longitudDecimal = gradosLongitud + (minutosLongitud / 60) + (segundosLongitud / 3600);

        return new double[]{latitudDecimal, longitudDecimal};
    }
    /*ejemplo de uso:
    * CoordenadasService coordenadasService = new CoordenadasService();

        // Coordenadas en formato DMS
        String coordenadasDMS = "12°04'26.4"S 76°58'38.3"W";

        // Convertir coordenadas de DMS a decimal
        double[] coordenadasDecimal = coordenadasService.convertirDMSToDecimal(coordenadasDMS);

        // Mostrar coordenadas en formato decimal
        System.out.println("Latitud en decimal: " + coordenadasDecimal[0]);
        System.out.println("Longitud en decimal: " + coordenadasDecimal[1]);
    * */
}
