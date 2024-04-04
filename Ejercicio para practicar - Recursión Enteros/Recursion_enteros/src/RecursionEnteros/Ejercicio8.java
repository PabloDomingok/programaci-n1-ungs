package RecursionEnteros;

//8. public static boolean esPar(int n) 
//Indica si un número es par o no.
//Observación: no usar el operador de resto, es decir, no vale usar n % 2 == 0.

public class Ejercicio8 {

	public static boolean esPar(int a) {
		if(a==0) {
			return true;
		}
		else if(a==1) {
			return false;
		}
		else {
			return esPar(a-2);
		}
		
			
	}
		
}


