package prog.unidad01;

public class PresupuestoHospital {
  
  // Creamos tres variables constantes para almacenar los porcentajes de presupuesto de cada departamento
  public static final double PRESUPUESTO_GINECOLOGIA = 0.40;
  public static final double PRESUPUESTO_PEDIATRIA = 0.25;
  public static final double PRESUPUESTO_TRAUMATOLOGIA = 0.35;

  public static void main(String[] args) {

    /* 17. En un hospital existen tres departamentos: Ginecología, Pediatría y Traumatología. El presupuesto anual del hospital 
     * se reparte entre los tres departamentos de forma que Ginecología recibe el 40%, Traumatología el 35% y Pediatría el 25%. 
     * Realiza un programa que calcule el presupuesto de cada departamento a partir del presupuesto anual del hospital.
    */
    
    // Nombe del Programa
    System.out.println("PRESUPUESTO DE UN HOSPITAL");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Pedimos al usuario que introduzca el importe del presupuesto total del hospital y lo almacenamos en una variable
    System.out.print("¿Cuál es el presupuesto anual del hospital?: ");
    double presupuestoAnualHospital = Double.parseDouble(sc.nextLine());
    
    // Creamos tres variables donde calcularemos y almacenaremos las cantidades que corresponden a cada departamento
    double presupuestoGinecologia = (presupuestoAnualHospital * PRESUPUESTO_GINECOLOGIA);
    double presupuestoTraumatologia = (presupuestoAnualHospital * PRESUPUESTO_TRAUMATOLOGIA);
    double presupuestoPediatria = (presupuestoAnualHospital * PRESUPUESTO_PEDIATRIA);
    
    // Mostramos por pantalla los tres presupuestos
    System.out.println("De un presupuesto anual de " + presupuestoAnualHospital + " euros el departamento de Ginecología recibirá " + presupuestoGinecologia + " euros.");
    System.out.println("De un presupuesto anual de " + presupuestoAnualHospital + " euros el departamento de Pediatría recibirá " + presupuestoPediatria + " euros.");
    System.out.println("De un presupuesto anual de " + presupuestoAnualHospital + " euros el departamento de Traumatología recibirá " + presupuestoTraumatologia + " euros.");
    
    sc.close();
  }

}
