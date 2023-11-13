package prog.unidad01;

public class NotaFinalAsignaturaProgramacion {
  
  // Creamos tres variables constantes para almacenar los porcentajes de los tres criterios para la nota final
  public static final double PORCENTAJE_TEMARIO = 0.55;
  public static final double PORCENTAJE_EXAMEN_FINAL = 0.30;
  public static final double PORCENTAJE_TRABAJO = 0.15;

  public static void main(String[] args) {

    /* 18. Se desea hacer un programa que calcule la nota de una evaluación de un alumno/a de Programación y Computación sabiendo que 
     * la nota se compone de las siguientes partes: 
     * 1. 55% es el promedio de las calificaciones de las tres unidades realizadas durante el trimestre. 
     * 2. 30% es la calificación obtenida en el examen final del trimestre. 
     * 3. 15% es la calificación obtenida en un trabajo expuesto en clase.
    */
    
    // Nombre del Programa
    System.out.println("CÁLCULO DE LA NOTA DE PROGRAMACIÓN BASADA EN CRITERIOS");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Pedimos al usuario las tres notas que ha obtenido en las tres unidades del trimestre y las almacenamos en tres variables
    System.out.print("¿Qué nota ha obtenido el alumno en la primera unidad del trimestre?: ");
    double notaPrimeraUnidad = Double.parseDouble(sc.nextLine());
    System.out.print("¿Qué nota ha obtenido el alumno en la segunda unidad del trimestre?: ");
    double notaSegundaUnidad = Double.parseDouble(sc.nextLine());
    System.out.print("¿Qué nota ha obtenido el alumno en la tercera unidad del trimestre?: ");
    double notaTerceraUnidad = Double.parseDouble(sc.nextLine());
    
    // Creamos una variable donde calculamos y almacenamos la nota de las tres unidades del trimestre
    double notaFinalUnidades = ((notaPrimeraUnidad + notaSegundaUnidad + notaTerceraUnidad) / 3);
    double porcentajeNotaFinalUnidades = (notaFinalUnidades * PORCENTAJE_TEMARIO);
    
    // Pedimos al usuario la nota del examen final
    System.out.print("¿Qué nota ha obtenido el alumno en el examen final?: ");
    double notaExamen = Double.parseDouble(sc.nextLine());
    double porcentajeNotaExamen = (notaExamen * PORCENTAJE_EXAMEN_FINAL);
    
    // Pedimos al usuario la nota del trabajo de clase
    System.out.print("¿Qué nota ha obtenido el alumno en el trabajo expuesto en clase?: ");
    double notaTrabajoExposicion = Double.parseDouble(sc.nextLine());
    double porcentajeNotaTrabajoExposicion = (notaTrabajoExposicion * PORCENTAJE_TRABAJO);
    
    // Creamos una variable donde calcularemos y almacenaremos la nota final
    double notaFinal = (porcentajeNotaExamen + porcentajeNotaFinalUnidades + porcentajeNotaTrabajoExposicion);
    // Mostramos por pantalla las notas
    System.out.println("El alumno ha obtenido en el temario del curso tres notas que son: ");
    System.out.println("Unidad 1: " + notaPrimeraUnidad);
    System.out.println("Unidad 2: " + notaSegundaUnidad);
    System.out.println("Unidad 3: " + notaTerceraUnidad);
    System.out.println("Lo que nos da una nota media de " + notaFinalUnidades + " que valen un " + (int) (PORCENTAJE_TEMARIO * 100) + "% de la nota final");
    System.out.println("Por tanto el alumno tiene en la parte teórica una nota de " + porcentajeNotaFinalUnidades);
    System.out.println("En el examen final el alumno ha obtenido una nota de " + notaExamen + " que vale un " + (int) (PORCENTAJE_EXAMEN_FINAL * 100) 
        + "% de la nota final");
    System.out.println("Por tanto el alumno tiene en el examen final una nota de " + porcentajeNotaExamen);
    System.out.println("En el trabajo expuesto en clase el alumno ha obtenido una nota de " + notaTrabajoExposicion + " que vale un " 
        + (int) (PORCENTAJE_TRABAJO * 100) + "% de la nota final");
    System.out.println("Por tanto el alumno tiene en el trabajo expuesto una nota de " + porcentajeNotaTrabajoExposicion);
    System.out.println("Sumando los tres criterios el alumno obtiene en la asignatura de programación un " + notaFinal);
    
    sc.close();
  }

}
