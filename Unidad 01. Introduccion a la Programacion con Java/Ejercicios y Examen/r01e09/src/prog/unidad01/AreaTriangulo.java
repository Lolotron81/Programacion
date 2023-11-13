package prog.unidad01;

public class AreaTriangulo {

  public static void main(String[] args) {
 
    /* 9. Escribe un programa que calcule el área de un triángulo a partir
     * de los datos aportados por el usuario mediante teclado.
     * Área triángulo = (base x altura) / 2.
    */
    
    // Nombre del Programa
    System.out.println("CÁLCULO DEL ÁREA DE UN TRIÁNGULO");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Solicitamos al usuario que introduzca la base y la altura de un triángulo y creamos dos variables para almacenar los valores
    System.out.print("Introduzca la base del triángulo: ");
    double baseTriangulo = Double.parseDouble(sc.nextLine());
    System.out.print("Introduzca la altura del triángulo: ");
    double alturaTriangulo = Double.parseDouble(sc.nextLine());
    
    // Creamos una variable donde almacenaremos el área del triángulo y lo mostramos por pantalla
    double areaTriangulo = ((baseTriangulo * alturaTriangulo) / 2);
    System.out.println("Un triángulo cuya base es " + baseTriangulo + " cm. y cuya altura es " + alturaTriangulo + " cm. tiene un área de " 
        + areaTriangulo + " cm.");
    
    sc.close();
  }

}
