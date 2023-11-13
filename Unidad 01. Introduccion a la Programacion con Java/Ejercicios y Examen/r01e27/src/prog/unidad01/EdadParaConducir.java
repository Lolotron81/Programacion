package prog.unidad01;

public class EdadParaConducir {
  
  // Creamos una variable constante para indicar la edad mínima para conducir
  public static final int EDAD_MINIMA_PARA_CONDUCIR = 18;

  public static void main(String[] args) {
 
    /* 27. Se requiere una aplicación que solicite la edad de una persona e indique si puede (true) o no (false) 
     * obtener el permiso de conducir.
    */
    
    // Nombre del Programa
    System.out.println("EDAD PARA CONDUCIR");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Solicitamos al usuario la edad del posible conductor
    System.out.print("¿Qué edad tiene el posible conductor?: ");
    int edad = Integer.parseInt(sc.nextLine());
    
    // Creamos una variable booleana para guardar una expresión que determine si el usuario tiene edad para conducir (true) o no (false)
    boolean puedeConducir = edad >= EDAD_MINIMA_PARA_CONDUCIR;
    System.out.println("El usuario ha indicado que tiene " + edad + " años. La edad mínima para poder conducir es de " 
        + EDAD_MINIMA_PARA_CONDUCIR + " años. ¿Puede conducir el usuario? (true para si y false para no): " + puedeConducir);
    
    sc.close();
  }

}
