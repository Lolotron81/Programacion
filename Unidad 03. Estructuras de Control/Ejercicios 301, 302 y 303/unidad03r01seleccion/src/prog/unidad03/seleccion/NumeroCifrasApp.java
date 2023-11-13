package prog.unidad03.seleccion;

public class NumeroCifrasApp {
  
  public static final int UNA_CIFRA = 0;
  public static final int DOS_CIFRAS = 10;
  public static final int TRES_CIFRAS = 100;
  public static final int MAS_CIFRAS = 1000;

  public static void main(String[] args) {

    /*
     * 9. Crea un programa que solicite un número entero por teclado y que 
     * muestre un mensaje por pantalla indicando si tiene una cifra, 2 cifras, 
     * 3 cifras o más de tres cifras.
     */
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
//    System.out.print("Introduzca un número entero: ");
//    int numero = Integer.parseInt(sc.nextLine());
//    String numeroContador = String.valueOf(numero);
//    System.out.println("El número " + numero + " tiene " 
//            + numeroContador.length() + " cifras.");
      
    System.out.print("Introduzca un número entero: ");
    int numeroEntero = Integer.parseInt(sc.nextLine());
    
    if ((numeroEntero >= UNA_CIFRA) && (numeroEntero < DOS_CIFRAS)) {
      System.out.println("El número " + numeroEntero + " tiene 1 cifra.");
    } else if ((numeroEntero >= DOS_CIFRAS) && (numeroEntero < TRES_CIFRAS)) {
      System.out.println("El número " + numeroEntero + " tiene 2 cifras.");
    } else if ((numeroEntero >= TRES_CIFRAS) && (numeroEntero < MAS_CIFRAS)) {
      System.out.println("El número " + numeroEntero + " tiene 3 cifras.");
    } else {
      System.out.println("El número " + numeroEntero + " tiene más de 3 cifras");
    }
    
    sc.close();
  }

}
