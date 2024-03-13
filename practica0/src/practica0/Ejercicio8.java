package practica0;

//Escribir un método static void ponerNota(double x, double y) que toma dos números decimales y los promedia. En caso de que el promedio sea mayor o igual a 7, deberá imprimir ‘‘Promocionado’’; si es mayor o igual a 4 pero menor que 7, imprime ‘‘Aprobado’’; y si es menor que 4 imprime ‘‘Debe recuperar’’. Probarla llamándola desde el main con distintos números.
//Luego, pedirle ambos números al usuario (usando nextFloat() del Scanner) para pasárselos a ponerNota.

public class Ejercicio8 {

	public static void main(String[] args) {
		ponerNota(6, 6);

	}
	static void ponerNota(double x, double y) {
		double promedio = (x + y) / 2;
		if (promedio >= 7) {
			System.out.println("Promocionado");
		}
		else if(promedio >=4) {
			System.out.println("Aprobado");
		}
		else {
			System.out.println("Debe recuperar");
		}
	}
	

}
