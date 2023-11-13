package prog.unidad01;

public class EnteroParImpar {

  public static void main(String[] args) {

    /* 4. Escribe un programa que tenga una variable numero de tipo entero
     * con un valor cualquiera y diga por pantalla si el valor es par 
     * (true) o no (false).
    */
    
    // Nombre del Programa
    System.out.println("ENTERO PAR O IMPAR");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
 
    // Pedimos al usuario un número entero y lo almacenamos en una variable
    System.out.print("Introduzca un número entero: ");
    int numeroEntero = Integer.parseInt(sc.nextLine());
    // Creamos una variable booleana donde almacenaremos una expresión para saber si el número es par o impar y mostramos por pantalla true si
    // la expresión da como resultado par y false si la expresión da como resultado impar
    boolean parImpar = (numeroEntero % 2 == 0);
    System.out.println("¿Es par el número entero " + numeroEntero + "? (True si es par y false si es impar): " + parImpar);
    
    sc.close();
  }

}
