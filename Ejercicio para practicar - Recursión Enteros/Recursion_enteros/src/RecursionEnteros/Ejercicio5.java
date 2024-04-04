package RecursionEnteros;

//5. public static int potencia(int base, int exp) 
//Calcula base elevado a la exp. 

public class Ejercicio5 {

	public static int potencia(int base, int exp) {
		if (exp==0) {
            return 1; 
        } else {
            return base * potencia(base, exp - 1); 
        }
    }
	

}
