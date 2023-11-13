package prog.unidad01;

public class PorcentajeInversionEmpresa {

  public static void main(String[] args) {

    /* 16. Tres personas invierten su dinero para formar una empresa. Cada una de ellas invierte una cantidad distinta. 
     * Calcula qué porcentaje del total invierte cada uno.
    */
    
    // Nombre del Programa
    System.out.println("PORCENTAJE DE INVERSIÓN PARA MONTAR UNA EMPRESA");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Pedimos al usuario las cantidades que han invertido cada una de las personas y creamos tres variables para almacenar los valores
    System.out.print("¿Cuánto dinero ha depositado el primer inversor?: ");
    double primerImporte = Double.parseDouble(sc.nextLine());
    System.out.print("¿Cuánto dinero ha depositado el segundo inversor?: ");
    double segundoImporte = Double.parseDouble(sc.nextLine());
    System.out.print("¿Cuánto dinero ha depositado el tercer inversor?: ");
    double tercerImporte = Double.parseDouble(sc.nextLine());
    
    // Creamos una variable para almacenar el importe total invertido
    double inversionTotal = (primerImporte + segundoImporte + tercerImporte);
    // Creamos tres variables para almacenar los tres porcentajes de cada sujeto
    double porcentajePrimerInversor = ((primerImporte / inversionTotal) * 100);
    double porcentajeSegundoInversor = ((segundoImporte / inversionTotal) * 100);
    double porcentajeTercerInversor = ((tercerImporte / inversionTotal) * 100);
    
    // Mostramos por pantalla toda la información
    System.out.println("Tres personas han aportado una cantidad total de " + inversionTotal + " euros.");
    System.out.println("La primera persona ha aportado " + primerImporte + " euros, un " + (int) (porcentajePrimerInversor) + "% de la cantidad total.");
    System.out.println("La segunda persona ha aportado " + segundoImporte + " euros, un " + (int) (porcentajeSegundoInversor) + "% de la cantidad total.");
    System.out.println("La tercera persona ha aportado " + tercerImporte + " euros, un " + (int) (porcentajeTercerInversor) + "% de la cantidad total.");
    
    sc.close();
  }

}
