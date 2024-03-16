package practica0;

//Escribir un método static int cantidadVocales(String s) que dada una cadena que contiene
//sólo letras min´usculas sin acentuar, devuelve la cantidad de vocales en dicha cadena. Nota: se puede
//utilizar el método definido en el ejercicio anterior.

public class Ejercicio18 {

	public static int cantidadVocales(String s){
		int cont=0;
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)=='a' ||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				cont++;
			}
		}
		return cont;
		
	}

}
