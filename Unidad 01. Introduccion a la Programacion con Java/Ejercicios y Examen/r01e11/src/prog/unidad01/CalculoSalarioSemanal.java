package prog.unidad01;

public class CalculoSalarioSemanal {
  
  // Creamos una variable constante para almacenar el salario por hora
  public static final double SALARIO_HORA = 12;

  public static void main(String[] args) {

    /* 11. Escribe un programa que calcule el salario semanal de un trabajador
     * pidiendo por teclado el número de horas trabajadas y sabiendo que el 
     * salario es de 12 euros la hora.
    */
    
    // Nombre del Programa
    System.out.println("CÁLCULO DE SALARIO SEMANAL");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Pedimos al usuario las horas trabajadas en una semana y creamos una variable para almacenar el dato
    System.out.print("¿Cuántas horas ha trabajado esta semana?: ");
    double horasTrabajadas = Double.parseDouble(sc.nextLine());
    
    // Creamos una variable donde almacenaremos el salario y lo mostramos por pantalla
    double salarioSemanal = horasTrabajadas * SALARIO_HORA;
    System.out.println("Esta semana ha trabajado " + horasTrabajadas + " horas y su salario es de " + salarioSemanal + " euros.");
    
    sc.close();
  }

}
