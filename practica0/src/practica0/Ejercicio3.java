package practica0;

import java.util.Scanner;

//Escribir un programa que te pregunte por dos n´umeros, y a continuaci´on imprima un mensaje
//del estilo “La suma es: ” y el valor de la suma de ambos n´umeros. .


public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Elije un número: ");
		int numero1 = scan.nextInt();
		System.out.print("Elije otro número: ");
		int numero2 = scan.nextInt();
		System.out.print("La suma es: "+(numero1+numero2));
		
		

	}

}
