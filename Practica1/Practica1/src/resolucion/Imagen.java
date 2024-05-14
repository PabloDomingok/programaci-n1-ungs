package resolucion;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Imagen {
	Pixel[][] pixels;
	int alto;
	int ancho;
	
	Imagen(String archivo)
	{
		File file= new File(archivo);
		try {
			BufferedImage image = ImageIO.read(file);
			ancho = image.getWidth();
			alto = image.getHeight();
			pixels = new Pixel[alto][ancho];
			for(int i=0; i<alto; i++)
			{
				for(int j=0; j<ancho; j++)
				{
					pixels[i][j]=new Pixel(image.getRGB(j, i));
				}
			}
		} catch (IOException e) {
			System.err.println("No se encontró el archivo " + archivo);
			System.exit(0);
		}
	}


	/**
	 * Guarda la imagen en un archivo según el formato indicado
	 * @param archivo El nombre de archivo, e.g., "lena.bmp"
	 * @param formato El formato de imagen: "bmp", "png", "jpg", etc. 
	 */
	void guardar(String archivo, String formato)
	{
		BufferedImage image = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB);
		for(int i=0; i<alto; i++)
		{
			for(int j=0; j<ancho; j++)
				image.setRGB(j,i, pixels[i][j].aInt());
		}
		
		try {
			ImageIO.write(image, formato, new File(archivo));
		} catch (IOException e) {
			System.err.println("Error al guardar en el archivo " + archivo);
			e.printStackTrace();
		}
	}
	
}
