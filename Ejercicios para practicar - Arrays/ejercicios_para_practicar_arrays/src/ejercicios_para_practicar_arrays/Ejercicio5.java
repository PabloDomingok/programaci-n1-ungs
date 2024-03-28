package ejercicios_para_practicar_arrays;

import java.util.Scanner;

//Escribir el método public static int[] pedirArreglo(int n) que construye un arreglo de enteros, 
//solicitando al usuario el valor de cada una de las n posiciones y devuelve el arreglo construído.

public class Ejercicio5 {
	
//implementar la función imprimir(); del Ejercicio1 para imprimir el array	

	public static int[] pedirArreglo(int n) {
		int [] a =new int[n];
		for(int i=0;i<n;i++) {
		Scanner scan =new Scanner(System.in);
		System.out.print("ingrese un Número: ");
		a[i]=scan.nextInt();
		}	
	return a;
	}
	
}
