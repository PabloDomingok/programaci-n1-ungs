package Ejercicios_Strings_Recursion;

public class Ejercicio4 {

	public static String reverso(String s) {
		if(s.length()<=1) {
			return s;
		}
		return reverso(Resto.resto(s))+s.charAt(0);
	}


}
