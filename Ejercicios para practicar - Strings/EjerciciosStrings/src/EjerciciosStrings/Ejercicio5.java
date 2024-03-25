package EjerciciosStrings;

//5. Implementar la función 
//public static boolean esPrefijo(String prefijo, String s) 
//que consulta si el string prefijo 
//coincide con los primeros caracteres de s.

public class Ejercicio5 {

	public static boolean esPrefijo(String prefijo, String s) {
		for(int i=0; i<prefijo.length();i++) {
			if(prefijo.charAt(i)!=s.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}
