package EjerciciosStrings;

//Implementar la función public static boolean esPrefijoDesde(String prefijo, String s, int posicion) 
//que retorna true si el string prefijo coincide con los primeros caracteres de s a partir de la posición pasada como parámetro.


public class Ejercicio6 {


	public static boolean esPrefijoDesde(String prefijo,String s2, int posicion) {
		for(int i=0;i<prefijo.length();i++) {
			if(prefijo.charAt(i)==s2.charAt(posicion+i)) {
				return true;
			}
		}
		return false;
		
	}
	
}
