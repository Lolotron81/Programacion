package prog.unidad03.seleccion;

public class CalculaIMCApp {

	public static void main(String[] args) {

    /* 
     * 1. Crea un programa (CalculaIMCApp) que lea el peso (en kilogramos) y la altura (en metros) de una persona y 
     * muestre el estado en que se encuentra dicha persona en función de su Indice de Masa Corporal (IMC), siguiendo la 
     * tabla que se muestra a continuación (hay que mostrar tanto el IMC calculado como el diagnóstico equivalente) 
     * Valor de IMC Diagnóstico 
     * Menor de 16 Ingreso en hospital por infrapeso 
     * Entre 16 y 17 (no incluido) Infrapeso 
     * Entre 17 y 18 (n. i.) Bajo peso 
     * Entre 18 y 25 (n. i.) Peso normal (saludable) 
     * Entre 25 y 30 (n. i.) Sobrepeso (obesidad de grado I) 
     * Entre 30 y 35 (n. i.) Sobrepeso crónico (obesidad de grado II) 
     * Entre 35 y 40 Obesidad premórbida (obesidad de grado III) 
     * Mayor que 40 Obesidad mórbida (obesidad de grado IV)
     */
    
    // Nombre del Programa
    System.out.println("PROGRAMA DE CÁLCULO DE ÍNDICE DE MASA CORPORAL");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    // Solicitamos altura y peso. Se almacenará en una variable cada valor
    System.out.print("Introduzca su altura en metros: ");
    double altura = Double.parseDouble(sc.nextLine());
    System.out.print("Introduzca su peso en kilogramos: ");
    double peso = Double.parseDouble(sc.nextLine());
    
    // Calculamos el índice de masa corporal
    double imc = peso / (altura * altura);
    
    // Imprimimos por pantalla el índice de masa corporal y dejaremos el mensaje abierto para que el diagnóstico se calcule más adelante
    System.out.print("Su IMC es de " + imc + ", con un diagnóstico de ");
    
    // Creamos una estructura if-else para determinar según el imc qué diagnóstico tiene el paciente
    if (imc < 16) {
      System.out.println("Ingreso en hospital por infrapeso");
    } else if ((imc >= 16) && (imc <17)) {
      System.out.println("Infrapeso.");
    }else if ((imc >= 17) && (imc < 18)) {
      System.out.println("Bajo Peso");
    } else if ((imc >= 18) && (imc < 25)) {
      System.out.println("Peso Normal (Saludable)");
    } else if ((imc >= 25) && (imc <30)) {
      System.out.println("Sobrepeso (Obesidad de Grado I)");
    } else if ((imc >= 30) && (imc < 35)) {
      System.out.println("Sobrepeso crónico (Obesidad de Grado II)");
    } else if ((imc >= 35) && (imc <=40)) {
      System.out.println("Obesidad Premórbida (Obesidad de Grado III)");
    } else if (imc > 40) {
      System.out.println("Obesidad Mórbida (Obesidad de Grado IV)");
    } else {
      System.out.println("IMC desconocido.");
    }
    
    System.out.println("FIN DEL PROGRAMA");
    
    sc.close();
	}

}
