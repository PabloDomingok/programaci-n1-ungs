package RecursionEnteros;

//7. public static int cantidadPrimosEntre(int n, int m) 
//Calcula la cantidad de números primos que hay entre n y m.
//Observación: Asumir que se tiene una función que indica si un número es primo o no (i.e., hacerla antes!) 
//Asumir que m >= n.

public class Ejercicio7 {

	public static int cantidadPrimosEntre(int n, int m) {
		if(m<n) {
			return 0;
		}
		else {
			return(esPrimo(n)?1:0)+cantidadPrimosEntre(n+1, m);
		}
	}
	public static boolean esPrimo(int a) {
		if(a==1 || a==0) {
			return false;
		}
		 int cont =0;
		 for(int i=2; i<=a;i++) {
			 if(a%i==0) {
				 cont++;
			 }
			 if(cont>1) {
				 return false;
			 }
		 }
		 return true;
	}
		     
}
