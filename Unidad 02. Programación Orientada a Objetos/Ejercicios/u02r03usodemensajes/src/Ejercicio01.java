
public class Ejercicio01 {

  public static void main(String[] args) {

    /*
     * 1.Realiza una aplicación que realice las siguientes operaciones: 
     * a) Crea una nueva cuenta con el identificador 11111. 
     * b) Ingresa 1000 euros 
     * c) Imprime el saldo. 
     * d) Retira 1100 euros ¿Qué ocurre? ¿Por qué ocurre esto? 
     * e) Imprime el saldo 
     * f) Retira 900 euros ¿Qué ocurre? ¿Por qué ocurre esto? 
     * g) Imprime el saldo 
     * h) Retira 100 euros ¿Qué ocurre? ¿Por qué? 
     * i) Ingresa 350 euros 
     * j) Imprime el saldo 
     * k) Retira 400 euros ¿Qué ocurre? ¿Por qué? 
     * l) Imprime el saldo y termina
     */
    
    CuentaCorriente cuenta = new CuentaCorriente("11111");
    cuenta.ingresar(1000);
    System.out.println(cuenta.getSaldo());
    cuenta.retirar(1100);
    // Saltará una excepción avisando de que la retirada es mayor que el disponible
    System.out.println(cuenta.getSaldo());
    cuenta.retirar(900);
    // Ahora no saltará ninguna excepción y quedaran 100 euros de saldo
    System.out.println(cuenta.getSaldo());
    cuenta.retirar(100);
    // De nuevo se puede retirar y la cuenta queda a saldo 0
    System.out.println(cuenta.getSaldo());
    
    
  }

}
