package prog.unidad01;

public class CompararEdades {

  public static void main(String[] args) {

    /* 28. Crea un programa que solicite la edad de tres personas e imprima por pantalla true si la primera es mayor 
     * que la segunda y la segunda mayor que la tercera. En caso contrario debe imprimir false.
    */
    
    // Nombre del Programa
    System.out.println("COMPARAR EDADES");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Solicitamos tres edades y las almacenamos en tres variables
    System.out.print("Introduzca la primera edad: ");
    int primeraEdad = Integer.parseInt(sc.nextLine());
    System.out.print("Introduzca la segunda edad: ");
    int segundaEdad = Integer.parseInt(sc.nextLine());
    System.out.print("Introduzca la tercera edad: ");
    int terceraEdad = Integer.parseInt(sc.nextLine());
    
    // Creamos una variable booleana que almacene la expresión condicional indicada en el enunciado y mostraremos el resultado por pantalla
    boolean primeraEdadMayorDeTodas = ((primeraEdad > segundaEdad) && (segundaEdad > terceraEdad));
    System.out.println("La primera persona tiene " + primeraEdad +" años, la segunda tiene " + segundaEdad + " años y la tercera tiene " 
        + terceraEdad + " años. ¿Es la primera mayor que la segunda y ésta mayor que la tercera? (true par si y false para no): " + primeraEdadMayorDeTodas);
    
    sc.close();
  }

}
