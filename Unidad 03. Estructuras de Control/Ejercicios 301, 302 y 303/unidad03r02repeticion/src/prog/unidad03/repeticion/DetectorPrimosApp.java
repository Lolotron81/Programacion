package prog.unidad03.repeticion;

public class DetectorPrimosApp {

  public static void main(String[] args) {

    System.out.println("DETECTOR DE NÚMEROS PRIMOS");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
     
    // Pedimos el número que vamos a evaluar si es primo o no
    System.out.print("Introduce un número entero mayor que 1 para ver si es primo o no: ");
    int numeroPrimoNoPrimo = Integer.parseInt(sc.nextLine());
    
    // Creamos un contador para los divisores del número "primo o no"
    int contadorDivisores = 0;
    
    // Nos aseguramos que el usuario ha introducido un número mayor que 1
    if (numeroPrimoNoPrimo > 1) {
      // Creamos un bucle que parte desde el número 2 pero no lo vamos a incluir en las
      // vueltas porque si se divide por si mismo siempre va a dar un positivo falso
      for (int i = 2; i < numeroPrimoNoPrimo; i++) {
        // Contamos los divisores que vayan apareciendo
        if (numeroPrimoNoPrimo % 2 == 0) {
          contadorDivisores++;
        }
      }
      if (contadorDivisores > 0) {
        System.out.println("El número " + numeroPrimoNoPrimo + " NO es primo");
      } else {
        System.out.println("El número " + numeroPrimoNoPrimo + " ES primo");
      }
    } else {
      System.out.println("Debes introducir un número mayor que 1");
    }
    
    sc.close();
  }

}
