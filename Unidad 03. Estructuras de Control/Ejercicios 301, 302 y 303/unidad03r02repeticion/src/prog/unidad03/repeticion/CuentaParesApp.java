package prog.unidad03.repeticion;

public class CuentaParesApp {

  public static void main(String[] args) {

    System.out.println("CUENTA PARES");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);

    
    // Declaramos la variable para el número que introducimos en el ciclo for
    // Declaramos otra variable para contar los números pares
    int numeroEntero = 0;
    int contadorPares = 0;
    
    // Pedimos la cantidad de números pares
    System.out.print("¿Cuántos números pares desea introducir?: ");
    int cantidadPares = Integer.parseInt(sc.nextLine());
    
    // Hacemos un bucle para comprobar si se ha introducido la cantidad de números pares
    while (contadorPares != cantidadPares) {
      System.out.print("Introduce un número entero: ");
      numeroEntero = Integer.parseInt(sc.nextLine());
      
      //Vamos comprobando si el número es par y si lo es incrementamos el contador
      if (numeroEntero % 2 == 0) {
        contadorPares++;
        if (contadorPares < cantidadPares) {
          System.out.println("Te quedan " + (cantidadPares - contadorPares) 
              + " números pares por introducir");
        }
      }
    }
    
    // Imprimimos el mensaje de que ya se ha alcanzado el número de pares
    System.out.println("¡Ya has introducido " + cantidadPares + " números pares!");
    
    sc.close();
  }

}