package prog.unidad01;

public class Digitos {

  public static void main(String[] args) {
  
    /* 30. Se requiere una aplicación que solicite un número por teclado e indique si NO tiene dos dígitos (true) 
     * o SI tiene dos dígitos (false).
    */
    
    // Nombre del Programa
    System.out.println("DÍGITOS DE UN NÚMERO");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Pedimos un número al usuario. Como no se indica nada lo pediremos entero
    System.out.print("Introduzca un número entero: ");
    int numero = Integer.parseInt(sc.nextLine());
    
    // Creamos una variable booleana que almacenará la expresión que determinará si un número tiene dos digitos o no y mostramos por pantalla
    boolean tieneDigitos = (numero < 10);
    System.out.println("El número " + numero + ", ¿Tiene un sólo dígito? (true para si y false para no): " + tieneDigitos);
    
    sc.close();
  }

}
