package RecursionEnteros;

//2. public static void imprimirHasta(int n) 
//Imprime por pantalla los números entre 1 y n (en orden ascendente). 

public class Ejercicio2 {

	public static void imprimirHasta(int n) {
		if(n>0) {
			imprimirHasta(n-1);
			System.out.println(n);
		}
			
	}
}
