package Modelo;

public class Jugador{
  //Atributos
  private String nombre;
  private String marca;
  //Constructor
  public Jugador(String nombre, String marca){
    this.nombre = nombre;
    this.marca = marca;
  }
  //Metodos
  public String getNombre(){
    return this.nombre;
  }
  public String getMarca(){
    return this.marca;
  }
}
