package RecursionEnteros;

//3. public static void imprimirDesde(int n) 
//Imprime por pantalla los números entre 1 y n (en orden descendente). 

public class Ejercicio3 {


		public static void imprimirDesde(int n) {
		     if(n>0) {
		    	 System.out.println(n);
		    	 imprimirDesde(n-1);
		     }
	}

}
