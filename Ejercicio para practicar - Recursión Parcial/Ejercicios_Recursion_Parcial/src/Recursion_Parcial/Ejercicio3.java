package Recursion_Parcial;

//3.- Escribir una función recursiva 
//public static boolean contieneCantidadDeChar(String s, char c, int n) 
//que retorna true si la cantidad de apariciones del caracter c en s es 
//mayor o igual a n. Si no retorna false. Por ejemplo:
//
//contieneCantidadDeChar ("casa", 'a', 1) debe devolver true.
//contieneCantidadDeChar ("casa", 'a', 2) debe devolver true.
//contieneCantidadDeChar ("casa", 'a', 3) debe devolver false.
//contieneCantidadDeChar ("nombre", 'e', 2) debe devolver false.
//contieneCantidadDeChar ("", 'h', 1) debe devolver false.

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean contieneCantidadDeChar(String s, char c, int n) {
		if(n==0) {
			return true;
		}
		if(s.length()<n) {
			return false;
		}
		if(s.charAt(0)==c) {
			return contieneCantidadDeChar(Resto.resto(s), c, n-1);
		}
		return contieneCantidadDeChar(Resto.resto(s), c, n);
	}

}
