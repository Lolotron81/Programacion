
public class Coche {

  // Atributos
  
  private String matricula;
  private String color;
  private String marca;
  private String modelo;
  private int cv;
  private String tipoCombustible;
  private double deposito;
  private boolean arrancado;
  private double velocidad;

  // Getters y setters

  public String getMatricula() {
    return matricula;
  }

  public String getColor() {
    return color;
  }

  public String getMarca() {
    return marca;
  }

  public String getModelo() {
    return modelo;
  }

  public int getCv() {
    return cv;
  }

  public String getTipoCombustible() {
    return tipoCombustible;
  }

  public double getDeposito() {
    return deposito;
  }

  public boolean isArrancado() {
    return arrancado;
  }

  public double getVelocidad() {
    return velocidad;
  }

  //Constructores
  
  public Coche(String matricula, String color, String marca, String modelo, int cv, String tipoCombustible) {
    super();
    this.matricula = matricula;
    this.color = color;
    this.marca = marca;
    this.modelo = modelo;
    this.cv = cv;
    this.tipoCombustible = tipoCombustible;
    this.arrancado = false;
    this.velocidad = 0;
    this.deposito = 5;    
  }
  
  public Coche(String matricula, String color, String marca, String modelo, int cv, String tipoCombustible, double cantidadCombustibleInicial) {
    super();
    this.matricula = matricula;
    this.color = color;
    this.marca = marca;
    this.modelo = modelo;
    this.cv = cv;
    this.tipoCombustible = tipoCombustible;
    this.arrancado = false;
    this.velocidad = 0;
    this.deposito = cantidadCombustibleInicial;
  }

  // Métodos
  
  /**
   * Pone el estado del coche a arrancado (true)
   */
  public void arrancar() {
    this.arrancado = true;
  }

  public void apagar() {
    this.arrancado = false;
  }

  /**
   * Si el coche está arrancado y tiene mínimo 1 l. de combustible
   * acelera la velocidad indicada
   * @param velocidad Velocidad a acelerar.
   */
  public void acelerar(int velocidad) {
    if(this.arrancado && this.deposito > 1) {
      this.velocidad = this.velocidad + velocidad ;
      this.deposito = this.deposito - 1;
    }
    else
      System.out.println("ERROR: arranca el coche primero premoh o métele gasofa");
  }

  public void frenar(int velocidad) {
    if(velocidad > this.velocidad)
      this.velocidad = 0;
    else
      this.velocidad = this.velocidad - velocidad ;
  }

  public void repostar(double litros) {
    this.deposito = this.deposito + litros;
  }
  
  @Override
  public String toString() {
    return "Coche [Deposito=" + deposito + ", arrancado="
        + arrancado + ", velocidad=" + velocidad+", matricula=" + this.matricula + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo
        + ", cv=" + cv + ", tipoCombustible=" + tipoCombustible + "]";
  }

}
