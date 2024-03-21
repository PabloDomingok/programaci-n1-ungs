package practica0;

//Escribir un método static double promedio(double[] a) que dado 
//un arreglo de números con
//coma, devuelve el valor del promedio de todos los elementos.


public class Ejercicio29 {

	public static double promedio(double[] a) {
		double b = 0;
		for(int i=0; i<a.length; i++) {
			b+=a[i];
		}
		return b/a.length;
	}
	
}
