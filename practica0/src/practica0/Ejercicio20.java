package practica0;

//Escribir el método static boolean esCapicua(String s) que dada una cadena, devuelve true
//si la cadena es igual de atrás hacia adelante o de adelante hacia atrás. En caso contrario, devuelve
//false.

public class Ejercicio20 {

	
	public static boolean esCapicua(String s) {
		s.toLowerCase();
		for(int i=0; i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
	
}
