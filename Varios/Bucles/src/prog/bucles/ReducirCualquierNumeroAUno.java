package prog.bucles;

import java.util.Scanner;

public class ReducirCualquierNumeroAUno {

	public static void main(String[] args) {

	  // Nombre del Programa
	  System.out.println("REDUCIR CUALQUIER NÚMERO A 1");
	  
	  /*
	   * Para demostrar que cualquier número puede reducirse a 1 con la fórmula de operar dicho
	   * número entre 2 y 3 (calculando si es par y dividiendo entre 2 por un lado y resolviendo
	   * la expresión 3 x numero + 1 por el otro) hemos acotado la cantidad de números de 1 a 500
	   * pero realmente cualquier número es capaz de reducirse a cero con estas operaciones.
	   */
	  
	  Scanner sc = new Scanner(System.in);
	   //Declaramos una variable donde almacenaremos el número que vamos a reducir
	   int numero;
	   
	   // Creamos una estructura do-while para solicitar al usuario el número entero
	   // que estará comprendido entre 1 y 100 y si no lo introduce bien el bucle volverá
	   // a pedir el número hasta que lo introduzca bien
	   do {
	     System.out.print("Introduce un número entre el 1 y el 500: ");
	     numero = Integer.parseInt(sc.nextLine());
	     if (numero < 1 || numero > 500) {
	       System.out.println("Ha introducido un número que no está entre 1 y 500. Vuelva a intentarlo");
	     }
	   } while ((numero < 1) || (numero > 500));
	   
	   // Declaramos una variable donde almacenaremos el valor del número introducido por el usuario
	   int numeroOriginal = numero;
	   
	   // Creamos una estructura while que seguirá en bucle mientras el número introducido no sea 1
	   while (numero != 1) {
	     if (numero % 2 == 0) {
	       // Declaramos una variable donde almacenaremos el valor de restar el número entre 2
	       int nuevoValorNumero = (numero / 2);
	       System.out.print(nuevoValorNumero + ", ");
	       // numero adquiere el valor de la división
	       numero = nuevoValorNumero;
	     } else { 
	       // Declaramos una variable donde la expresión 3 x numero + 1 nos devolverá un nuevo valor
	       int nuevoValorNumero = ((3 * numero) + 1);
	       System.out.print(nuevoValorNumero + ", ");
	       // numero adquiere este nuevo valor
	       numero = nuevoValorNumero;
	     }
	   }
	   
	   // Mostramos por pantalla el resultado
	   System.out.println(numeroOriginal + " se ha convertido en un 1");
	   
	   sc.close();
	}

}
