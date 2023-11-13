package prog.unidad03.repeticion;

public class CalculaDivisoresApp {

  public static void main(String[] args) {

    System.out.println("DIVISORES DE UN NÚMERO");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Pedimos el número al que vamos a buscar los divisores
    System.out.print("Introduce un número entero para que calcule sus divisores: ");
    int numeroDivisible = Integer.parseInt(sc.nextLine());
    
    // Declaramos una variable donde almacenaremos el resultado de la división
    // entre el número introducido y los números que van hasta ese número
    int cociente;
    
    if (numeroDivisible > 0) {
      for (int divisor = 1; divisor <= numeroDivisible; divisor++) {
        cociente = (numeroDivisible / divisor);
        if ((cociente * divisor) == numeroDivisible) {
          System.out.println("Es divisible por " + divisor);
        }
      }
    } else {
      System.out.println("Has introducido un cero. Fin del programa.");
    }
    
    sc.close();
  }

}
