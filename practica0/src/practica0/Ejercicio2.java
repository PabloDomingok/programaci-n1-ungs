package practica0;

import java.util.Scanner;

//Escribir un programa que te pregunte tu nombre y a continuación imprima un saludo del estilo
//"Hola Nombre".

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		String nombre= scan.nextLine();
		System.out.println("¡Hola "+nombre+"!");

	}

}
