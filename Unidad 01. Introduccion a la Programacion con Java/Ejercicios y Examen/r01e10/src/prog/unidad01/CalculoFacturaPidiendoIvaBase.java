package prog.unidad01;

public class CalculoFacturaPidiendoIvaBase {

  public static void main(String[] args) {

    /* 10. Escribe un programa que calcule el total de una factura a partir
     * de la base imponible y el iva leidos desde teclado.
    */
    
    // Nombre del Programa
    System.out.println("CÁLCULO DE FACTURA PIDIENDO BASE IMPONIBLE E IVA");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Pedimos al usuario que introduzca la base imponible y el iva para calcular la factura y creamos dos variables para almacenar dichos valores
    System.out.print("Introduzca la base imponible de la factura: ");
    double baseImponible = Double.parseDouble(sc.nextLine());
    System.out.print("Introduzca el porcentaje del iva: ");
    int iva = Integer.parseInt(sc.nextLine());
    
    // Creamos la variable donde almacenaremos el total de la factura y lo mostraremos por pantalla.
    double totalFactura = (((baseImponible * iva) / 100) + baseImponible);
    System.out.println("Con una base imponible de " + baseImponible + " euros y un iva del " + iva + "% tenemos una factura con un total de " 
        + totalFactura + " euros.");
    
    sc.close();
  }

}
