package RecursionEnteros;

//4. public static int sumaDeCuadradosHasta(int n) 
//Devuelve la suma de todos los números elevados al cuadrado entre 1 y n. 
//

public class Ejercicio4 {


	public static int sumaDeCuadradosHasta(int n) {
		if(n==0) {
			return n;
		}
		return n*n + sumaDeCuadradosHasta(n-1);
	}

}


