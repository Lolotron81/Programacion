package prog.unidad03.repeticion;

public class PositivoNegativoApp {

  public static void main(String[] args) {

    System.out.println("NÚMEROS POSITIVOS Y NEGATIVOS");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Declaramos una variable donde el usuario irá introduciendo los valores que podrán ser
    // positivos, negativos o cero. En caso de éste último el programa terminará o ni siquiera
    // llegará a iniciar. De ahí que el valor que le damos por defecto sea 1;
    int numeroEntero = 1;
    
    // Creamos una estructura while que servirá para controlar que el usuario introduce valores
    // distintos de cero
    while (numeroEntero != 0) {
      System.out.print("Introduce un número entero (0 para terminar): ");
      numeroEntero = Integer.parseInt(sc.nextLine());
      // Creamos una estructura if para comprobar si el valor es positivo o negativo e imprimir 
      // un mensaje por pantalla con la respuesta
      if (numeroEntero > 0) {
        System.out.println("El número " + numeroEntero + " es positivo");
      } 
      if (numeroEntero < 0) {
        System.out.println("El número " + numeroEntero + " es negativo");
      }
    }
   
    sc.close();
  }

}
