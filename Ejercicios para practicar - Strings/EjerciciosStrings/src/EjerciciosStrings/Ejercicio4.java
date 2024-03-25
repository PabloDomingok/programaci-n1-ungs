package EjerciciosStrings;

//4. Hacer una función que tome un String y devuelva 
//true si es duódromo, y false en caso contrario. 
//Un String es duódromo si está compuesto solamente por 
//letras duplicadas contiguas. Por ejemplo "llaammaa" es duódroma,
//"ssaabb" es duódroma.

public class Ejercicio4 {


	public static boolean esDuodromo(String s) {
		if(esImpar(s)) {
			return false;
		}
		int cont=0;
		for(int i=0;i<s.length();i+=2) {
			if(s.charAt(i)==s.charAt(i+1)) {
				cont++;
			}
		}
		return cont==s.length()/2;
	}
	public static boolean esImpar(String s) {
				if(s.length()%2!=0) {
				return true;
				}
		else {
			return false;	
		}
		
	}

}
