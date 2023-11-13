package prog.unidad03.seleccion;

public class NombreMesesMejoradaApp {

  public static void main(String[] args) {

    /*
     * 8. Crea un programa que lea un número del 1 al 12 y muestre un 
     * mensaje diciendo qué mes del año
     * ocupa la posición correspondiente al número.
     */
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    System.out.print("Introduzca un número del 1 al 12 y te diré que mes ocupa esa posición: ");
    int diaMes = Integer.parseInt(sc.nextLine());
    
    if ((diaMes >= 1) && (diaMes <=12)) {
      switch(diaMes) {
        case 1: 
          System.out.println("El nombre del mes con posición " + diaMes + " es \"Enero\"");
          break;
        case 2:
          System.out.println("El nombre del mes con posición " + diaMes + " es \"Febrero\"");
          break;
        case 3:
          System.out.println("El nombre del mes con posición " + diaMes + " es \"Marzo\"");
          break;
        case 4:
          System.out.println("El nombre del mes con posición " + diaMes + " es \"Abril\"");
          break;
        case 5:         
          System.out.println("El nombre del mes con posición " + diaMes + " es \"Mayo\"");
          break;
        case 6:
          System.out.println("El nombre del mes con posición " + diaMes + " es \"Junio\"");
          break;
        case 7:
          System.out.println("El nombre del mes con posición " + diaMes + " es \"Julio\"");
          break;
        case 8:
          System.out.println("El nombre del mes con posición " + diaMes + " es \"Agosto\"");
          break;
        case 9:
          System.out.println("El nombre del mes con posición " + diaMes + " es \"Septiembre\"");
          break;
        case 10:
          System.out.println("El nombre del mes con posición " + diaMes + " es \"Octubre\"");
          break;
        case 11:
          System.out.println("El nombre del mes con posición " + diaMes + " es \"Noviembre\"");
          break;
        case 12:
          System.out.println("El nombre del mes con posición " + diaMes + " es \"Diciembre\"");
          break;
      }
    } else {
        System.out.println("El número introducido no es correcto. Introduzca un número del 1 al 12");
    }
    
    sc.close();
  }

}
