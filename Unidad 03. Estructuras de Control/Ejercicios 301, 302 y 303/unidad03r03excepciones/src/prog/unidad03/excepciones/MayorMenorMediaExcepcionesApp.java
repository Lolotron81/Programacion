package prog.unidad03.excepciones;

public class MayorMenorMediaExcepcionesApp {

  public static void main(String[] args) {

    System.out.println("MAYOR, MENOR Y MEDIA (A PRUEBA DE USUARIOS MALICIOSOS");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Creamos las variables para pedir los valores al usuario.
    int cantidadNumeros = 0;
    double numeroIntroducido = 0;
    // Creamos una variable control para cambiar la condición de la estructura Do-While
    boolean bandera;
    // Creamos tres variables para almacenar los números mayor y menor y la media total
    double numeroMayor = 0;
    double numeroMenor = 0;
    double mediaTotal = 0;
    
    // Creamos una estructura Do-While para pedir al usuario la cantidad de números que va a introducir más adelante
    // Le añadimos una estructura try-catch para capturar las excepciones en caso de que se introduzcan valores erróneos
    do {
      try {
        System.out.print("¿Cuántos números desea introducir?: ");
        cantidadNumeros = Integer.parseInt(sc.nextLine());
        bandera = true;
      } catch (NumberFormatException excepcion) {
        System.out.println("El valor introducido no es un número entero correcto. Inténtelo de nuevo");
        bandera = false;
      }
    } while (bandera == false);
    
    // Creamos una estructura if-else para contemplarla posibilidad de que el usuario introduzca cero como valor para
    // la cantidad de números.
    if (cantidadNumeros > 0) {
      // Pedimos al usuario el primero de la cantidad de números que va a introducir y almacenamos dicho valor en las variables de máximo
      // y mínimo
      do {
        try {
          System.out.print("Introduce el número 1: ");
          numeroIntroducido = Double.parseDouble(sc.nextLine());
          bandera = true;
        } catch (NumberFormatException excepcion) {
          System.out.println("El valor introducido no es un número real correcto. Inténtelo de nuevo");
          bandera = false;
        }
      } while (bandera == false);
      numeroMayor = numeroIntroducido;
      numeroMenor = numeroIntroducido;
      mediaTotal += numeroIntroducido;
      
      // Creamos una estructura for para ir pidiendo los números
      for (int i = 2; i <= cantidadNumeros; i++) {
        do {
          try {
            System.out.print("Introduce el número " + i + ": ");
            numeroIntroducido = Double.parseDouble(sc.nextLine());
            bandera = true;
          } catch (NumberFormatException error) {
            System.out.println("El valor introducido no es un número real correcto. Inténtelo de nuevo");
            bandera = false;
          }
        } while (bandera == false);
        
        // Creamos una estructura if para almacenar el número mayor
        if (numeroIntroducido > numeroMayor) {
          numeroMayor = numeroIntroducido;
        }
        // Creamos una estructura if para almacenar el número menor
        if (numeroIntroducido < numeroMenor) {
          numeroMenor = numeroIntroducido;
        }
        // Almacenamos en la variable mediaTotal la suma de los números introducidos
        mediaTotal += numeroIntroducido;
      }
      
      // Calculamos la media de todos los números introducidos
      mediaTotal = (mediaTotal / cantidadNumeros);
      
      // Mostramos por pantalla el número mayor, menor y la media total
      System.out.println("El mayor de los números introducidos ha sido: " + numeroMayor);
      System.out.println("El menor de los números introducidos ha sido: " + numeroMenor);
      System.out.println("La media de todos los números vale: " + mediaTotal);
    } else {
      System.out.println("Ha introducido un cero. Si la cantidad es cero la media dará error. Fin del programa");
    }
    
    sc.close();
  }

}
