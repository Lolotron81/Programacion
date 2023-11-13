package prog.unidad03.seleccion;

public class NombreMesesApp {

  public static void main(String[] args) {

    /*
     * 7. Crea un programa que lea un número del 1 al 12 y muestre 
     * un mensaje diciendo qué mes del año ocupa la posición correspondiente al número.
     */
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    System.out.print("Introduzca un número del 1 al 12: ");
    int diaSemana = Integer.parseInt(sc.nextLine());
    
    switch(diaSemana) {
    
      case 1: 
        System.out.println("El número " + diaSemana + " equivale al mes de ENERO");
        break;
      case 2:
        System.out.println("El número " + diaSemana + " equivale al mes de FEBRERO");
        break;
      case 3:
        System.out.println("El número " + diaSemana + " equivale al mes de MARZO");
        break;
      case 4:
        System.out.println("El número " + diaSemana + " equivale al mes de ABRIL");
        break;
      case 5:         
        System.out.println("El número " + diaSemana + " equivale al mes de MAYO");
        break;
      case 6:
        System.out.println("El número " + diaSemana + " equivale al mes de JUNIO");
        break;
      case 7:
        System.out.println("El número " + diaSemana + " equivale al mes de JULIO");
        break;
      case 8:
        System.out.println("El número " + diaSemana + " equivale al mes de AGOSTO");
        break;
      case 9:
        System.out.println("El número " + diaSemana + " equivale al mes de SEPTIEMBRE");
        break;
      case 10:
        System.out.println("El número " + diaSemana + " equivale al mes de OCTUBRE");
        break;
      case 11:
        System.out.println("El número " + diaSemana + " equivale al mes de NOVIEMBRE");
        break;
      case 12:
        System.out.println("El número " + diaSemana + " equivale al mes de DICIEMBRE");
        break;
      default: 
        System.out.println("El número introducido no es correcto. Introduzca un número del 1 al 12.");
    }
    
    sc.close();
  }

}
