package Ejercicios_Strings_Recursion;

//1. Escribir una función public static int longitud(String s) 
//que devuelve la longitud del String s. No vale usar .length().

public class Ejercicio1 {
	
	public static int longitud(String s) {
		if(s.isEmpty()) {
			return 0;
		}
		return 1+ longitud(Resto.resto(s));
	}
	
}
