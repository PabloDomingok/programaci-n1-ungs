package Ejercicios_Strings_Recursion;

//3. Escribir una función que tome un String como parámetro y lo 
//imprima por intercalando un '∗' entre cada letra (pero no al final del String). 
//Por ejemplo, si la función toma el String "hola" como argumento, deberá imprimir "h∗o∗l∗a".

public class Ejercicio3 {
	
	public static void imprimirAsteriscos(String s) {
		if(s.length()==0) {
			System.out.println();
			return;
		}
		System.out.print(s.charAt(0));
		if(s.length()>1) {
			System.out.print("*");
		}
		imprimirAsteriscos(Resto.resto(s));
	}

}
