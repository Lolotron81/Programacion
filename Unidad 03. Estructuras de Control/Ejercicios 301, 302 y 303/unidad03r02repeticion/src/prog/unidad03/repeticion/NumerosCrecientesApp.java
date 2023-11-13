package prog.unidad03.repeticion;

public class NumerosCrecientesApp {

  public static void main(String[] args) {

    System.out.println("NÚMEROS CRECIENTES");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Pedimos el primer número entero
    System.out.print("Introduce un número entero: ");
    int enteroMayor = Integer.parseInt(sc.nextLine());
    
    // Creamos una variable para almacenar los números que serán mayores que el primer
    // introducido y siguientes
    int almacenadorNumerosMayores;
        
    do {
      // Guardamos en la variable almacén el valor del primer número introducido
      // que al comienzo del programa será el número mayor.
      almacenadorNumerosMayores = enteroMayor;
      // Pedimos el siguiente número al usuario
      System.out.print("Introduce ahora un número mayor que " + almacenadorNumerosMayores 
          + " (Introduce un número menor o igual para terminar): ");
      enteroMayor = Integer.parseInt(sc.nextLine());
      // Comprobamos que el número introducido por el usuario sea mayor o menor que el que ya tenemos
      // almacenado en nuestra variable
      if (enteroMayor <= almacenadorNumerosMayores) {
        System.out.println("El número " + enteroMayor + " no es mayor que el número anterior " 
            + almacenadorNumerosMayores + ". Terminando");
      }
      
      // La condición para permanecer en el ciclo es que el número introducido por el usuario
      // sea mayor que el que tenemos almacenado. En cuanto ésto no se cumpla el bucle ejecutará
      // la comprobación por medio del bloque if y terminará el programa
    } while (enteroMayor > almacenadorNumerosMayores);

    sc.close();
  }

}
