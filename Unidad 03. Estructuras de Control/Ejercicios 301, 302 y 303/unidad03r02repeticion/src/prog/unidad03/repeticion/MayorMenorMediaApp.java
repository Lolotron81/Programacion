package prog.unidad03.repeticion;

public class MayorMenorMediaApp {

  public static void main(String[] args) {

    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Creamos la variable que almacenará los números introducidos y la variable
    // que usaremos como contador para calcular la media. Además crearemos dos variables
    // que almacenarán el mayor y el menor.
    double numeroIntroducido = 0;
    double sumaValoresIntroducidos = 0;
    double mediaValoresIntroducidos = 0;
    double mayorIntroducido = 0;
    double menorIntroducido = 0;
    
    // Pedimos la cantidad de números que se van a introducir
    System.out.print("¿Cuántos números deseas introducir?: ");
    double cantidadNumeros = Double.parseDouble(sc.nextLine());
    
    // Pedimos el primer número y lo almacenaremos en las variables mayor y menor
    System.out.print("Introduce el número 1: ");
    numeroIntroducido = Double.parseDouble(sc.nextLine());
    mayorIntroducido = numeroIntroducido;
    menorIntroducido = numeroIntroducido;
    sumaValoresIntroducidos = numeroIntroducido + sumaValoresIntroducidos;
    
    // Hacemos un bucle para ir pidiendo los números hasta completar la cantidad introducida
    // pero empezando el bucle desde el segundo número ya que el primero ya lo hemos pedido
    for (int i = 2; i <= cantidadNumeros; i++) {
      System.out.print("Introduce el número " + i + ": ");
      numeroIntroducido = Double.parseDouble(sc.nextLine());
      sumaValoresIntroducidos = numeroIntroducido + sumaValoresIntroducidos;
      
      // Comprobamos que el número introducido es mayor y menor que el que ya tenemos
      // almacenado y lo reemplazamos en caso afirmativo
      if (numeroIntroducido > mayorIntroducido) {
        mayorIntroducido = numeroIntroducido;
      }
      
      if (numeroIntroducido < menorIntroducido) {
        menorIntroducido = numeroIntroducido;
      }
    }
    
    // Calculamos la media
    mediaValoresIntroducidos = (sumaValoresIntroducidos / cantidadNumeros);
    
    // Imprimimos los resultados
    System.out.println("El mayor de los números introducidos ha sido: " + mayorIntroducido);
    System.out.println("El menor de los números introducidos ha sido: " + menorIntroducido);
    System.out.println("La media de todos los números vale: " + mediaValoresIntroducidos);
    
    sc.close();
  }

}
