package practica0;

//Escribir un método static int cantCifras(int n) que devuelve la cantidad de cifras de n.
//Probarlo adecuadamente llamándola desde el main.

public class Ejercicio14 {

	public static void main(String[] args) {
		int a=3000;
		System.out.println(cantCifras(a));

	}
	public static int cantCifras(int n ) {
		if(n==0) {
			return 1;
		}
		int cont=0;
		for(int i=n; i!=0;i/=10) {
			cont++;
		}
		return cont;
	}

}
