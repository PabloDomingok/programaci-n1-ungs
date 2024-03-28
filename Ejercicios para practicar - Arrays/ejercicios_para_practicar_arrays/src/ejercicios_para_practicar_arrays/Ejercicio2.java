package ejercicios_para_practicar_arrays;

//Implementar una función public static double promedio(int[] a) 
//que dado un arreglo de enteros, devuelva el promedio de sus elementos.

public class Ejercicio2 {

	public static double promedio(int[] a) {
		double resultado=0;
		for(int i=0; i<a.length; i++) {
			resultado+=a[i];
		}
		return resultado/a.length;
	}

}
