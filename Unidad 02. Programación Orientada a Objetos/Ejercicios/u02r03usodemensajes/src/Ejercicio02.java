
public class Ejercicio02 {

  public static void main(String[] args) {

    /*
     * 2.Crea una aplicación que solicite dos números complejos al usuario e 
     * imprima por pantalla la suma, diferencia, producto y división de los dos números. 
     * Si los dos números son, por ejemplo, 2,2 + 3,4i y 5,6 + 8,4i, la suma vale 7,8 + 11.8i, 
     * la diferencia vale -3,4 - 5i, el producto vale -16,24 + 37,52i y 
     * la división vale 0,401 + 0,0055i, apróximadamente
     */
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Pedimos los números complejos
    System.out.print("Introduzca la parte real del primer número complejo: ");
    double parteRealNumeroUno = Double.parseDouble(sc.nextLine());
    System.out.print("Introduzca la parte real del primer número complejo: ");
    double parteImaginariaNumeroUno = Double.parseDouble(sc.nextLine());
    System.out.print("Introduzca la parte real del primer número complejo: ");
    double parteRealNumeroDos = Double.parseDouble(sc.nextLine());
    System.out.print("Introduzca la parte real del primer número complejo: ");
    double parteImaginariaNumeroDos = Double.parseDouble(sc.nextLine());
    
    // Creamos dos objetos de la Clase Complejo y les damos los valores anteriores
    Complejo complejo1 = new Complejo(parteRealNumeroUno, parteImaginariaNumeroUno);
    Complejo complejo2 = new Complejo(parteRealNumeroDos, parteImaginariaNumeroDos);
    
    // Creamos objetos suma, diferencia, producto y division que almacenarán los valores
    // fruto de los métodos de la Clase que sirven para tales fines
    Complejo suma = complejo1.sumar(complejo2);
    Complejo diferencia = complejo1.restar(complejo2);
    Complejo producto = complejo1.multiplicar(complejo2);
    Complejo division = complejo1.dividir(complejo2);
    
    // Mostramos por la pantalla los valores
    System.out.println("(" + complejo1.getParteReal() + " + " + complejo1.getParteImaginaria() + "i) + (" 
        + complejo2.getParteReal() + " + " + complejo2.getParteImaginaria() + "i) = " 
        + suma.getParteReal() + " + " + suma.getParteImaginaria() + "i");
    System.out.println("(" + complejo1.getParteReal() + " + " + complejo1.getParteImaginaria() + "i) - (" 
        + complejo2.getParteReal() + " - " + complejo2.getParteImaginaria() + "i) = " 
        + diferencia.getParteReal() + " + " + diferencia.getParteImaginaria() + "i");
    System.out.println("(" + complejo1.getParteReal() + " + " + complejo1.getParteImaginaria() + "i) * (" 
        + complejo2.getParteReal() + " + " + complejo2.getParteImaginaria() + "i) = " 
        + producto.getParteReal() + " + " + producto.getParteImaginaria() + "i");
    System.out.println("(" + complejo1.getParteReal() + " + " + complejo1.getParteImaginaria() + "i) / (" 
        + complejo2.getParteReal() + " + " + complejo2.getParteImaginaria() + "i) = " 
        + division.getParteReal() + " + " + division.getParteImaginaria() + "i");
    
    sc.close();
  }

}
