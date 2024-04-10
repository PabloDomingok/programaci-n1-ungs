package Ejercicios_Strings_Recursion;

//7. Hacer una función recursiva public static int cantidadApariciones(String s, char c) 
//que devuelve la cantidad de apariciones de c en s.

public class Ejercicio7 {

	public static int cantidadApariciones(String s, char c) {
		if(s.length()<=1) {
			return 0;
			}
		if(s.charAt(0)==c) {
			return 1 + cantidadApariciones(Resto.resto(s), c);
		}
		return cantidadApariciones(Resto.resto(s), c);
	}	
	
}
