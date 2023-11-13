package prog.unidad03.seleccion;

public class AlumnoApruebaApp {
  
  public static final int NUMERO_EVALUACIONES = 3;

  public static void main(String[] args) {

    /*
     * 10. Crea un programa que solicite las calificaciones de las tres 
     * evaluaciones del curso y muestre un mensaje indicando si el alumno ha aprobado 
     * o no. La nota final del curso es la media de las calificaciones de las 
     * tres evaluaciones.
     */
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    System.out.print("Introduzca la nota de la primera evaluación: ");
    double notaPrimeraEvaluacion = Double.parseDouble(sc.nextLine());
    System.out.print("Introduzca la nota de la segunda evaluación: ");
    double notaSegundaEvaluacion = Double.parseDouble(sc.nextLine());
    System.out.print("Introduzca la nota de la tercera evaluación: ");
    double notaTerceraEvaluacion = Double.parseDouble(sc.nextLine());
    
    double notaMedia = (notaPrimeraEvaluacion + notaSegundaEvaluacion 
        + notaTerceraEvaluacion) / NUMERO_EVALUACIONES;
    
    if (notaMedia >= 5) {
      System.out.println("El alumno ha aprobado con una media de " + notaMedia);
    } else {
      System.out.println("El alumno ha suspendido con una media de " + notaMedia);
    }
    
    sc.close();
  }

}
