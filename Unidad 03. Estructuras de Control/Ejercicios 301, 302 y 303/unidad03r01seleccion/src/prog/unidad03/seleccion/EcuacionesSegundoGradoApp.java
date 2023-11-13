package prog.unidad03.seleccion;

public class EcuacionesSegundoGradoApp {

  public static void main(String[] args) {

    /*
     * 2. Crea un programa que calcule y muestre por pantalla las raíces de una 
     * ecuación de segundo grado con coeficientes reales. El programa debe 
     * diferenciar los distintos casos que se pueden producir
     * (las dos raíces son reales e iguales, reales y distintas o sin raices reales)
     * Para calcular el discriminante (parte de la ecuación que está dentro de la 
     * raíz cuadrada) usamos la siguiente fórmula: b*b - (4 * a * c)
     * La ecuación de segundo grado se calcula así: (-b +- Math.sqrt(discriminante))
     */
    
    // Nombre del Programa
    System.out.println("PROGRAMA DE CÁLCULO DE ECUACIONES DE SEGUNDO GRADO");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Vamos a solicitar los coeficientes para conocer el valor del discriminante.
    System.out.print("Introduzca el coeficiente a: ");
    double a = Double.parseDouble(sc.nextLine());
    System.out.print("Introduzca el coeficiente b: ");
    double b = Double.parseDouble(sc.nextLine());
    System.out.print("Introduca el coeficiente c: ");
    double c = Double.parseDouble(sc.nextLine());
    
    double discriminante = b * b - (4 * a * c);
    System.out.println("El discriminante vale: " + discriminante);
    
    // Si el discriminante es positivo tenemos dos posibles soluciones.
    if (discriminante > 0) {
      double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
      double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
      System.out.println("Esta ecuación de segundo grado tiene dos posibles soluciones reales.");
      System.out.println("La Primera Solución Real vale: " + raiz1);
      System.out.println("La Segunda Solución Real vale: " + raiz2);
    } else if (discriminante == 0) {
      // Si el discriminante vale 0 la raiz por tanto también valdrá cero por lo que nos queda
      // la fórmula (-b / (2 * a))
      double raizCero = -b / (2 * a);
      System.out.println("Esta ecuación de segundo grado sólo tiene una solución real.");
      System.out.println("La Ecuación vale: " + raizCero);
    } else
      System.out.println("Esta ecuación de segundo grado no tiene soluciones reales.");
    
    sc.close();
  }

}
