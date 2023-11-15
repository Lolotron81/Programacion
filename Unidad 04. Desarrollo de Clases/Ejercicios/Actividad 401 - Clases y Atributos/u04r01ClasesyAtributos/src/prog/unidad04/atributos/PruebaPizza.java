package prog.unidad04.atributos;

public class PruebaPizza {

	public static void main(String[] args) {

		// Nombre del Programa
		System.out.println("PROGRAMA DE MANEJO DE PIZZAS");
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		// Soliticamos la cantidad de pizzas que se van a servir
		System.out.print("Introduzca la cantidad de Pizzas a crear (1 ó más): ");
		int numeroPizzas = Integer.parseInt(sc.nextLine());
		
		// Creamos una estructura for para que lleve el número de pizzas y en cada vuelta haga una pizza
		for (int i = 1; i <= numeroPizzas; i++) {
			Pizza pizza = new Pizza();
			System.out.print("Introduce el tamaño de la pizza " + i + " (mediana / familia): ");
			pizza.tamañoPizza = sc.nextLine();
			System.out.print("Introduce el tipo de la pizza " + i + " (margarita / cuatro quesos / funghi): ");
			pizza.tipoPizza = sc.nextLine();
			System.out.print("¿Servir la Pizza? (s / n): ");
			pizza.servidaONo = sc.next().charAt(0);
			System.out.println("Datos de la Pizza " + i);
			System.out.println("Tamaño: " + pizza.tamañoPizza);
			System.out.println("Tipo: " + pizza.tipoPizza);
			System.out.print("Estado: ");
			if (pizza.servidaONo == 's') {
				System.out.println("Servida");
			} else {
				System.out.println("Pedida");
			}
		}
		
		sc.close();
	}

}