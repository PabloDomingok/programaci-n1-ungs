package resolucion;

import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JFrame;


@SuppressWarnings("serial")
public class Dibujador extends Panel 
{
	private BufferedImage image;
	private JFrame frame;
	private ArrayList<Circulo> cirs = new ArrayList<Circulo>(400);
	private ArrayList<Punto> desde = new ArrayList<Punto>(400);
	private ArrayList<Punto> hasta = new ArrayList<Punto>(400);
	
	/**
	 * Construye un dibujador con el ancho y alto especificados.
	 */
	public Dibujador(int alto, int ancho)
	{
		super();
		inicializar(alto, ancho);
	}

	/**
	 * Construye un dibujador con tamaño por defecto (800 x 800). 
	 */
	public Dibujador(){
		super();
		inicializar(800, 800);
	};
	
	private void inicializar(int alto, int ancho) 
	{
		this.frame = new JFrame("Dibujador");
		frame.addWindowListener(new WindowAdapter(){
		      public void windowClosing(WindowEvent we){
		        System.exit(0);
		      }
		    });
		frame.getContentPane().add(this);
		this.setSize(ancho, alto);
		this.setPreferredSize(getSize());
		frame.pack();
		frame.setVisible(true);
	};
	
	/**
	 * Devuelve el alto del dibujador en píxeles.
	 */
	public int alto()
	{
		return frame.getHeight();
	}
	
	/**
	 * Devuelve el ancho del dibujador en píxeles.
	 */
	public int ancho()
	{
		return frame.getWidth();
	}
	
	/**
	 * Dibuja el circulo c en el dibujador
	 */
	public void dibujar(Circulo c) 
	{
		this.cirs.add(c);
		this.repaint();
	}
	
	/**
	 * Dibuja una línea en el dibujador entre las coordenadas dadas.
	 * @param desde Punto de inicio de la línea
	 * @param hasta Punto de final de la línea
	 */
	public void dibujarLinea(Punto desde, Punto hasta) 
	{
		this.desde.add(desde);
		this.hasta.add(hasta);
		this.repaint();
	}

	/**
	 * Fabrica un dibujador en el cual se carga la imagen dada y se muestra la misma en el dibujador.
	 * @param img
	 */
	static public void dibujar(Imagen img) 
	{
		Dibujador dib = new Dibujador(img.alto, img.ancho);
		dib.cargar(img);
		dib.repaint();		
	}

	
	public void paint(Graphics g) 
	{
		if (image != null) {
			g.drawImage(image, 0, 0, null);
		} else {
			for(Circulo c : cirs) {
				paintCirculo(g, c);
			}
			for(int i = 0; i<desde.size(); i++) {
				g.drawLine((int)desde.get(i).x, (int)desde.get(i).y, (int)hasta.get(i).x, (int)hasta.get(i).y);
			}
			
		}
	}
	
	private void paintCirculo(Graphics g, Circulo c)
	{
		g.drawOval((int)c.centro.x-(int)c.radio, (int)c.centro.y-(int)c.radio, (int)c.radio*2, (int)c.radio*2);
	}
	
	private void cargar(Imagen bmp) 
	{
		image = new BufferedImage(bmp.ancho, bmp.alto,
				BufferedImage.TYPE_INT_RGB);
		for (int i = 0; i < bmp.alto; i++) {
			for (int j = 0; j < bmp.ancho; j++) {
				int rgb = bmp.pixels[i][j].aInt();
				image.setRGB(j, i, rgb);
			}
		}
	}

	
//	// este metodo es privado porque no queremos que lo usen, y que usen en cambio la version estatica para imagenes
//	@SuppressWarnings("unused")	 
//	private void dibujarPrivado(Imagen bmp) 
//	{
//		this.cargar(bmp);
//		this.repaint();		
//	}
//	
}