package resolucion;

public class Main {

	public static void main(String[] args) {
		Fraccion fraccion1=new Fraccion(4,5);
		Fraccion fraccion2=new Fraccion(2,3);
		Fraccion resultado = Fraccion.suma(fraccion1, fraccion2);
//		resultado.imprimir();
		Punto punto1=new Punto(12,15);
		Punto punto2=new Punto(32,25);
		double a=punto1.distancia(punto1,punto2);
		System.out.println(a);
		
	}

}
