package practica0;

//Escribir un método static double factorial(int n) que toma un entero positivo n y calcula
//n! (el factorial de n) que se define como el producto de todos los naturales desde 1 hasta n. Por
//ejemplo 5! = 5 × 4 × 3 × 2 × 1 = 120. Ojo: por definición, el factorial de 0, es 1 (0! = 1)



public class Ejercicio13 {
	
	
	public static double factorial(int n) {
		double calculo=1;
		for(int i=1; i<=n;i++) {
			calculo*=i;
		}
		return calculo;
	}
	

}
