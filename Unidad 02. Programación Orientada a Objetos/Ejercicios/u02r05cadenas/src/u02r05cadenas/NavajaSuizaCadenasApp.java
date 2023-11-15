package u02r05cadenas;

public class NavajaSuizaCadenasApp {

  public static void main(String[] args) {

    /*
     * 1.Crea una aplicación, llamada NavajaSuizaCadenasApp que realice las siguientes operaciones: 
     * a) Solicite desde teclado dos cadenas cualquiera al usuario. 
     * b) Muestre por pantalla la longitud de ambas, si están vacías y si sólo contienen 
     *    caracteres blancos (esto último mostrando por pantalla true o false). 
     * c) Muestre por pantalla la concatenación de ambas cadenas. 
     * d) Muestre por pantalla si ambas cadenas son iguales (true) o no (false), comparándolas 
     *    tanto con sensibilidad a mayúsculas / minúsculas como sin ella. 
     * e) Muestre por pantalla el valor de comparar alfabéticamente ambas (un número) usando 
     *    tanto comparación sensible a mayúsculas / minúsculas como sin sensibilidad. 
     * f) Muestre por pantalla si la primera cadena contiene (true) o no (false) a la segunda. 
     * g) Muestre por pantalla si la primera cadena comienza (true) o no (false) por la segunda. 
     * h) Muestre por pantalla si la primera cadena termina (true) o no (false) por la segunda. 
     * i) Muestre por pantalla el primer y el último carácter de la primera cadena 
     *    (puede ser el mismo en caso de que la cadena sólo tenga un carácter) 
     * j) Muestre por pantalla la primera cadena eliminando el primer caracter. 
     * k) Muestre por pantalla la primera cadena con todas las letras en minúscula y con todas 
     *    las letras en mayúscula.
     */
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Pedimos dos cadenas de caracteres
    System.out.print("Introduzca una cadena de caracteres: ");
    String primeraCadena = sc.nextLine();
    System.out.print("Introduzca una cadena de caracteres: ");
    String segundaCadena = sc.nextLine();
    
    // Comprobamos las longitudes de las cadenas
    System.out.println("La longitud de la primera cadena es " + primeraCadena.length());
    System.out.println("La longitud de la segunda cadena es " + segundaCadena.length());
    // Comprobamos si las cadenas están vacías
    System.out.println("¿La primera cadena está vacía?: " + primeraCadena.isEmpty());
    System.out.println("¿La segunda cadena está vacía?: " + segundaCadena.isEmpty());
    // Comprobamos si las cadenas sólo tienen espacios blancos
    System.out.println("¿La primera cadena sólo tiene espacios blancos?: " + primeraCadena.isBlank());
    System.out.println("¿La segunda cadena sólo tiene espacios blancos?: " + segundaCadena.isBlank());
    // Mostramos la concatenación de las dos cadenas
    System.out.println(primeraCadena.concat(segundaCadena));
    // Mostramos si las cadenas son iguales
    boolean sonIguales = primeraCadena.equals(segundaCadena);
    System.out.println(sonIguales);
    sonIguales = primeraCadena.equalsIgnoreCase(segundaCadena);
    System.out.println(sonIguales);
    // Mostramos cual de las dos cadenas está antes en el alfabeto
    System.out.println(primeraCadena.compareTo(segundaCadena));
    System.out.println(primeraCadena.compareToIgnoreCase(segundaCadena));
    // Mostramos si la primera cadena contiene a la segunda
    System.out.println(primeraCadena.contains(segundaCadena));
    // Muestre por pantalla si la primera cadena contiene (true) o no (false) a la segunda.
    System.out.println("¿Está incluida la cadena 2 en la cadena 1?: " 
        + primeraCadena.contains(segundaCadena));
    // Muestra por pantalla si la primera cadena comienza (true) o no (false) por la segunda cadena.
    System.out.println("¿Comienza la primera cadena por la segunda cadena?: " 
        + primeraCadena.startsWith(segundaCadena));
    // Muestra por pantalla si la primera cadena termina (true) o no (false) por la segunda cadena.
    System.out.println("¿Termina la primera cadena por la segunda cadena?: " 
        + primeraCadena.endsWith(segundaCadena));
    // Muestre por pantalla el primer y el último caracter de la primera cadena.
    System.out.println("El primer caracter de la primera cadena es: " + primeraCadena.charAt(0));
    System.out.println("El último caracter de la primera cadena es: " 
        + primeraCadena.charAt(primeraCadena.length() - 1)); 
    // Muestra por pantalla la primera cadena eliminando el primer caracter
    System.out.println("La primera cadena 1 es: " + primeraCadena);
    System.out.println("Si le quitamos el primer caracter nos queda la siguiente cadena: " 
        + primeraCadena.substring(1));
    // Muestra por pantalla la primera cadena con todos los caracteres en mayúsculas y en minúsculas.
    System.out.println("La primera cadena con todos los caracteres en mayúscula es: " 
        + primeraCadena.toUpperCase());
    System.out.println("La primera cadena con todos los caracteres en minúscula es: " 
        + primeraCadena.toLowerCase());
    
    
    sc.close();
  }

}
