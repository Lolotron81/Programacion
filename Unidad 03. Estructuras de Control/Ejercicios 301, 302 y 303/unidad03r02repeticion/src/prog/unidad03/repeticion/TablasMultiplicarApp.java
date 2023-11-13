package prog.unidad03.repeticion;

public class TablasMultiplicarApp {

  public static void main(String[] args) {

    System.out.println("TABLAS DE MULTIPLICAR");
    System.out.println();
    
    // Creamos una estructura for que nos servirá para recorrer una tabla de multiplicar desde
    // el multiplicador 1 hasta el 10
    for (int i = 1; i <= 10; i++) {
      // Mostramos por pantalla la tabla que se va a imprimir en cada iteración que haga el ciclo for
      System.out.println("Tabla del " + i);
      System.out.println("------------");
      // Creamos otra estructura for que nos servirá para ir creando las diez tablas de multiplicar
      // desde la del 1 hasta la del 10
      for ( int j = 1; j <= 10; j++) {
        // Mostramos por pantalla la expresión resultante de multiplicar el valor de i por j
        System.out.println(i + " X " + j + " = " + (i * j));
      }
      // Hacemos un salto de línea para que haya separación entre el final de una tabla y el mensaje
      // de comienzo de la siguiente
      System.out.println();
    }
  }

}
