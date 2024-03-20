package practica0;

//Para el desarrollo de un sistema generador de 
//juegos de palabras cruzadas, se necesita programar
//la siguiente función. Dadas 3 cadenas, a, b y c, 
//se quiere saber si puede colocarse b de manera vertical 
//de modo que a y c se coloquen de manera horizontal 
//atravesando a b. Se necesita también que a esté más 
//arriba que c y tengan al menos un renglón de diferencia. 
//Por ejemplo, a = ”JUGO”, b = ”BUENO”, c = ”ANANA” pueden 
//colocarse como muestra la Figura 1, por lo tanto el método 
//debe devolver Verdadero. En cambio, a = ”JUGO”, b = ”FEO”, 
//c = ”ANANA” no pueden colocarse, y por ende debería devolver 
//Falso. El encabezado del método debe ser 
//static boolean puedenColocarse(String a, String b, String c).

public class Ejercicio23 {

	public static void main(String[] args) {
		
	}
	public static boolean puedenColocarse(String a, String b, String c) {
		if(a.length()==0||b.length()==0||c.length()==0) {
			return false;
		}
		a=a.toUpperCase();
		b=b.toUpperCase();
		c=c.toUpperCase();
		for(int i = 0; i< b.length(); i++) {
			if(a.indexOf(b.charAt(i))!=-1) {
				i++;
				for(int j=i+1; j<b.length();j++) {
					if(c.indexOf(b.charAt(i))!=-1) {
						return true;
					}
					
				}
				return false;
			}
		}
		return false;
	}

}
