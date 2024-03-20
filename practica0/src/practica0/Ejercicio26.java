package practica0;

//Escribir un método static int maximoIndice(int[] a) 
//que dado un arreglo de enteros no vacío,
//devuelve el índice del valor más alto que aparece.

public class Ejercicio26 {


	public static int maximoIndice(int[] a) {
		int b=a[0];
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>b) {
				b=a[i];
				c=i;
			}
		}
		return c;
		
	}

}



