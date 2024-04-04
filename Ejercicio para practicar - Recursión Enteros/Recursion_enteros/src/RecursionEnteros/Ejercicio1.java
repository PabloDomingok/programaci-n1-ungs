package RecursionEnteros;

//1. public static int sumaDesdeUnoHasta(int n)
//Devuelve la suma de todos los números entre 1 y n. 

public class Ejercicio1 {

	public static int sumaDesdeUnoHasta(int n) {
		if(n==0) {
			return n;
		}
		return n + sumaDesdeUnoHasta(n-1);
	}

}
