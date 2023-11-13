package prog.unidad01;

public class MediaTresCalificaciones {
  
  // Creamos una variable constante para almacenar el valor de la nota mínima para aprobar
  public static final double NOTA_MINIMA_PARA_APROBAR = 4.9;

  public static void main(String[] args) {

    /* 26. Crea un programa que solicite las calificaciones de las tres evaluaciones de un curso y muestre el mensaje indicando si
     * el alumno ha aprobado (true) o no (false). La nota final de curso es la media de las calificaciones de las tres evaluaciones.
    */
    
    // Nombre del Programa
    System.out.println("CALIFICACIÓN ALUMNO");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Pedimos al usuario que nos introduzca las notas de las tres evaluaciones y las almacenamos en tres variables
    System.out.print("Introduzca la nota de la primera evaluación: ");
    double primeraEvaluacion = Double.parseDouble(sc.nextLine());
    System.out.print("Introduzca la nota de la segunda evaluación: ");
    double segundaEvaluacion = Double.parseDouble(sc.nextLine());
    System.out.print("Introduzca la nota de la tercera evaluación: ");
    double terceraEvaluacion = Double.parseDouble(sc.nextLine());
    
    // Creamos una variable que calcule y almacene la media total y creamos otra variable booleana que contenga 
    // una expresion para saber si la media da aprobada o no. Mostramos por pantalla el resultado
    double mediaCurso = ((primeraEvaluacion + segundaEvaluacion + terceraEvaluacion) / 3);
    boolean aprobado = mediaCurso >= NOTA_MINIMA_PARA_APROBAR;
    System.out.println("El alumno ha obtenido de nota media un " + mediaCurso + " y se necesita un " + NOTA_MINIMA_PARA_APROBAR 
        + " para aprobar. Por tanto, ¿Ha aprobado? (true para si y false para no): " + aprobado);
    
    sc.close();
  }

}
