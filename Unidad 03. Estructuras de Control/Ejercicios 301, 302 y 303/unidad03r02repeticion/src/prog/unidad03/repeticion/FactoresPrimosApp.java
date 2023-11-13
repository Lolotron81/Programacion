package prog.unidad03.repeticion;

public class FactoresPrimosApp {

  public static void main(String[] args) {

    System.out.println("CÁLCULO DE FACTORES PRIMOS");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Pedimos el número al que queremos sacar los factores primos
    System.out.print("Introduce un número entero mayor que 1 para descomponerlo en factores primos: ");
    int numeroFactoresPrimos = Integer.parseInt(sc.nextLine());
    
    // Creamos una variable que almacene el divisor por el cual iremos dividiendo el número y será
    // el factor primo si la división da resto cero
    int divisorFactoresPrimos = 2;
    
    // Creamos un ciclo donde definimos como condición que el número introducido por el usuario
    // sea mayor que uno para que vaya pidiendo divisores y determinando si son factores primos
    while (numeroFactoresPrimos > 1) {
      if (numeroFactoresPrimos % divisorFactoresPrimos == 0) {
        // Imprimimos el valor de la división para que haya un registro visual de cómo el valor del
        // número introducido por el usuario va reduciéndose hasta que se cumpla la condición
        System.out.println("La división entre " + numeroFactoresPrimos + " y " + divisorFactoresPrimos + " es " 
            + (numeroFactoresPrimos / divisorFactoresPrimos));
        System.out.println(divisorFactoresPrimos + " es un factor primo");
        // Con la siguiente expresión vamos reduciendo el cociente de la división que es el número
        // introducido por el usuario para que la condición del ciclo pueda cumplirse
        numeroFactoresPrimos = (numeroFactoresPrimos / divisorFactoresPrimos);
      } else {
        // Si el divisor no da una división exacta incrementaremos en 1 el divisor
        divisorFactoresPrimos++;
      }
    }
    
    sc.close();
  }

}
