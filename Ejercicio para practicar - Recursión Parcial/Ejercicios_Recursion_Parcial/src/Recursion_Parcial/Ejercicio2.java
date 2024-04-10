package Recursion_Parcial;

//2.- Escribir una función recursiva public static String eliminarVocalesYRevertir(String s) 
//que toma un String s y devuelve una nueva cadena que resulta de eliminar de s todas las 
//vocales y luego invertir sus caracteres. Por ejemplo:
//
//eliminarVocalesYRevertir(’’toro’’) debe devolver ’’rt’’.
//eliminarVocalesYRevertir(’’risa.’’) debe devolver ’’sr.’’.
//eliminarVocalesYRevertir(’’mapa’’) debe devolver ’’pm’’.
//eliminarVocalesYRevertir(’’fadap’’) debe devolver ’’pdf’’.
//eliminarVocalesYRevertir(’’uia’’) debe devolver ’’’’.

public class Ejercicio2 {
	
	public static String eliminarVocalesYRevertir(String s) {
		if(s.length()==0) {
			return "";
		}
		if(Ejercicio1.esVocal(s.charAt(0))) {
			return eliminarVocalesYRevertir(Resto.resto(s));
		}
		return eliminarVocalesYRevertir(Resto.resto(s)+s.charAt(0));
		
	}
	
}
