
public class Ejercicio02 {

  public static void main(String[] args) {

    /*
     * 2.Añade a la actividad anterior una línea que imprime true o false por 
     * pantalla según las variables apuntan al mismo objeto (true) o no (false). 
     * ¿Qué valor se muestra? ¿Por qué?
     */
    
    // Copiamos los objetos del ejercicio anterior
    Persona persona1 = new Persona();
    Persona persona2 = new Persona();
    persona1.edad = 25;
    persona1.numeroHijos = 0;
    persona1.peso = 75.4;
    persona2.edad = 65;
    persona2.numeroHijos = 3;
    persona2.peso = 65;
    
    // Creamos una variable booleana que devolverá true si ambos objetos son iguales o false si no lo son
    boolean compararObjetos = (persona1 == persona2);
    System.out.println(compararObjetos);
  }

}
