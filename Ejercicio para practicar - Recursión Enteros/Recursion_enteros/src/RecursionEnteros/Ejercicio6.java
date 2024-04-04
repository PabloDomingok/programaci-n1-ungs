package RecursionEnteros;

//public static int sumaEntre(int n, int m) 
//Calcula la suma de los números que hay entre n y m. Incluyendo a n y a m. Asumir que m >= n. 


public class Ejercicio6 {

	 public static int sumaEntre(int n, int m) {
		 if(m>=n) {
			 return n + sumaEntre(n+1, m);
		 }
		 return 0;
	 }
	 
}
