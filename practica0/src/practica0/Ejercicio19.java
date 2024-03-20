package practica0;

//Una palabra se dice que es "abecedaria" si las letras en la palabra aparecen en orden alfabético.
//Por ejemplo, las siguientes son todas palabras abecedarias del idioma castellano.
//
//1. Describí un algoritmo para decidir si una palabra dada es abecedaria, asumiendo que la misma contiene sólo letras minúsculas.
//2. Implementar el algoritmo en un método static boolean esAbecedaria(String s).
//3. ¿Funciona el algoritmo si le pasamos como parámetro 'ágil'? En caso negativo, ¿por qué te parece que puede ser? ¿Cómo lo solucionarías?

public class Ejercicio19 {
	
//Ejercicio 2	
	
	public static void main(String[] args) {
		String s="ágil";
		System.out.println(abecedaria(s));
		
	}

//Ejercicio 1
	public static boolean abecedaria(String s) {
		String a = s.toLowerCase();
		for(int i = 0; i<a.length()-1; i++) {
			if(a.charAt(i)>a.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}
//Ejercicio 3	Preguntar!!

}
