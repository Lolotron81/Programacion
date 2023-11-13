package prog.unidad03.repeticion;

public class TablaMultiplicarSimpleApp {
  
  public static final int PRIMER_MULTIPLICADOR = 1;
  public static final int ULTIMO_MULTIPLICADOR = 10;

  public static void main(String[] args) {

    System.out.println("TABLA DE MULTIPLICAR DE....");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Pedimos el número de la tabla que vamos a sacar
    System.out.print("¿De qué número entero quieres mostrar su tabla de multiplicar?: ");
    int numeroTablaMultiplicar = Integer.parseInt(sc.nextLine());
    
    System.out.println("Tabla del " + numeroTablaMultiplicar);
    
    // Recorremos la tabla de multiplicar desde el 1 hasta el 10 y vamos multiplicando
    // por el número que hemos introducido
    for (int i = PRIMER_MULTIPLICADOR; i <= ULTIMO_MULTIPLICADOR; i++) {
      System.out.println(numeroTablaMultiplicar + " X " + i + " = " 
          + (numeroTablaMultiplicar * i));
    }
    
    sc.close();
  }

}
