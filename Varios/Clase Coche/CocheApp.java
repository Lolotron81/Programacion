
public class CocheApp {

  public static void main(String[] args) {
    
    Coche miCoche = new Coche("1234AAA", "Gris", "Seat", "Ibiza", 105, "Diesel");
    Coche tuCoche = new Coche("5678BBB", "Azul", "Seat", "Leon", 105, "Diesel", 10);
//    Coche suCoche = new Coche("1234BZZ", "Rojo", "Seat", "Ibiza", 190, "Gasolina");
//    Coche nuestroCoche = new Coche("1234CZZ", "Amarillo", "Seat", "Ateca", 105, "Gasolina");
      
    miCoche.acelerar(10);
      
    System.out.println("Mi coche es: " + miCoche);
    System.out.println();
    System.out.println("Tu coche es: " + tuCoche);


  }

}
