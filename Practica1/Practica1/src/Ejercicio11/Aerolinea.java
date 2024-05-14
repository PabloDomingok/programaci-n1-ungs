package Ejercicio11;

public class Aerolinea {
	Vuelo[] vuelos;


public int vuelosEn(Tripulante t, String tipoAvion) {
    int contador = 0;
    
    for (int i = 0; i < vuelos.length; i++) {
        Vuelo vuelo = vuelos[i];
        
        if (tripulanteParticipaEnVuelo(t, vuelo) && vueloEnTipoAvion(vuelo, tipoAvion)) {
            contador++;
        }
    }
    return contador;
}


public boolean tripulanteParticipaEnVuelo(Tripulante t, Vuelo vuelo) {
    for (int i = 0; i < vuelo.tripulacion.length; i++) {
        Tripulante tripulante = vuelo.tripulacion[i];
        if (tripulante == t) {
            return true;
        }
    }
    return false;
}

public boolean vueloEnTipoAvion(Vuelo vuelo, String tipoAvion) {
	return vuelo.avion.tipo.equals(tipoAvion);
}

}