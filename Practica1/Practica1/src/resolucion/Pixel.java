package resolucion;

public class Pixel {
	int rojo;
	int verde;
	int azul;
	
	public Pixel(int rgb) {
		this.rojo = (rgb & 0x00ff0000) >> 16;
	    this.verde = (rgb & 0x0000ff00) >> 8;
	    this.azul = rgb & 0x000000ff;
	}
	
	int aInt()
	{
		int rgb = 0;
		rgb += this.rojo;
		rgb = rgb << 8;
		rgb += this.verde;
		rgb = rgb << 8;
		rgb += this.azul;
		return rgb;	
	}

	
}
