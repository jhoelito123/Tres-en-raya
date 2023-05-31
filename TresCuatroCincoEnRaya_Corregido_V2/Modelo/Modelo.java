package Modelo;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Vista.Bienvenida;
import Vista.ModoJuego;
/*
 * IMPORTANTE: En el modelo se va a realizar netamente la parte logica. (POO,introduccion, lo que querramos)
 */
public class Modelo {
  //Atributos
  private Jugador jugador1;
  private Jugador jugador2;
  private Tablero tablero;
  private boolean turno; //true es jugador 1
  private JLabel cuadroJ1;
  private JLabel cuadroJ2;
  private int victoriasJ1;
  private int victoriasJ2;
  //Constructor
  public Modelo(){
    this.tablero = new Tablero(Bienvenida.enRaya);                        
    this.turno = true;                                                  
    if(ModoJuego.modoJuego==1){
      this.jugador1 = new Jugador(ModoJuego.nomJugador1,"a"); //Jugador 1
      this.jugador2 = new Jugador(ModoJuego.nomJugador2,"r"); //Jugador 2
    }else if(ModoJuego.modoJuego==2){
      this.jugador1 = new Jugador(ModoJuego.nomJugador1,"a"); //Jugador 1
      this.jugador2 = new IA(ModoJuego.nomJugador2,"r");      //Jugador 2 (IA)
    }
    victoriasJ1 = 0;
    victoriasJ2 = 0;  
  }
  /*
   * El tablero es un espejo, cuando marquemos en el tablero, ese cambio se refleraja en las casillas de la interfaz
   */
  public void marcarCasilla(int i, int j, JLabel[][] casillas){
    String marca;
    boolean marcado = false;
    if(turno){
      marca = this.jugador1.getMarca();
    }else{
      marca = this.jugador2.getMarca();
    }
    //Verificamos el modo juego para marcar
    if((ModoJuego.modoJuego==1)){//pvp
      marcado = this.tablero.marcar(i,j,marca,casillas);
      if(marcado){
        turno=!turno;
        imprimirGanador(marca);
      }
    }else{//Contra IA
      if(turno){
        marcado = this.tablero.marcar(i,j,marca,casillas);
        if(marcado){
          turno=!turno;
          marcado = !marcado;
          imprimirGanador(marca);
          if(!(this.tablero.getEstado().equals("ganador"))){//Si jugador 1 marco, le toca a la IA
            IA computador = (IA)jugador2;
            int[] posicion = computador.strat(tablero, jugador1);//Obtenemos una posiciona  ser marcada
            marcado = this.tablero.marcar(posicion[0],posicion[1],jugador2.getMarca(),casillas);
            turno = !turno;
            imprimirGanador(computador.getMarca());
          }
        }
      }
    }
    //tablero.imprimir();
  }
  
  private void imprimirGanador(String marca){
    if(this.tablero.getEstado().equals("ganador")){
      if(marca.equals(jugador1.getMarca())){
        JOptionPane.showMessageDialog(null,"Ganador "+jugador1.getNombre());
        victoriasJ1++;
        cuadroJ1.setText("00"+String.valueOf(victoriasJ1));
      }else{
        JOptionPane.showMessageDialog(null,"Ganador "+jugador2.getNombre());
        victoriasJ2++;
        cuadroJ2.setText("00"+String.valueOf(victoriasJ2));
      }
    }else if(this.tablero.getEstado().equals("empate")){
      JOptionPane.showMessageDialog(null,"EXISTE UN EMPATE");
    }
  }
  public void limpiarCasillas(JLabel[][] casillas) {
    for(int f=0; f<casillas.length; f++){
      for(int c=0; c<casillas[f].length; c++){
        casillas[f][c].setBackground(new Color(255,255,255));
      }
    }
    this.tablero.limpiarTablero();
    turno = true;
  }
  public void victorias(JLabel j1, JLabel j2) {
    cuadroJ1 = j1;
    cuadroJ2 = j2;
  }
  public void salir(){
    Bienvenida interfazBienvenida = new Bienvenida();
    interfazBienvenida.setBounds(0, 0, 401, 330);
    interfazBienvenida.setLocationRelativeTo(null);
    interfazBienvenida.setResizable(true);
    interfazBienvenida.setVisible(true);

  }
}
