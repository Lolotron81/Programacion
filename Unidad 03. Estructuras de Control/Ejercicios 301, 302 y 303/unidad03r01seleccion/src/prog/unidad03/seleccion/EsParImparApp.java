package prog.unidad03.seleccion;

public class EsParImparApp {

  public static void main(String[] args) {

    /* 
     * 6. Crea un programa que lea un número entero por teclado y 
     * muestre un mensaje indicando si el número es par o impar
     */
    
    // Nombre del Programa
    System.out.println("PAR O IMPAR");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    System.out.print("Introduzca un número entero: ");
    int numeroEntero = Integer.parseInt(sc.nextLine());
    
    if ((numeroEntero % 2) == 0) {
      System.out.println("El número " + numeroEntero + " es PAR.");
    } else {
      System.out.println("El número " + numeroEntero + " es IMPAR.");
    }
    
    sc.close();
  }

}
