package EjerciciosStrings;

//1. Hacer una función que tome un String y cuente 
//la cantidad de veces que aparece la letra 'e' ya sea 
//mayúscula o minúscula. Probarla en una función main() 
//de pruebas en un archivo aparte.

public class Ejercicio1 {

	public static void main(String[] args) {
		String palabra="perro";
		System.out.println(contarLetrasE(palabra));
		
	

	}
	public static int contarLetrasE(String palabra) {
		int cont=0;
		for(int i=0; i<palabra.length();i++) {
			if(palabra.charAt(i)=='e') {
				cont++;
			}
		}
		return cont;
	}

}
