package Ejercicios_Strings_Recursion;

//5. Escribir la función recursiva public static String combinar(String s, String t) 
//que devuelva el String que resulta de comparar s y t caracter a caracter y colocar 
//el menor de ellos en el resultado. Si s y t tienen longitudes distintas, tomamos el 
//resto del String que quede. Ejemplos:
//
//combinar(“abd”, "bbc") devuelve "abc"
//combinar(“fgd”, "adfxgtgs") devuelve "addxgtgs"

public class Ejercicio5 {

	public static String combinar(String s, String t) {
		if(s.length()==0) {
			return t;
			
		}
		if(t.length()==0) {
			return s;
		}
		if (s.charAt(0)<t.charAt(0)) {
			return s.charAt(0)+combinar(Resto.resto(s), Resto.resto(t));
		}
		else {
			return t.charAt(0)+combinar(Resto.resto(s), Resto.resto(t));
		}
	}
	

}
