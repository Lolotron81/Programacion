package prog.unidad01;

public class ConversorEurosPesetas {
  
  // Creamos una variable donde almacenaremos el valor de un euro en pesetas
  public static final double VALOR_EURO_EN_PESETAS = 166.386;

  public static void main(String[] args) {

    /* 2. Realiza un convertidor de euros a pesetas (sabiendo que un euro vale
     * 166.386 pesetas. La cantidad de euros debe estar almacenada en una variable
     * llamada euros.
    */
    
    // Nombre del Programa
    System.out.println("CONVERSOR DE EUROS A PESETAS");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    // Solicitamos al usuario que introduzca una cantidad y creamos una variable donde almacenar dicha cantidad
    System.out.print("Introduzca la cantidad de pesetas que quiere convertir a euros: ");
    double euros = Double.parseDouble(sc.nextLine());
    // Creamos una variable donde almacenar la cantidad en pesetas convertida a euros
    double pesetas = (euros * VALOR_EURO_EN_PESETAS);
    // Mostramos por pantalla el cambio
    System.out.println(euros +" euros convertidos a pesetas son " + pesetas + " pesetas."); 
    sc.close();
  }

}
