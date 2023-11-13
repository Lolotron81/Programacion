package prog.unidad03.excepciones;

public class NumeroSeguroCansinoApp {

  public static void main(String[] args) {

    System.out.println("INTRODUCCIÓN DE NÚMERO SEGURO CANSINO");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Creamos una variable donde almacenar el número entero
    int numeroEntero = 0;
    
    // Creamos una variable booleana para cambiar el estado de la condición de la estructura
    boolean cambiarCondicion;
    
    // Creamos una estructura Do-While para pedir nuevamente el número en caso de introducir algo distinto de un número entero
    do {
      try {
        System.out.print("Introduce un número entero: ");
        numeroEntero = Integer.parseInt(sc.nextLine());
        cambiarCondicion = true;
        System.out.println("El número correctamente introducido es " + numeroEntero);
      } catch (NumberFormatException e) {
        System.out.println("El dato introducido no es un número válido");
        cambiarCondicion = false;
      }
    } while (cambiarCondicion == false);

    sc.close();
  }

}
