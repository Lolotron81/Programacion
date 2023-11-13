package prog.unidad03.repeticion;

public class SumaIntervaloApp {

  public static void main(String[] args) {

    System.out.println("SUMA DE UN INTERVALO");

    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    //Creamos dos variables que almacenarán el comienzo y el fin de un intervalo respectivamente
    // y pedimos al usuario que introduzca las cantidades. Lo haremos dentro de una estructura
    // Do-While para que el usuario deba introducir un fin de intervalo mayor que el comienzo
    
    int principioIntervalo;
    int finIntervalo;
    
    //Creamos una variable donde almacenaremos el resultado de ir sumando los números del intervalo
    int suma = 0;
    
    do {
      System.out.print("Introduce el número de comienzo del intervalo: ");
      principioIntervalo = Integer.parseInt(sc.nextLine());
      System.out.print("Introduce el número de fin del intervalo: ");
      finIntervalo = Integer.parseInt(sc.nextLine());
      //Por medio de una estructura if avisaremos al usuario de que ha introducido
      // un fin de intervalo menor que el inicio y que deberá introducir nuevamente
      // los valores
      if (principioIntervalo > finIntervalo) {
        System.out.println("Error. El número de inicio (" + principioIntervalo + ") debe ser " 
            + "menor o igual al de final (" + finIntervalo + "). Inténtelo de nuevo.");
      }
    } while (principioIntervalo > finIntervalo);
    
    // Creamos una estructura for donde estableceremos que se va a repetir un ciclo que va desde
    // el valor introducido como principio del intervalo hasta el valor introducido como 
    // final del intervalo recorriendo todos los valores intermedios
    for (int i = principioIntervalo; i <= finIntervalo; i++) {
      suma = (i + suma); // Esto equivale a suma += i;
    }
    
    // Imprimimos por pantalla el resultado de la suma de todos los números que hay dentro
    // del intervalo determinado por el usuario
    System.out.println("La suma de los números desde el " + principioIntervalo 
        + " hasta " + finIntervalo + " vale " + suma);
    
    sc.close();
  }

}
