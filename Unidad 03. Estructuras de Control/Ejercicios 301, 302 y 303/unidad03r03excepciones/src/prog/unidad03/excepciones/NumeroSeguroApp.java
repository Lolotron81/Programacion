package prog.unidad03.excepciones;

public class NumeroSeguroApp {

  public static void main(String[] args) {

    System.out.println("INTRODUCCIÓN DE NÚMERO SEGURO");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Creamos una variable para almacenar el número entero
    int numeroEntero;
    
    // Pedimos el número entero al usuario y hacemos control de excepciones por medio de una estructura try-catch para controlar
    // que el usuario no introduzca un valor correcto
    try {
      System.out.print("Introduce un número entero: ");
      numeroEntero = Integer.parseInt(sc.nextLine());
      System.out.println("El número correctamente introducido es " + numeroEntero);
    } catch (NumberFormatException e) {
      System.out.println("El dato introducido no es un número valido");
    }
            
    sc.close();
  }

}
