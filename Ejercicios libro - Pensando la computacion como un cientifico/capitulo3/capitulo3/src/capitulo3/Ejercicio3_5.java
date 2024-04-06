package capitulo3;

//Ejercicio 3.5
//Muchos cálculos pueden ser expresados de manera concisa usando la operación "multsuma", que toma tres operandos y computa a*b + c. Algunos procesadores incluso proveen una implementación de hardware para esta operación para números de punto flotante.
//a. Crear un nuevo programa llamado Multsuma.java.
//b. Escribir un método llamado multsuma que toma tres doubles como parámetros y que imprime el resultado de multisumarlo.
//c. Escribir un método main que testee multsuma invocándolo con unos pocos parámetros simples, como por ejemplo 1.0, 2.0, 3.0, y después imprima el resultado, que en ese caso debería ser 5.0.
//d. Además, en main, usar multsuma para computar los siguientes valores:
//   - sin π/4 + cos π/4
//   - log 10 + log 20 / 2
//e. Escribir un método llamado caramba que toma un double como parámetro y que usa multsuma para calcular e imprimir xe^(-x) + sqrt(1 - e^(-x)).
//AYUDA: el método de Math para elevar e a una potencia es Math.exp.
//En la última parte, tenés la posibilidad de escribir un método que invoque a otro método que hayas escrito. Cada vez que hagas eso, es una buena idea probar el primer método cuidadosamente antes de que empieces a trabajar en el segundo. De otra manera, podrías encontrarte depurando dos métodos al mismo tiempo, lo cual puede ser muy difícil.
//Uno de los propósitos de este ejercicio es que practiques reconocimiento de patrones: la habilidad de reconocer un problema específico como una instancia de una categoría general de problemas.
//

public class Ejercicio3_5 {


	public class Multsuma {
	    public static void main(String[] args) {
	        // Prueba del método multsuma con valores simples
	        System.out.println("Prueba simple:");
	        multsumaTest(1.0, 2.0, 3.0); // Salida esperada: 5.0
	        
	        // Computando los valores dados en el ejercicio
	        System.out.println("\nComputando valores dados:");
	        double resultado1 = multsuma(Math.sin(Math.PI / 4), Math.cos(Math.PI / 4), 0);
	        System.out.println("sin(pi/4) + cos(pi/4): " + resultado1);

	        double resultado2 = multsuma(Math.log(10), Math.log(20), 0) / 2;
	        System.out.println("(log(10) + log(20)) / 2: " + resultado2);

	        // Prueba del método caramba
	        System.out.println("\nMétodo caramba:");
	        caramba(2.0);
	    }

	    // Método que realiza la operación de multsuma y la imprime
	    public static void multsumaTest(double a, double b, double c) {
	        System.out.println(a + " * " + b + " + " + c + " = " + multsuma(a, b, c));
	    }

	    // Método que realiza la operación de multsuma
	    public static double multsuma(double a, double b, double c) {
	        return a * b + c;
	    }

	    // Método que calcula e imprime la expresión especificada
	    public static void caramba(double x) {
	        double ePowerMinusX = Math.exp(-x);
	        double resultado = multsuma(x, ePowerMinusX, Math.sqrt(1 - ePowerMinusX));
	        System.out.println("caramba(" + x + ") = " + resultado);
	    }
	}


}
