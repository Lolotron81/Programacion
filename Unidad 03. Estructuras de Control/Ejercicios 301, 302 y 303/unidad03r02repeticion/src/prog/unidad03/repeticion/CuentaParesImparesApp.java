package prog.unidad03.repeticion;

public class CuentaParesImparesApp {

  public static void main(String[] args) {

    System.out.println("CUENTA PARES O IMPARES");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Se pide la cantidad de números que se van a introducir.
    System.out.print("¿Cuántos números se desea introducir?: ");
    int cantidadNumeros = Integer.parseInt(sc.nextLine());
    
    // Declaramos las variables para poder usarlas a lo largo de todo el programa.
    // Creamos una para almacenar el número introducido y dos contadores para almacenar
    // los pares y los impares.
    int numeroIntroducido = 0;
    int contadorPares = 0;
    int contadorImpares = 0;
    
    // Creamos un ciclo for para pedir la cantidad de números que el usuario ha definido
    for (int i = 1; i <= cantidadNumeros; i++) {
      System.out.print("Introduce el número " + i + ": ");
      numeroIntroducido = Integer.parseInt(sc.nextLine());
      // Comprobamos si el número es par o impar
      if (numeroIntroducido % 2 == 0) {
        System.out.println("El número " + numeroIntroducido + " es par");
        contadorPares++;
      } else {
        System.out.println("El número " + numeroIntroducido + " es impar");
        contadorImpares++;
      }
    }
    // Sacamos por pantalla la cantidad de números pares e impares que se han introducido
    // y un mensaje que despide al programa.
    System.out.println("Se han introducido " + contadorPares + "números pares "
        + "y " + contadorImpares + " números impares");
    System.out.println("Fin del programa");
    
    sc.close();
  }

}
