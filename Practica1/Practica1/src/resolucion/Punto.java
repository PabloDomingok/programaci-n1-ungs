package resolucion;

public class Punto {
	double x;
	double y;
	
	public Punto() {
		this.x=0;
		this.y=0;
	}
	public Punto(double x, double y) {
		this.x=x;
		this.y=y;
	}
	public void imprimir() {
		System.out.println("("+this.x+","+this.y+")");
	}
	public void desplazar(double desp_x, double desp_y) {
		this.x+=desp_x;
		this.y+=desp_y;
	}
	public double distancia(Punto p1, Punto p2) {
		double dist=Math.sqrt(Math.pow(p2.x-p1.x, 2)+Math.pow(p2.y-p1.y, 2));
		return dist;
	}
}
