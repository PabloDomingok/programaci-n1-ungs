package practica0;

//Escribir un método static void imprimirFecha(int dia, int mes, int anio) que imprime la
//fecha pasada como parámetro en formato del estilo “5 de Julio de 2030”.


public class Ejercicio9 {
	

	public static void  imprimirFecha(int dia, int mes, int anio){
		String nombreMes;
		switch(mes) {
		 case 1:
             nombreMes = "enero";
             break;
         case 2:
             nombreMes = "febrero";
             break;
         case 3:
             nombreMes = "marzo";
             break;
         case 4:
             nombreMes = "abril";
             break;
         case 5:
             nombreMes = "mayo";
             break;
         case 6:
             nombreMes = "junio";
             break;
         case 7:
             nombreMes = "julio";
             break;
         case 8:
             nombreMes = "agosto";
             break;
         case 9:
             nombreMes = "septiembre";
             break;
         case 10:
             nombreMes = "octubre";
             break;
         case 11:
             nombreMes = "noviembre";
             break;
         case 12:
             nombreMes = "diciembre";
             break;
         default:
             nombreMes = "mes invalido";
             break;
     }

     System.out.println(dia + " de " + nombreMes + " de " + anio);
 }

	}


