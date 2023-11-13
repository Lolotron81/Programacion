package prog.unidad03.seleccion;

public class CalculadoraBasicaApp {

  public static void main(String[] args) {

    /*
     * 3. Crea un programa que sirva como calculadora básica. Primero solicitará 
     * al usuario una operación. El usuario puede responder usando las letras S 
     * para la suma, R para la resta, P para el producto y D para la división. 
     * Las letras pueden ser sólo mayúsculas o sólo minúsculas. Si se introduce una 
     * operación correctamente se solicitarán los dos números reales y se mostrará 
     * por pantalla el resultado.
     */
    
    // Nombre del Programa
    System.out.println("PROGRAMA DE CALCULADORA BÁSICA");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Creamos un pequeño menú con las opciones y pedimos al usuario el tipo de operación que quiere hacer
    System.out.println("S - suma");
    System.out.println("R - resta");
    System.out.println("P - producto o multiplicación");
    System.out.println("D - División");
    System.out.print("Indique la letra de la operación que desea realizar (a ser posible en mayúscula): ");
    String operacion = sc.nextLine();
    
    // Pedimos al usuario los dos operandos
    System.out.print("Introduzca el primer operando: ");
    double primerOperando = Double.parseDouble(sc.nextLine());
    System.out.print("Introduzca el segundo operando: ");
    double segundoOperando = Double.parseDouble(sc.nextLine());
    
    // Creamos una estructura switch para determinar la operación que se va a llevar a cabo
    switch (operacion.toUpperCase()) {
      case "S": 
        System.out.println("El resultado de " + primerOperando + " + " + segundoOperando  
            + " es " + (primerOperando + segundoOperando));
        break;
      case "R": 
        System.out.println("El resultado de " + primerOperando + " - " + segundoOperando  
            + " es " + (primerOperando - segundoOperando));
        break;
      case "P": 
        System.out.println("El resultado de " + primerOperando + " * " + segundoOperando  
            + " es " + (primerOperando * segundoOperando));
        break;
      case "D": 
        System.out.println("El resultado de " + primerOperando + " / " + segundoOperando  
            + " es " + (primerOperando / segundoOperando));
        break;
      default: System.out.println("Ha habido algún error con las operaciones o los operandos.");
    }
    
    sc.close();
  }

}
