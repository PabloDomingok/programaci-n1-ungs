package practica0;

//Escribir las versiones recursivas de los siguientes métodos 
//de la Sección 3:


public class Ejercicio30 {
	
//a) sumatoria: 
	
	public static int sumatoriaRec(int n) {
		if(n==0) {
			return n;
		}
		else {
			return n +sumatoriaRec(n-1);
		}

			
	}
//b) sumatoriaPares: 
	
			public static int sumatoriaParesRec(int n) {
				if(n==0) {
					return n;
				}
				if (n%2==0){
					return n+sumatoriaParesRec(n-2);
					
				}
				else {
					
				}
				return sumatoriaParesRec(n-1);
		
			}
//c) potencia: 
			
			public static double potenciaRec(double x, int n) {
				if(n==0) {
					return 1;
					
				}
				else {
					return x *potenciaRec(x, n-1);
				}
			}
//d) factorial: 
			
			public static int factorialRec(int n) {
				if(n==0) {
					return 1;
				}
				else {
					return n*factorialRec(n-1);
				}
			}

	}
