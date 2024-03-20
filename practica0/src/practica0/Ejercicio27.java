package practica0;

//Escribir un método static int suma(int[] a) 
//que dado un arreglo de enteros, devuelve el valor
//de la suma de todos sus elementos.


public class Ejercicio27 {

	public static int suma(int[] a) {
		int b=0;
		for(int i=0; i<a.length; i++) {
			b+=a[i];
		}
		return b;
	}

}
