package prog.unidad01;

public class NumeroEntre20y30 {

  public static void main(String[] args) {

    /* 29. Escribe un programa que solicite un número real e indique por pantalla si el número está comprendido 
     * entre 20 y 30 (incluyendo 20 pero no 30) mostrando el valor true o no lo está (mostrando el valor false).
    */
    
    // Nombre del Programa
    System.out.println("NÚMERO COMPRENDIDO ENTRE 20 Y 30");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Pedimos un número real
    System.out.print("Introduzca un número real: ");
    double numeroReal = Double.parseDouble(sc.nextLine());
    
    // Creamos una variable booleana que contenga una expresión que compruebe si el número introducido está entre 20 y 30 y mostramos por
    // pantalla el resultado siendo true para si y false para no
    boolean estaEnIntervalo = (numeroReal >= 20) && (numeroReal < 30);
    System.out.println("El número " + numeroReal 
        + ", ¿Está dentro del intervalo de números que van desde el 20 (incluido) al 30 (no incluido)? (true para si y false para no): " + estaEnIntervalo);
    
    sc.close();
  }

}
