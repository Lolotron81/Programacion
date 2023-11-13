package prog.unidad01;

public class AreaTerrenoIrregular {

  public static void main(String[] args) {

    /* 20. Una empresa constructora vende terrenos con la forma de la figura. Realiza un programa 
     * que calcule el área de un terreno a partir de las medidas de su perímetro.
     * La figura tiene esta forma:
     * |\
     * | \
     * |  |         
     * |__|
     * Para poder calcular el área de un terreno irregular deberemos partir este en figuras más pequeñas a las cuales podamos calcular
     * el área de manera más eficaz y al final sumar todas las áreas obtenidas. En el caso de la figura que nos ocupa sabemos que el lado 
     * horizontal más largo se llama A, la base B y el lado horizontal más corto C. Podemos presuponer que en la parte inferior de la figura nos
     * queda un rectángulo cuya base es B y los lados son C y en la parte superior nos queda un triángulo cuya base es B y la altura
     * es la resta de A menos C.
    */
    
    // Nombre del Programa
    System.out.println("CÁLCULO DEL ÁREA DE UN TERRENO IRREGULAR");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Vamos a pedir al usuario los valores del lado largo A, el lado corto C y la base B. Almacenaremos sus valores en tres variables
    System.out.print("Introduzca el tamaño del lado mayor (A): ");
    double ladoMayor = Double.parseDouble(sc.nextLine());
    System.out.print("Introduzca el tamaño del lado menor (C): ");
    double ladoMenor = Double.parseDouble(sc.nextLine());
    System.out.print("Introduzca el tamaño de la base (B): ");
    double baseFigura = Double.parseDouble(sc.nextLine());
    
    // Vamos a calcular el área del rectángulo. Usaremos la fórmula de multiplicar base por altura y sabemos que la base es B y la altura es C.
    // Por tanto vamos a crear una variable para calcular y almacenar el área del rectángulo
    double areaRectangulo = ladoMenor * baseFigura;
    
    // Creamos otra varaible para calcular y almacenar el área del triángulo que es la figura de arriba. El área de un triángulo rectángulo
    // se calcula multiplicando base por altura y dividiendo por 2. La base es B y la altura es A - C. Calculamos y almacenamos en otra variable
    // la altura del triángulo
    double alturaTriangulo = ladoMayor - ladoMenor;
    double areaTriangulo = ((baseFigura * alturaTriangulo) / 2);
    
    // Por último creamos una variable para calcular y almacenar el área total de la figura sumando ambas áreas que hemos obtenido y mostramos por pantalla
    double areaTotal = areaRectangulo + areaTriangulo;
    System.out.println("El terreno tiene tres lados, que miden " + baseFigura + ", " + ladoMayor + " y " + ladoMenor + ". Hemos calculado " 
        + "el área de un rectángulo y un triángulo cuyas áreas son " + areaRectangulo + " y " + areaTriangulo + " que forman la figura total " 
        + "dándonos un área final de " + areaTotal);
    
    sc.close();
  }

}
