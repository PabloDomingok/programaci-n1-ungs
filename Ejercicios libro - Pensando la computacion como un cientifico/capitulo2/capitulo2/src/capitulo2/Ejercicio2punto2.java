package capitulo2;

//a. Creá un nuevo programa llamado Hora.java. De ahora en adelante no te
//recordaré que comiences con un pequeño programa ya funcionando pero
//deberías hacerlo.
//
//		import java.time.LocalTime;
//		
//		public class Hora {
//		    public static void main(String[] args) {
//		        // a) Obtener la hora actual
//		        LocalTime horaActual = LocalTime.now();
//
//b. Siguiendo el ejemplo en la Sección 2.6, creá variables llamadas hora, minuto
//y segundo, y asignales valores que sean más o menos la hora actual. Usá un
//reloj de 24 horas, de modo que a las 2pm el valor de hora sea 14.
//
//		//b) Obtener los valores de hora, minuto y segundo
//		int hora = horaActual.getHour(); // Obtener la hora del momento actual
//		int minuto = horaActual.getMinute(); // Obtener el minuto del momento actual
//		int segundo = horaActual.getSecond(); // Obtener el segundo del momento actual
//
//
//c. Hacé que el programa calcule e imprima el número de segundos desde la
//medianoche.
//
//		//c) Calcular e imprimir el número de segundos desde la medianoche
//		int segundosDesdeMedianoche = hora * 3600 + minuto * 60 + segundo; // Convertir la hora a segundos y sumar los minutos y segundos
//		System.out.println("Número de segundos desde la medianoche: " + segundosDesdeMedianoche);
//
//
//d. Hacé que el programa calcule e imprima el número de segundos que le quedan al día.
//
//		// d) Calcular e imprimir el número de segundos que quedan en el día
//		int segundosEnUnDia = 24 * 3600; // Total de segundos en un día
//		int segundosRestantes = segundosEnUnDia - segundosDesdeMedianoche; // Calcular segundos restantes
//		System.out.println("Número de segundos que quedan en el día: " + segundosRestantes);
//		
//
//e. Hacé que el programa calcule e imprima el porcentaje del día que transcurrió.
//		
//		//e) Calcular e imprimir el porcentaje del día que ha transcurrido
//		double porcentajeTranscurrido = (segundosDesdeMedianoche / (double)segundosEnUnDia) * 100; // Calcular porcentaje transcurrido
//		System.out.println("Porcentaje del día transcurrido: " + porcentajeTranscurrido + "%");
//
//
//f. Cambiá los valores de hora, minuto y segundo para que reflejen la hora actual (asumo que transcurrió algo de tiempo), y chequeá que el programa
//funcione correctamente con diferentes valores.
//
//		//f) Cambiar los valores de hora, minuto y segundo para reflejar la hora actual
//		// (asumiendo que ha pasado algún tiempo)
//		// No es posible obtener la hora actual nuevamente ya que puede cambiar mientras se ejecuta el programa,
//		// así que supondremos una hora diferente para probar el cálculo.
//		hora = 18; // Cambiar la hora a 18 (6 PM)
//		minuto = 30; // Cambiar los minutos a 30
//		segundo = 45; // Cambiar los segundos a 45
//		
//		// Recalcular e imprimir los resultados con la nueva hora
//		segundosDesdeMedianoche = hora * 3600 + minuto * 60 + segundo; // Recalcular segundos desde la medianoche
//		System.out.println("\nNuevos resultados:");
//		System.out.println("Número de segundos desde la medianoche: " + segundosDesdeMedianoche);
//		segundosRestantes = segundosEnUnDia - segundosDesdeMedianoche; // Recalcular segundos restantes
//		System.out.println("Número de segundos que quedan en el día: " + segundosRestantes);
//		porcentajeTranscurrido = (segundosDesdeMedianoche / (double)segundosEnUnDia) * 100; // Recalcular porcentaje transcurrido
//		System.out.println("Porcentaje del día transcurrido: " + porcentajeTranscurrido + "%");
//
//El punto de este ejercicio es usar algunas de las operaciones aritméticas, y
//empezar a pensar acerca de entidades compuestas como el tiempo del día, que
//son representadas con múltiples valores. Además, podés llegar a encontrarte con
//problemas calculando porcentajes con enteros, que es la motivación para los números de punto flotante en el siguiente capítulo.
//PISTA: tal vez quieras usar variables adicionales para retener valores temporalmente durante los cálculos. A variables como esta, que son usadas 
//en los cálculos pero nunca impresas, se las suele llamar variables temporales o intermedias.

public class Ejercicio2punto2 {


}
