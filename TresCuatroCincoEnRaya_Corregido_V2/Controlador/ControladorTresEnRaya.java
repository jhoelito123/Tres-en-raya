package Controlador;

import Modelo.Modelo;
import Vista.TresEnRaya;
import javax.swing.*;
import java.awt.event.*;

public class ControladorTresEnRaya {
  //Atributos
  private TresEnRaya vista;
  private Modelo modelo;
  private JLabel[][] casillas;
  
  //Constructor
  public ControladorTresEnRaya(TresEnRaya vista, Modelo modelo){
    this.vista = vista;
    this.modelo = modelo;
    this.casillas = vista.getCasillas();
    agregarListeners();
    setVictorias();
  }
  //Metodos: 
  private void agregarListeners(){
    //Agregamos un listener a cada casilla del tablero
    for(int f=0; f<casillas.length; f++){
      for(int c=0; c<casillas[f].length; c++){
        agregarEventoMaus(f,c); 
      }
    }
    //Agremos un listener al boton de refrescar
    this.vista.getBotonRefrescar().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e){
        modelo.limpiarCasillas(casillas);
      }
    });
    this.vista.getBotonSalir().addActionListener(new ActionListener(){
      @Override 
      public void actionPerformed(ActionEvent e){
        vista.setVisible(false);
        modelo.salir();
      }
    });
  }
  private void agregarEventoMaus(int f,int c){
    casillas[f][c].addMouseListener(new MouseAdapter(){
      @Override
      public void mouseClicked(MouseEvent e){
        modelo.marcarCasilla(f,c,casillas);
      }
    });
  }

  private void setVictorias(){
    JLabel j1 = vista.getVictoriasJugador1(); //Estamos recuperando la direccion de memoria y asignando a un elemento para manipular
    JLabel j2 = vista.getVictoriasJugador2();
    modelo.victorias(j1,j2);
  }

}
