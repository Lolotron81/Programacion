package prog.unidad03.repeticion;

public class NumerosParesImparesEntreExtraApp {

  public static void main(String[] args) {

    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    System.out.println("PARES O IMPARES EN UN INTERVALO");
    
    // Creamos las variables para almacenar el principio y el fin del intervalo
    // al principio del programa para que podamos usarlas a lo largo de todo
    // el código aunque estén las llaves de los bucles.
    int comienzoIntervalo;
    int finIntervalo;
    
    // Por medio de un bucle Do-While comprobamos que los números introducidos por
    // el usuario estén correctos. El comienzo del intervalo debe ser menor al final.
    // En caso de que el usuario introduzca mal el intervalo volverá a pedir los números.
    do {
      
      // Pedimos los números
      System.out.print("Introduce el número de comienzo del intervalo: ");
      comienzoIntervalo = Integer.parseInt(sc.nextLine());
      System.out.print("Introduce el número de fin del intervalo: ");
      finIntervalo = Integer.parseInt(sc.nextLine());
      
      // Mostramos el mensaje de error si el intervalo no está bien definido.
      if (comienzoIntervalo > finIntervalo) {
        System.out.println("Error. El número de inicio (" + comienzoIntervalo + ") deber ser"
            + " menor o igual al del final (" + finIntervalo + "). Inténtelo de nuevo.");
      }
 
    } while (comienzoIntervalo > finIntervalo);
    
    // Creamos el bucle for para recorrer el intervalo
    for (int i = comienzoIntervalo; i <= finIntervalo; i++) {
      // Comprobamos si la posición del intervalo correspondiente es par o impar
      if (i % 2 == 0) {
        System.out.println("El número " + i + " es par");
      } else {
        System.out.println("El número " + i + " es impar");
      }
    }
    
    sc.close();
  }

}
