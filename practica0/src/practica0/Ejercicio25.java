package practica0;

//Escribir un metodo static int maximo(int[] a) 
//que dado un arreglo de enteros no vacío, devuelve
//el valor más alto que aparece.

public class Ejercicio25 {

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
