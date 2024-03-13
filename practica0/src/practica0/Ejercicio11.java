package practica0;

//Escribir un método static int sumatoriaPares(int n) que devuelve la sumatoria de los números pares desde 2 hasta n.


public class Ejercicio11 {

	
	public static int sumatoriaPares(int n) {
		int suma=0;
		for(int i =0;i<=n;i++) {
			if(i%2==0) {
				suma+=i;
			}
			
		}
		return suma;
	}

}
