package prog.unidad03.repeticion;

public class CalculaFactorialApp {

  public static void main(String[] args) {

    System.out.println("CÁLCULO DE FACTORIAL");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Creamos un contador donde vamos multiplicando los números
    long contadorFactorial = 1L;
    
    // Pedimos el número al que vamos a calcular el factorial
    System.out.print("Introduce un número entero mayor que cero para calcular su factorial: ");
    long numeroFactorial = Long.parseLong(sc.nextLine());
    
    // Recorremos todos los números desde 1 hasta el que hemos introducido y vamos guardando
    // en el contador los productos de los números que vamos recorriendo
    for (int i = 1; i <= numeroFactorial; i++) {
      contadorFactorial = (i * contadorFactorial);
    }
    
    System.out.println("El factorial de " + numeroFactorial + " vale " + contadorFactorial);
    
    /*
     * OTRA FORMA DE HACERLO
     */
    
//    // Solicita el número del que se quiere calcular el factorial
//    System.out.print("Introduce un número entero mayor que cero para calcular su factorial: ");
//    int numero = Integer.parseInt(sc.nextLine());
//    
//    if (numero > 0) {
//      // Inicializamos el factorial (usamos un long porque pueden salir números muy grandes rápidamente)
//      long factorial = 1;
//
//      // Desde 1 hasta el número indicado
//      for (int i = 1; i <= numero; i++) {
//        // Multiplicamos el factorial que llevamos por el número
//        factorial *= i;
//      }
//      
//      // Mostramos el resultado
//      System.out.println("El factorial de " + numero + " vale " + factorial);
    
    sc.close();
  }

}
