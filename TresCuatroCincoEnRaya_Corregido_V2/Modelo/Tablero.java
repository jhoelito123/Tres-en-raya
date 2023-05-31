package Modelo;

import java.awt.Color;

import javax.swing.JLabel;
/*
 * Las casillas de la interfaz saran un reflejo de lo que suceda en el tablero
 */
public class Tablero{
  //Atributos
  private String[][] tablero;
  private String estado;
  private int enRaya;
  //Constructor
  public Tablero(int enRaya){
    this.enRaya = enRaya; //definimos cuanto en raya se jugara
    this.tablero = new String[enRaya*2 - 1][enRaya*2]; //creamos la matriz
    for(int i = 0; i < tablero.length; i++){
      for(int j = 0; j <tablero[i].length; j++){
        tablero[i][j] = " "; //todo el tablero inicia en " "
      }
    }
    setEstado("jugando");
  }
  //Metodos
  public String getEstado(){return this.estado;}
  public void setTablero(String[][] cambio){
      String[][] clon = cambio.clone();
      this.tablero = clon; //solo para la IA
  }
  public void setEstado(String cambio){this.estado = cambio;}
  public String[][] getTablero(){return this.tablero;}
  
  public boolean marcar(int fila, int columna, String valor,JLabel[][]casillas){ //Para reflejar en las casillas del tablero
    for(int i=tablero.length - 1; i >-1 ; i--){
      if(tablero[i][columna].equals(" ")&&(estado.equals("jugando"))){
        tablero[i][columna] = valor;
        if(valor.equals("r")){
          casillas[i][columna].setBackground(new Color(255,0,0));//rojo
        }else if(valor.equals("a")){
          casillas[i][columna].setBackground(new Color(0,0,255));//Azul
        }
        verificarEstado();
        return true;
      }    
    }
    return false;
  }
  public boolean marcar(int fila, int columna, String valor){ //Lo usa la IA
    for(int i=tablero.length - 1; i >-1 ; i--){
      if(tablero[i][columna].equals(" ")&&(estado.equals("jugando"))){
        tablero[i][columna] = valor;
        verificarEstado();
        return true;
      }    
    }
    return false;
  }
  
  public void verificarEstado(){
    boolean res = false;
    for(int i = 0; i < tablero.length; i++){
      for(int j = 0; j <tablero[i].length; j++){
        if(!tablero[i][j].equals(" ")){//no tomamos en " " ceros para verificar ganadores
          if(i<=tablero.length - enRaya){
            if(j> enRaya-2){
              res = res || verificarSO(i,j); 
            }
            if(j<=tablero[i].length - enRaya){
              res = res || verificarE(i,j);
              res = res || verificarSE(i,j);
            }
            res = res || verificarS(i,j);
          }else{
            if(j<=tablero[i].length - enRaya){
              res = res || verificarE(i,j);
            }
          }
        }
      }
    }
      if(res){
          setEstado("ganador");//si hubo, hay ganador (ultimo que marco)
      }else{
          boolean noCeros = false;
          for(int i=0;i<tablero.length ; i++){
              noCeros = noCeros || contains(" ",tablero[i]);//esta lleno y es empate 
          }
          if(!noCeros){
              setEstado("empate");
          }
      }
  }
  
  //verificacion con terminologia de puntos cardinales
  private boolean verificarE(int i, int j){
    boolean res = true;
    for(int k=1; k<enRaya ;k++){
      res = res & tablero[i][j].equals(tablero[i][j+k]);
    }
    return res;
  }
  private boolean verificarSE(int i, int j){
    boolean res = true;
    for(int k=1; k<enRaya ;k++){
      res = res & tablero[i][j].equals(tablero[i+k][j+k]);
    }
    return res;
  }
  private boolean verificarS(int i, int j){
    boolean res = true;
    for(int k=1;k<enRaya ; k++){
      res = res & tablero[i][j].equals(tablero[i+k][j]);
    }
    return res;
  }
  private boolean verificarSO(int i, int j){
    boolean res = true;
    for(int k=1;k<enRaya ; k++){
      res = res & tablero[i][j].equals(tablero[i+k][j-k]);
    }
    return res;
  }
  
  public void imprimir(){
      int k= 0;
      for(int i = 0; i < tablero.length; i++){
          for(int j = 0; j < tablero[i].length - 1; j++){
              System.out.print(tablero[i][j] + " | ");
              k = j;
          }
          System.out.print(tablero[i][k+1]);
          if (i < tablero.length -1){ 
              System.out.println();
              System.out.println("-----------------------------------");
          }else{}
      }

      System.out.println();
      System.out.println();
      System.out.println();
  }
  
  private boolean contains(String n, String[] arreglo){
    for(int i=0; i<arreglo.length; i++){
      if(n == arreglo[i]){
        return true;
      }
    }
    return false;
  }

  public void limpiarTablero(){
    for(int i = 0; i < tablero.length; i++){
      for(int j = 0; j <tablero[i].length; j++){
        tablero[i][j] = " "; //todo el tablero inicia en " "
      }
    }
    setEstado("jugando");
  }
}
