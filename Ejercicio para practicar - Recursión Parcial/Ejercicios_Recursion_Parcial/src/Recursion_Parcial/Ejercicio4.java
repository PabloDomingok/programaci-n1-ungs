package Recursion_Parcial;

//4.- Escribir una función recursiva public static int cantidadValles(String s) 
//que dada una cadena s devuelve la cantidad de valles que contiene. Un valle es 
//una subcadena de s que contiene todos sus caracteres iguales y tiene 
//longitud al menos dos. Por ejemplo:
//
//cantidadValles ("pata") retorna 0, no posee valles.
//cantidadValles ("alaamoo") retorna 2, posee dos valle "aa" y "oo".
//cantidadValles ("llueve") retorna 1, posee el valle "ll".
//cantidadValles ("zzz") retorna 1, posee el valle "zzz".
//cantidadValles ("") retorna 0, no posee valles.

public class Ejercicio4 {
	
	public static int cantidadValles(String s) {
		if(s.length()<=1) {
			return 0;
		}
		if(s.length()==2) {
			return (s.charAt(0)==s.charAt(1)?1:0);
		}
		if(s.charAt(0)==s.charAt(1)&&s.charAt(0)!=s.charAt(2)) {
			return 1+cantidadValles(Resto.resto(s));
		}
		return cantidadValles(Resto.resto(s));
	}

}
