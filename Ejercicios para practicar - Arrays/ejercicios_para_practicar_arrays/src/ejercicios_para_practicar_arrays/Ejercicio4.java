package ejercicios_para_practicar_arrays;

//Implementar una función public static int[] reverso(int[] a), 
//que dado un arreglo de enteros devuelva un nuevo arreglo con los elementos en orden inverso.

public class Ejercicio4 {

//implementar la función imprimir(); del Ejercicio1 para imprimir el array

	public static int[] reverso(int[] a) {
		int[] b = new int[a.length]; 
		for(int i=0;i<a.length;i++){
			b[i]=a[a.length -1-i];
			
		}
		return b;
	}

}
