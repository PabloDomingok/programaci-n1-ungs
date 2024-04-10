package Ejercicios_Strings_Recursion;

//6. Implementar la función recursiva public static boolean esAbecedaria(String s) 
//que indica si s es una palabra "abecedaria". Una palabra se dice que una palabra 
//es "abecedaria" si las letras aparecen en orden alfabético. Por ejemplo, la siguientes 
//son todas palabras abecedarias:
//adios, año, bello, celos, chinos, dijo, dimos, dios, fijos, finos, hijos, hilos, himno.

public class Ejercicio6 {


	public static boolean esAbecedaria(String s) {
		if(s.length()<=1) {
			return true;
			}
		if(s.charAt(0)>=s.charAt(1)) {
			return false;
		}
		
		return esAbecedaria(Resto.resto(s));
				
	}
	

}
