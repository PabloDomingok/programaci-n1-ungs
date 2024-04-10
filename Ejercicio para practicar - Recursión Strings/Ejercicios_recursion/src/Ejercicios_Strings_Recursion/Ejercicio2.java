package Ejercicios_Strings_Recursion;

//2. Escribir una función recursiva public static void imprimirEspaciado(String s) 
//que imprima el String s con un espacio luego de cada caracter. Por ejemplo, 
//imprimirEspaciado("Juan") muestra por pantalla "J u a n ".

public class Ejercicio2 {

	public static void main(String[] args) {
		imprimirEspaciado("perro");

	}
	public static void imprimirEspaciado(String s) {
		if(s.length()==0) {
			System.out.println();
			return;
		}
		System.out.print(s.charAt(0)+" ");
		imprimirEspaciado(Resto.resto(s));
	}

}
