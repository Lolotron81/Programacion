
public class Ejercicio03 {

  public static void main(String[] args) {

    /*
     * 3.Crea una Persona con 33 años, un hijo y un peso de 80,43 kilos.
     * Crea una nueva variable de tipo Persona y asignale la referencia a la primera. 
     * Usa esta nueva variable para poner un valor al peso de 79,65 kilogramos. 
     * Imprime por pantalla la información de las personas referenciadas por ambas variables. 
     * ¿Qué valores se muestran? ¿Cómo lo justificas?
     */
    
    // Creo un objeto Persona con los datos indicados
    Persona persona1 = new Persona();
    persona1.edad = 33;
    persona1.numeroHijos = 1;
    persona1.peso = 80.43;
    
    // Creamos un nuevo objeto y le asignamos la referencia del primero
    Persona persona2 = persona1;
    persona2.peso = 79.65;
    
    // Mostramos por pantalla los valores y veremos si son iguales
    System.out.println(persona1.peso);
    System.out.println(persona2.peso);
    
    // El valor es el mismo porque cuando creamos persona2 lo que le dimos fue la referencia de persona1
    // Esto quiere decir que persona2 y persona1 apuntan al mismo objeto
  }

}
