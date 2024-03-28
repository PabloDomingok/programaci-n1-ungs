package EjerciciosStrings;

//Hacer la funcion public static boolean esSubstring(String s1, String s2) 
//que retorna true si y sólo si s1 esta incluido en s2.

public class Ejercicio7 {

    public static boolean esSubstring(String s1, String s2) {
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            int j;
            for (j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) != s2.charAt(i + j)) {
                   
                    break;
                }
            }
            if (j== s1.length()) {
                return true;
            }
        }
        return false;
    }
}
