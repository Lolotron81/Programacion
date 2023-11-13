package prog.unidad03.repeticion;

public class CuentaPositivosApp {

  public static void main(String[] args) {

    System.out.println("CONTADOR DE POSITIVOS");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Declaramos una variable donde iremos almacenando el valor que el usuario nos introducirá,
    // que puede ser positivo, negativo o cero. En caso de ser negativo el programa terminará
    int enteroPositivo = 0;
    
    // Declaramos una variable contador para almacenar la cantidad de positivos que se introducen
    int contadorPositivos = 0;
    
    // Creamos una estructura while que compruebe que el usuario no introduce números negativos
    while (enteroPositivo >= 0) {
      System.out.print("Introduce un número entero positivo o cero (negativo para terminar): ");
      enteroPositivo = Integer.parseInt(sc.nextLine());
      // Creamos una estructura if que vaya incrementando el contador de números positivos cada
      // vez que el usuario introduzca un número positivo o cero
      if (enteroPositivo >= 0) {
        contadorPositivos++;
      } 

    }
    
    // Crearemos una estructura if para que en cuanto el usuario introduzca un número negativo
    // mostremos por pantalla el número de positivos que ha introducido
    if (contadorPositivos >= 1) {
      System.out.println("Has introducido " + contadorPositivos + " números positivos");
    }
    
    sc.close();
  }

}
