package practica0;

import java.util.Scanner;

//Escribir un programa que te pregunte por dos n´umeros, y a continuaci´on imprima un mensaje
//del estilo “El promedio es: ” y el valor del promedio de ambos n´umeros

public class ejercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int numero1 = scan.nextInt();
		System.out.print("Introduce otro número: ");
		int numero2 = scan.nextInt();
		System.out.println("El promedio es: "+((numero1+numero2)/2));

	}

}
