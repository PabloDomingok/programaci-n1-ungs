package resolucion;

public class Main {

	public static void main(String[] args) {
		Fraccion fraccion1=new Fraccion(4,5);
		Fraccion fraccion2=new Fraccion(2,3);
		Fraccion resultado = Fraccion.suma(fraccion1, fraccion2);
		resultado.imprimir();
		
			
	}

}
