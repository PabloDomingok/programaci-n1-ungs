package ejercicios_para_practicar_arrays;

//Implementar una función public static boolean todosDivisores(int[]a, int n), que 
//dado un arreglo de enteros devuelva true si todos los elementos del arreglo son divisores de n.

public class Ejercicio6 {

	public static boolean todosDivisores(int[]a, int n) {
		    int cont=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%n==0) {
				cont++;
				}
			if(cont==a.length) {
				return true;
			}
			
		}
		return false;
		
	}
	
}
