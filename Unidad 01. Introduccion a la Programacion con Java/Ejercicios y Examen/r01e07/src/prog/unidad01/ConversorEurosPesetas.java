package prog.unidad01;

public class ConversorEurosPesetas {
  
  // Creamos una variable donde almacenaremos el valor de un euro en pesetas
  public static final double VALOR_EURO_EN_PESETAS = 166.386;

  public static void main(String[] args) {

    /* 7. Realiza un programa que haga justo lo opuesto del anterior, leyendo
     * la cantidad de euros por teclado.
    */
    
    // Nombre del Programa
    System.out.println("CONVERSOR DE EUROS A PESETAS");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    // Solicitamos al usuario que introduzca una cantidad y creamos una variable donde almacenar dicha cantidad
    System.out.print("Introduzca la cantidad de pesetas que quiere convertir a euros: ");
    double euros = Double.parseDouble(sc.nextLine());
    // Creamos una variable donde almacenar la cantidad en pesetas convertida a euros y mostramos por pantalla el cambio
    double pesetas = (euros * VALOR_EURO_EN_PESETAS);
    System.out.println(euros +" euros son " + pesetas + " pesetas."); 
    sc.close();
  }

}
