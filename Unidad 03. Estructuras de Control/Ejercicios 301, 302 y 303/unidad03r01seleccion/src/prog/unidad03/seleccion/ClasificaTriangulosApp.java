package prog.unidad03.seleccion;

public class ClasificaTriangulosApp {

  public static void main(String[] args) {

    /* 4. Crea un programa que solicite las longitudes de los tres lados de un 
     * triángulo y muestra por pantalla un mensaje indicando si el triángulo 
     * es equilátero, isósceles o escaleno
     * triángulo equilátero: todos los lados son iguales
     * triángulo isósceles: dos lados iguales
     * triángulo escaleno: los tres lados son diferentes
     */
    
    // Nombre del Programa
    System.out.println("PROGRAMA CLASIFICADOR DE TRIÁNGULOS");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Solicitamos los tres lados de un triángulo y los almacenamos en tres variables
    System.out.print("Introduzca el lado 1 del triángulo: ");
    double lado1 = Double.parseDouble(sc.nextLine());
    System.out.print("Introduzca el lado 2 del triángulo: ");
    double lado2 = Double.parseDouble(sc.nextLine());
    System.out.print("Introduzca el lado 3 del triángulo: ");
    double lado3 = Double.parseDouble(sc.nextLine());
    
    // Creamos una estructura if-else para determinar por medio de condiciones el tipo de triángulo según los datos introducidos
    if ((lado1 == lado2) && (lado1 == lado3)) {
      System.out.println("El triángulo es equilátero.");
    } else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
      System.out.println("El triángulo tiene dos lados iguales y por tanto es Isósceles.");
    } else {
      System.out.println("El triángulo es escaleno.");
    }
    
    sc.close();
  }

}
