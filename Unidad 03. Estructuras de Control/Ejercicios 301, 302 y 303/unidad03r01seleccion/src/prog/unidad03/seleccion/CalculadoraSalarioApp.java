package prog.unidad03.seleccion;

public class CalculadoraSalarioApp {
  
  // Creamos tres variables constantes para almacenar el salario por hora trabajada, 
  // el salario por hora extra trabajada y el horario de una jornada normal
  public static final double SALARIO_HORA = 16;
  public static final double SALARIO_HORA_EXTRA = 20;
  public static final double HORARIO_NORMAL = 40;

  public static void main(String[] args) {

    /*
     * 5. Un obrero cobra 16 euros por hora normal y 20 por hora extra. 
     * Se considera como horas extra todas las horas que trabaje el obrero 
     * a la semana que superen 40 horas. Por ejemplo, si trabajas 45 horas
     * una semana, 40 son normales y 5 son extras. Haz un programa que solicite 
     * el número de horas trabajadas en una semana y que muestre el salario 
     * que debería cobrar esa semana
     */
    
    // Nombre del Programa
    System.out.println("CALCULADOR DE SALARIOS");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Solicitamos las horas trabajadas
    System.out.print("¿Cuántas horas ha trabajado esta semana?: ");
    double horasTrabajadas = Double.parseDouble(sc.nextLine());
    
    // Creamos una estructura if-else que determine el salario a percibir según las horas trabajadas, contando horas normales y horas extra
    if (horasTrabajadas > HORARIO_NORMAL) {
      double horasExtra = horasTrabajadas - HORARIO_NORMAL;
      double salarioTotal = (HORARIO_NORMAL * SALARIO_HORA) + (horasExtra * SALARIO_HORA_EXTRA);
      System.out.println("Esta semana ha trabajado su jornada normal y " 
          + horasExtra + " horas extra. Por tanto le corresponde un salario de " + salarioTotal + " euros.");
    } else {
      double horasTrabajadasSinExtras = HORARIO_NORMAL - horasTrabajadas;
      double salarioSinExtras = horasTrabajadasSinExtras * SALARIO_HORA;
      System.out.println("Esta semana no ha tenido horas extra y ha trabajado " 
          + horasTrabajadas + " horas. Por tanto le corresponde un salario de " + salarioSinExtras 
          + " euros");
    }
    
    sc.close();
  }

}
