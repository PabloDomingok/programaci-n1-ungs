package practica0;

//Escribir un método static String sinRepetidos(String s) que, 
//dada una cadena, devuelva una nueva cadena donde cada uno de 
//los caracteres que aparecen en s, aparezcan solo una vez. Se 
//debe mantener la posición relativa de los caracteres: para aquellos 
//que se encuentren repetidos puede conservarse cualquiera de sus apariciones. 
//Por ejemplo, para la palabra ‘‘casos’’ puede devolver ‘‘caso’’ o ‘‘caos’’, 
//conservando la primera o la segunda letra 's' respectivamente.

public class Ejercicio22 {

	public static String sinRepetidos(String s){
		String palabra="";
		for(int i=0;i<s.length(); i++) {		
				if(palabra.indexOf(s.charAt(i))==-1){
					palabra+=s.charAt(i);
				}
			}		
		return palabra;		
	}
}	