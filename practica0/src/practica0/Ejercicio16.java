package practica0;

//a) Escribir un programa que pida por pantalla un texto y a continuación lo imprima de atrás para
//adelante. Para obtener las letras de una cadena de caracteres pueden utilizar el m´etodo charAt
//de String. Por ejemplo, cadena.charAt(0) devuelve el primer caracter del String cadena.
//b) Mover el código que imprime la cadena al rev´es a un m´etodo
//static void imprimirReversa(String cadena)
//c) Escribir un método static String reversa(String cadena) que dado un String, devuelve otro
//String con los caracteres invertidos. Por ejemplo, reversa(‘‘hola’’) debería devolver el String
//‘‘ aloh’’.
//d) Modificar el método imprimirReversa para que utilice el método definido en el punto anterior.


import java.util.Scanner;

public class Ejercicio16 {

//ejercicio a)	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese una palabra");
		String palabra = scan.nextLine();
		String palabraReversa = "";
		for(int i=palabra.length()-1; i>=0;i--) {
			palabraReversa+=palabra.charAt(i);
			
		}
		System.out.println(palabraReversa);
		String s ="perro";
		imprimirRerversa(s);

	}
//ejercicio b) y d)
	
	public static void imprimirRerversa(String s) {
		System.out.println(reversa(s));
		}
		
	

//ejercicio c)
	
	public static String reversa(String s) {
		String palabraReversa = "";
		for(int i=s.length()-1; i>=0;i--) {
			palabraReversa+=s.charAt(i);
		}
		return palabraReversa;
	}	
	
}
