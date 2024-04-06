package capitulo3;

public class Ejercicio3_4 {

	
//	Considera el siguiente código que imprime una fecha en el formato norteamericano:
	
//	System.out.print("Miércoles, ");
//	System.out.print("Septiembre ");
//	System.out.print(29);
//	System.out.print(", ");
//	System.out.println(2010);
	
//	El objetivo es encapsular este código en un método que tome los componentes 
//	de la fecha como parámetros y lo imprima en el formato norteamericano.
//
//	a. Escribir un método llamado imprimirNorteamericano que toma el día de la 
//	semana, día del mes, mes y año como parámetros y que imprime en el formato norteamericano.
//
//	b. Probar el método invocándolo desde main y pasando argumentos apropiados. 
//	La salida debería verse parecida a esto (excepto que la fecha puede ser diferente):

//	Miércoles, Septiembre 29, 2010

//	c. Una vez que hayas depurado imprimirNorteamericano, escribir otro método llamado 
//	imprimirSudamericano que imprima la fecha en el formato Sudamericano.
	public static void imprimirNorteamericano(String diaSemana, String mes, int diaMes, int año) {
	    System.out.print(diaSemana + ", ");
	    System.out.print(mes + " ");
	    System.out.print(diaMes);
	    System.out.print(", ");
	    System.out.println(año);
	}
	public static void main(String[] args) {
		imprimirNorteamericano("Miércoles", "Septiembre", 29, 2010);

	}
//	Salida esperada:
//		Miércoles, Septiembre 29, 2010
//	c. Método imprimirSudamericano:
	public static void imprimirSudamericano(String diaSemana, int diaMes, String mes, int año) {
	    System.out.print(diaSemana + ", ");
	    System.out.print(diaMes + " de ");
	    System.out.print(mes + " de ");
	    System.out.println(año);
	}
//	Explicación:
//
//		imprimirSudamericano toma los mismos parámetros que imprimirNorteamericano, pero imprime 
//		la fecha en el formato sudamericano.
//		Se imprime el día de la semana, el día del mes, el mes y el año en el orden adecuado para 
//		el formato sudamericano.
//
//	

}
