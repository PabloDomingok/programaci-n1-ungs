package EjerciciosStrings;

//Hacer una función que devuelva true si el String 
//está compuesto solamente por letras 'e', y false en 
//caso contrario.

public class Ejercicio2 {

	public static boolean soloLetrasE(String s) {
		if(Ejercicio1.contarLetrasE(s)==s.length()) {
			return true;
		}
		return false;
	}

}
