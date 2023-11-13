package prog.unidad01;

public class PotenciaCircuitoElectrico {
  
  // Creamos una variable constante para almacenar la resistencia del circuito
  public static final double RESISTENCIA = 4;

  public static void main(String[] args) {

    /* 23. Considerando un circuito eléctrico que tiene una resistencia de 4 ohmios, se desea calcular la potencia que consume el mismo.
     * Para calcular la potencia de un circuito eléctrico necesitamos conocer el voltaje y la intensidad de dicho circuito. El voltaje podemos
     * preguntarlo pero para calcular la intensidad usaremos la fórmula de I = V / R siendo R la resistencia. Para calcular la potencia usaremos 
     * la fórmula de la potencia es P = V * I siendo el voltaje Voltios y la intensidad Amperios.
    */
    
    // Nombre del Programa
    System.out.println("CÁLCULO DE POTENCIA EN UN CIRCUITO ELÉCTRICO");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Pedimos al usuario que introduzca el voltaje del circuito
    System.out.print("¿Qué voltaje tiene el circuito?: ");
    double voltaje = Double.parseDouble(sc.nextLine());
    
    // Creamos una variable para calcular y almacenar la intensidad
    double intensidad = voltaje / RESISTENCIA;
    
    // Creamos una variable para calcular y almacenar la potencia
    double potencia = voltaje * intensidad;
    
    // Mostramos por pantalla los valores
    System.out.println("Tenemos un circuito con un voltaje de " + voltaje + " voltios que cuenta con una resistencia de " + RESISTENCIA 
        + " ohmios. Estos valores nos dan una intensidad de " + intensidad + " amperios y una potencia de " + potencia + " vatios.");
    
    sc.close();
  }

}
