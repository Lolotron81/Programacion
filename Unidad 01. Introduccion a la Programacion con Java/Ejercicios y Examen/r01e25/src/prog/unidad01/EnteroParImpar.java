package prog.unidad01;

public class EnteroParImpar {

  public static void main(String[] args) {

    /* 25. Hacer un programa que solicite un numero entero y diga por pantalla si el numero es par (true) o no (false).
    */
    
    // Nombre del Programa
    System.out.println("ENTERO PAR O IMPAR");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Pedimos al usuario un número entero y creamos una variable para almacenarlo
    System.out.print("Introduzca un número entero: ");
    int numeroEntero = Integer.parseInt(sc.nextLine());
    
    // Creamos una variable booleana donde almacenaremos una expresion para comprobar si el número es par o impar. Mostramos el resultado por pantalla
    // Nos devolverá true si es par y false si es impar
    boolean parImpar = (numeroEntero % 2 == 0);
    System.out.println(numeroEntero + ", ¿Es par? (true para si y false para no): " + parImpar);
    
    sc.close();
  }

}
