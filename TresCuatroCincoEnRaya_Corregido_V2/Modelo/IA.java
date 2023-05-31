package Modelo;



public class IA extends Jugador {
  //Constructor
  public IA(String nombre, String marca){
    super(nombre,marca);
  }
  //Metodos
  public int[] strat(Tablero tablero, Jugador rival){
    int[] valores = new int[2];
    valores = paraGanar(tablero);
    if(valores[0] == -1){
      valores = paraBloquear(tablero, rival);
    }
    //Revisar.. (Revisa si el jugador gana)................
    if(valores[0] == -1){
      valores = azar(tablero);
    }
    return valores;
  }

  private int[] paraGanar(Tablero tablero){
    boolean encontrado = false;
    int[] valores = new int[2];
    String[][] copia = clonar(tablero.getTablero());
    Tablero prueba = new Tablero(copia[0].length / 2);
    prueba.setTablero(copia);
    for(int j=0;j < copia[0].length ; j++){
      copia = clonar(tablero.getTablero());
      prueba.setTablero(copia);
      if(prueba.marcar(1,j,getMarca())){
        if(prueba.getEstado().equals("ganador")){
          valores[0] = 1; //lo que sea
          valores[1]=j;
          encontrado = true;
        }
      }    
      if(encontrado){
        j = copia[0].length;
      }
    }
    if(!encontrado){
      valores[0]= -1 ; valores[1]= -1;
    }
    return valores;
  }
  private int[] paraBloquear(Tablero tablero, Jugador rival){
    boolean encontrado = false;
    int[] valores = new int[2];
    String[][] copia2 = clonar(tablero.getTablero());
    Tablero prueba = new Tablero(copia2[0].length / 2);
    prueba.setTablero(copia2);
    for(int j=0;j < copia2[0].length ; j++){
      copia2 = clonar(tablero.getTablero());
      prueba.setTablero(copia2);
      if(prueba.marcar(1,j,rival.getMarca())){
        if(prueba.getEstado().equals("ganador")){
          valores[0] = 1; //lo que sea
          valores[1]=j;
          encontrado = true;
        }
      }    
      if(encontrado){
        j = copia2[0].length;
      }
    }
    if(!encontrado){
      valores[0]= -1 ; valores[1]= -1;
    }
    return valores;
  }
  private int[] azar(Tablero tablero){
    int[] valores = new int[2];
    int j = 0;
    String[][] copia = clonar(tablero.getTablero());
    Tablero prueba = new Tablero(tablero.getTablero()[0].length / 2);
    prueba.setTablero(copia);
    boolean disponible = false;
    while(!disponible){
      j = (int) (Math.random() * tablero.getTablero()[0].length);
      if(prueba.marcar(1,j,getMarca())){
        valores[0]=1 ; valores[1]=j;
        disponible = true;
      }
      copia = clonar(tablero.getTablero());
      prueba.setTablero(copia);    
    }
    return valores;
  }

  private String[][] clonar(String[][] a){
    String[][] res = new String[a.length][a[0].length];
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a[0].length;j++){
        String letra = "" + a[i][j].charAt(0);
        res[i][j]= letra;
      }
    }
    return res;
  }
}
