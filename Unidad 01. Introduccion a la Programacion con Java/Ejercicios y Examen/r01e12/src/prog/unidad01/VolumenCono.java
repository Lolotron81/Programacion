package prog.unidad01;

public class VolumenCono {
  
  // Creamos una variable constante para almacenar el valor de PI
  public static final double PI = 3.14;

  public static void main(String[] args) {

    /* 12. Escribe un programa que calcule el volumen de un cono.
     * Volumen Cono = (PI x Radio al cuadrado x altura) / 3.
    */
    
    // Nombre del Programa
    System.out.println("CÁLCULO DEL VOLUMEN DE UN CONO");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Pedimos al usuario el radio y la altura del cono y creamos dos variables para almacenar ambos datos
    System.out.print("Introduzca el radio del cono: ");
    double radioCono = Double.parseDouble(sc.nextLine());
    System.out.print("Introduzca la altura del cono: ");
    double alturaCono = Double.parseDouble(sc.nextLine());
    
    // Creamos una variable para almacenar el volumen del cono y lo mostramos por pantalla
    double volumenCono = ((PI * (radioCono * radioCono) * alturaCono) / 3);
    System.out.println("El cono con un radio de " + radioCono + " cm. y una altura de " + alturaCono + " cm. tiene un volumen de " 
        + volumenCono + " centímetros cúbicos");
    
    sc.close();
  }

}
