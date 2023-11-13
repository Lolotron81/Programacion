package prog.unidad03.seleccion;

public class CalculaImporteApp {
  
  public static final double DESCUENTO = 0.20;

  public static void main(String[] args) {

    /*
     * 11. Un almacén hace un 20% de descuento a los clientes que realicen una compra
     * por importe superior a 100 euros. Crea un programa que solicite el importe original
     * y muestre el importe una vez aplicado el descuento, si aplica.
     */
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    System.out.print("¿De cuánto es el importe de la compra?: ");
    double importe = Double.parseDouble(sc.nextLine());
    
    if (importe > 100) {
      double importeReal = importe - (importe * DESCUENTO);
      System.out.println("Como la compra es superior a 100 euros, la compra " 
          + "tiene un descuento del 20%. El importe a pagar es de " + importeReal + " euros.");
    } else {
      System.out.println("Ha gastado menos de 100 euros y por lo tanto no es candidato " 
          + " a nuestro descuento. El importe a pagar es de " + importe + " euros.");
    }
    
    sc.close();
  }

}
