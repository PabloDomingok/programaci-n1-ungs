package practica0;

//Escribir un método static int sumatoria(int n) que devuelve la sumatoria de los números
//desde 1 hasta n.

public class Ejercicio10 {

	public static int sumatoria(int n) {
		int suma= 0;
		for(int i=1; i<=n; i++) {
			suma += i;
		}
		return suma;
		
		}
	

}
