package practica0;

//Escribir un método static int cantidadApariciones(String s, char c) que dada una cadena
//y un caracter, cuenta la cantidad de veces que aparece c en s.


public class Ejercicio17 {

	
	public static int cantidadDeApariciones(String s, char c) {
		int cont=0;
		for(int i = 0; i<s.length(); i++) {
			if(c==s.charAt(i)) {
				cont++;
			}
			
		}
		return cont;
		
	}

}
