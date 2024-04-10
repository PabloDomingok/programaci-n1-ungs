package Ejercicios_Strings_Recursion;

//Para hacer los siguientes ejercicios, primero escribir la función 
//auxiliar public static String resto(String s) 
//que devuelve el String s menos el primer caracter. 
//Esta función debe hacerse sin usar recursión.

public class Resto {
	
	public static String resto(String s) {
		String r ="";
		for(int i=1; i<s.length();i++) {
			r+=s.charAt(i);
		}
		return r;
	}

}
