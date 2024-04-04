package RecursionEnteros;

public class Ejercicio9 {


	public static int cantCifras(int a) {
		if (a == 0) {
            return 1;
        } else if (a < 0) {
            return 1 + cantCifras(-a);
        } else if (a < 10) {
            return 1;
        } else {
            return 1 + cantCifras(a / 10);
        }
    }

}

