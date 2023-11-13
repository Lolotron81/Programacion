package prog.unidad03.seleccion;

public class SituacionAlumnoApp {
  
  public static final double NOTA_MINIMA_APROBAR = 5;

  public static void main(String[] args) {

    /*
     * 12. Crea un programa que solicite las calificaciones de un alumno en las asignaturas
     * de matemáticas y lengua y que muestre un mensaje indicando la situación del alumno
     * para el siguiente curso. Si el alumno no ha suspendido ninguna pasa sin pendientes,
     * si suspende sólo una de las dos pasa con pendientes y si suspende las dos repite.
     * Para aprobar una asignatura el alumno debe tener una calificación de 5 ó más
     * en dicha asignatura.
     */
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    System.out.print("Introduzca la nota de Matemáticas: ");
    double notaMates = Double.parseDouble(sc.nextLine());
    System.out.print("Introduzca la nota de Lenguaje y Literatura: ");
    double notaLenguaje = Double.parseDouble(sc.nextLine());
    
    if ((notaMates >= NOTA_MINIMA_APROBAR) && (notaLenguaje >= NOTA_MINIMA_APROBAR)) {
      System.out.println("El alumno promociona sin asignaturas pendientes");
    } else if ((notaMates >= NOTA_MINIMA_APROBAR) && (notaLenguaje < NOTA_MINIMA_APROBAR)) {
      System.out.println("El alumno promociona con una asignatura pendiente");
    } else if ((notaMates < NOTA_MINIMA_APROBAR) && (notaLenguaje >= NOTA_MINIMA_APROBAR)) {
      System.out.println("El alumno promociona con una asignatura pendiente.");
    } else {
      System.out.println("El alumno debe repetir el curso.");
    }
    
    sc.close();
  }

}
