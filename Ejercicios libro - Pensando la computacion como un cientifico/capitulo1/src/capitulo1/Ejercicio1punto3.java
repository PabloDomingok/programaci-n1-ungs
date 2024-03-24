package capitulo1;

////Una buena idea es cometer tantos errores como se te ocurran, de modo que
////puedas ver los mensajes que produce el compilador. A veces el compilador te dirá
////exactamente qué es lo que está mal, y todo lo que tenés que hacer es arreglarlo. A
////veces, sin embargo, el compilador producirá errores engañosos. Poco a poco irás
////desarrollando una intuición de cuándo podés confiar en el compilador y cuándo
////tenés que descubrir el problema por cuenta propia.
////a. Quitar una de las llaves que abren ({).
//
//Quitamos una de las llaves que abre ({), lo que causa un error de sintaxis.
//
////b. Quitar una de las llaves que cierran (}).
//
//Quitamos una de las llaves que cierra (}), lo que también causa un error de sintaxis.
//
////c. En lugar de main, escribí mian.
//
//Cambiamos main por mian, lo que causa que el método no sea el punto de entrada del programa 
//(public static void main(String[] args) es el punto de entrada estándar en Java).
//
////d. Quitar la palabra static.
//
//Quitamos la palabra static, lo que también causa un error de sintaxis.
//
////e. Quitar la palabra public.
//
//Quitamos la palabra public, lo que genera un error de acceso (public es necesario para que el 
//		método main pueda ser accedido desde fuera de la clase).
//
////f. Quitar la palabra System.
//
//Quitamos la palabra System, lo que causa que el compilador no reconozca el objeto System.
//
////g. Reemplazar println por pintln.
//
//Reemplazamos println por prntln, lo que causa un error de sintaxis.
//
////h. Reemplazar println por print. Este es un poco engañoso porque no es un
////error de sintaxis, sino uno de semántica. La sentencia System.out.print es
////válida, pero puede o puede no ser lo que esperás.
//
//Reemplazamos println por print, esto no genera un error de sintaxis, pero puede producir 
//resultados inesperados ya que no habría un salto de línea al final de la salida.
//
////i. Borrá uno de los paréntesis. Agregá uno extra.
//
//Borramos uno de los paréntesis, lo que causa un error de sintaxis, y luego agregamos uno 
//extra, lo que también genera un error de sintaxis.

public class Ejercicio1punto3 {

	
}
