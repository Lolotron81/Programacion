package prog.unidad03.repeticion;

public class SumaParesIntervaloApp {

  public static void main(String[] args) {

    System.out.println("SUMA DE PARES EN UN INTERVALO");

    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Creamos dos variables que contengan el principio y el fin del intervalo y le pedimos al usuario
    // que introduzca ambos valores. La introducción de los valores la haremos dentro de una 
    // estructura Do-While para controlar que el usuario no introduzca un fin de intervalo más
    // pequeño que el comienzo
    int comienzoIntervalo = 0;
    int finIntervalo = 0;
    
    // Declaramos una variable para ir almacenando la suma de los valores pares del intervalo
    int sumaPares = 0;
    
    do {
      System.out.print("Introduce el número de comienzo del intervalo: ");
      comienzoIntervalo = Integer.parseInt(sc.nextLine());
      System.out.print("Introduce el número de fin del intervalo: ");
      finIntervalo = Integer.parseInt(sc.nextLine());
      
      //Por medio de una estructura if controlaremos que el fin del intervalo no sea más pequeño
      // que el comienzo y si lo fuera avisaremos al usuario de su error
      if (comienzoIntervalo > finIntervalo) {
        System.out.println("Error. El número de inicio (" + comienzoIntervalo + ") debe ser "
            + "menor o igual al de final (" + finIntervalo + "). Inténtelo de nuevo.");
      }
      
    } while (comienzoIntervalo > finIntervalo);
    
    // Creamos una estructura for para recorrer todos los valores que comprende el intervalo definido
    // y vamos a ir sumando los que sean pares en la variable suma
    for (int i = comienzoIntervalo; i <= finIntervalo; i++) {
      if (i % 2 == 0) {
        sumaPares = (sumaPares + i);
      }
    }
    
    // Mostramos por pantalla el resultado de sumar todos los números pares que se encuentran
    // dentro del intervalo
    System.out.println("La suma de los números pares comprendidos entre " + comienzoIntervalo 
        + " y " + finIntervalo + " vale " + sumaPares);
    
    sc.close();
  }

}
