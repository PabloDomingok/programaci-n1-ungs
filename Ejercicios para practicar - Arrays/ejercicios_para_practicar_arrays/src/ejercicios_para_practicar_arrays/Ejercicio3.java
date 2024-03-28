package ejercicios_para_practicar_arrays;

//Implementar una función public static int maximo(int[] a), 
//que dado un arreglo de enteros desordenado devuelva el máximo elemento del arreglo.

public class Ejercicio3 {

	public static int maximo(int[] a) {
		int b=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>b) {
				b=a[i];
			}
		}
		return b;
		
	}


}
