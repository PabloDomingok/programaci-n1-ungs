package Recursion_Parcial;

//1.- Escribir una función recursiva public static String repetirLetras(String s) 
//que toma un String s y devuelve un String igual a s pero en el cual se han repetido 
//2 veces todas las vocales que estén seguidas por otra vocal y 3 veces todas las 
//consonantes que estén seguidas por otra consonante. Por ejemplo:
//
//repetirLetras(’’hola’’) debe devolver ’’hola’’ .
//repetirLetras(’’bcd’’) debe devolver ’’bbbcccd’’ .
//repetirLetras(’’abcde’’) debe devolver ’’abbbcccde’’ .
//repetirLetras(’’cuando’’) debe devolver ’’cuuannndo’’ .
//repetirLetras(’’’’) debe devolver ’’’’ .

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static String repetirLetras(String s) {
		if(s.length()<=1) {
			return s;
		}
		if(esVocal(s.charAt(0)) && esVocal(s.charAt(1))) {
			return ""+s.charAt(0)+s.charAt(0)+repetirLetras(Resto.resto(s));
		}
		if(esVocal(s.charAt(0)) && esVocal(s.charAt(1))) {
			return ""+s.charAt(0)+s.charAt(0)+s.charAt(0)+repetirLetras(Resto.resto(s));
		}
		return s.charAt(0)+repetirLetras(Resto.resto(s));
	    }

	public static boolean esVocal(char s) {
		if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u') {
			return true;
		}
		return false;

	}
}
