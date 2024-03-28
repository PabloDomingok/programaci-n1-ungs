package ejercicios_para_practicar_arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		int [] a= {12,32,13,45,23,54,76};
		imprimir(a);
		

	}
	public static void imprimir(int [] a) {
		System.out.print("[");
		for(int i=0; i<a.length-1;i++) {
			System.out.print(a[i]+", ");
		}
		System.out.println(a[a.length-1]+"]");
	}

}
