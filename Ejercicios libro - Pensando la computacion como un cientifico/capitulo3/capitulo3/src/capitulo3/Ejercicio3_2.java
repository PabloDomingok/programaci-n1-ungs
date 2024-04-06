package capitulo3;

public class Ejercicio3_2 {

//	Enunciado del Ejercicio 3.2:
//
//		El objetivo de este ejercicio es practicar la lectura de código y 
//		asegurarte de que entiendas el flujo de ejecución de un programa con múltiples métodos.
//
//		a. ¿Cuál es la salida del siguiente programa? Sé preciso acerca 
//				de dónde hay espacios y dónde hay nuevas líneas.
//
//		AYUDA: Empezá por describir en palabras qué hacen ping y baffle
//		cuando son llamados.
//
//		b. Dibujar un diagrama de la pila que muestre el estado del programa 
//		la primera vez que ping es llamado.
	
	public static void zoop () {
	    baffle ();
	    System.out.print ("Vos zacata ");
	    baffle ();
	}

	public static void main (String[] args) {
	    System.out.print ("No, yo ");
	    zoop ();
	    System.out.print ("Yo ");
	    baffle ();
	}

	public static void baffle () {
	    System.out.print ("pac");
	    ping ();
	}

	public static void ping () {
	    System.out.println (".");
	}
//	
//	a. La salida del programa sería:
//		
//		No, yo pac.
//		Vos zacata pac.
//		Yo pac.

//	Explicación:
//
//		En el método main, se imprime "No, yo", luego 
//		se llama a zoop() y después se imprime "Yo".
//		Dentro de zoop(), se llama a baffle() dos veces 
//		y entre cada llamada se imprime "Vos zacata ".
//		En el método baffle(), se imprime "pac" y luego 
//		se llama a ping(), que imprime "." seguido de una nueva línea.
//	
//	b. Diagrama de la pila la primera vez que se llama al método ping():
	
//	-----------
//	| ping()  |
//	-----------
//	| baffle()|
//	-----------
//	|  main() |
//	-----------
		
//	Explicación:
//
//		main() llama a zoop().
//		zoop() llama a baffle() dos veces.
//		Dentro de baffle(), se llama a ping().
////	
}
