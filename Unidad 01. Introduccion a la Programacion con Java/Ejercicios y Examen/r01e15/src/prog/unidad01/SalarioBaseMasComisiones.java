package prog.unidad01;

public class SalarioBaseMasComisiones {
  
  // Creamos una variable constante para almacenar la comision
  public static final double COMISION_POR_VENTA = 0.10;

  public static void main(String[] args) {

    /* 15. Un vendedor cobra un salario base y además una comisión del 10% de lo que
     * venda. Haz un programa que calcule lo que ganará el vendedor un mes
     * que ha realizado tres ventas.
    */
    
    // Nombre del Programa
    System.out.println("CÁLCULO DEL SALARIO BASE MÁS COMISIONES");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Pedimos al usuario el salario base y lo almacenamos en una variable
    System.out.print("¿Cuál es el salario base del trabajador?: ");
    double salarioBase = Double.parseDouble(sc.nextLine());
    // Pedimos al usuario el valor de cada venta y creamos tres variables para almacenar las cantidades
    System.out.print("¿Cuál es la cuantía de la primera venta?: ");
    double primeraVenta = Double.parseDouble(sc.nextLine());
    System.out.print("¿Cuál es la cuantía de la segunda venta?: ");
    double segundaVenta = Double.parseDouble(sc.nextLine());
    System.out.print("¿Cuál es la cuantía de la tercera venta?: ");
    double terceraVenta = Double.parseDouble(sc.nextLine());
    // Creamos una variable para almacenar el salario total sumando el salario base y las tres comisiones y lo mostramos por pantalla
    double salarioCompleto = salarioBase + (primeraVenta * COMISION_POR_VENTA) + (segundaVenta * COMISION_POR_VENTA) + (terceraVenta * COMISION_POR_VENTA);
    // Mostramos por pantalla toda la información que hemos obtenido y aprovechamos para calcular la comisión
    System.out.println("El salario base del trabajador es de " + salarioBase + " euros.");
    System.out.println("La primera venta que ha realizado tiene una cuantía de " + primeraVenta + " euros.");
    System.out.println("La segunda venta que ha realizado tiene una cuantía de " + segundaVenta + " euros.");
    System.out.println("La tercera venta que ha realizado tiene una cuantía de " + terceraVenta + " euros.");
    System.out.println("Con una comisión por venta del " + (int) (COMISION_POR_VENTA * 100) + "% el trabajador percibirá un salario de " + salarioCompleto + " euros.");
  
    sc.close();
  }

}
