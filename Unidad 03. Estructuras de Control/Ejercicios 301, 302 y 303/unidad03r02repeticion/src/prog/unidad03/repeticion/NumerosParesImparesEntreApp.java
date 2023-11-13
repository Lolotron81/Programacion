package prog.unidad03.repeticion;

public class NumerosParesImparesEntreApp {

  public static void main(String[] args) {

    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    System.out.println("PARES O IMPARES EN UN INTERVALO");
    
    // Pedimos los dos intervalos
    System.out.print("Introduce el número de comienzo del intervalo: ");
    int comienzoIntervalo = Integer.parseInt(sc.nextLine());
    System.out.print("Introduce el número de fin del intervalo: ");
    int finIntervalo = Integer.parseInt(sc.nextLine());
    
    // Comprobamos que el comienzo del intervalo no sea mayor que el final.
    // Si lo es el programa finalizará.
    if (comienzoIntervalo > finIntervalo) {
      System.out.println("Error. El número de inicio (" + comienzoIntervalo + ") deber ser"
          + " menor o igual al del final (" + finIntervalo + "). Fin del programa.");
    }
    
    // Hacemos un ciclo que vaya recorriendo la lista de números desde el comienzo
    // hasta el final del intervalo
    for (int i = comienzoIntervalo; i <= finIntervalo; i++) {
      // Comprobamos si el número es par o impar.
      if (i % 2 == 0) {
        System.out.println("El número " + i + " es par");
      } else {
        System.out.println("El número " + i + " es impar");
      }
    }
    
    sc.close();
  }

}
