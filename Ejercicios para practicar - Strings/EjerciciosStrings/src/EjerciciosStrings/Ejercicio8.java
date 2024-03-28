package EjerciciosStrings;

//Implementar una función que indique si una palabra es palíndromo. Una palabra es palíndrome 
//si se lee igual al derecho y al revés, por ejemplo, "ala", "ojo", "neuquen".

public class Ejercicio8 {

	public static boolean esPalindromo(String s) {
		if(s.length()==1) {
			return true;
		}
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)==s.charAt(s.length()-1-i)) {
				return true;
			}
		}
		return false;
	}

}
