package practica0;

//Decimos que una cadena de caracteres es un doblete capicúa si la cadena es la concatenación
//de dos cadenas capicúas. Por ejemplo:
//"neuquenoro" es doblete capicúa, ya que es la concatenación de "neuquen" y "oro".
//"banana" es doblete capicúa, ya que es la concatenación de "b" y "anana", ambas capicúas.
//Lo mismo sucede con "eter", ya que es la concatenación de "ete" y "r", ambas capicúas.
//"sanas" es doblete capicúa, ya que es la concatenación de "sanas" y "".
//"nunca" no es doblete capicúa, ya que no hay manera de formarla concatenando dos capicúas.
//Escribir un método static boolean esDoblete(String s) que devuelve true cuando la cadena es
//doblete capicúa y false en caso contrario.

public class Ejercicio24 {


	public static boolean esDoblete(String s) {
		for(int i=0; i<s.length();i++) {
			String p1=s.substring(0,i);
			String p2=s.substring(i);
			if(Ejercicio20.esCapicua(p1)&&Ejercicio20.esCapicua(p2)) {
				return true;
			}
					
		}
		return false;
	}


}
