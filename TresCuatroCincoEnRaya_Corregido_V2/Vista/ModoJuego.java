package Vista;

import javax.swing.*;//Elementons de la interfaz

import java.awt.Color;//Colores de los elementos de la interfaz
import java.awt.event.*;//Eventos de los elementos de la interfaz

import Controlador.ControladorCincoEnRaya;
import Controlador.ControladorCuatroEnRaya;
import Controlador.ControladorTresEnRaya;
import Modelo.Modelo;

public class ModoJuego extends JFrame implements ActionListener {
  //Elementos de la interfaz
  private JButton botonIniciar;
  private JLabel jLabel1;
  private JLabel jLabel2;
  private JLabel jLabel3;
  private JLabel jLabel4;
  private JLabel jLabel5;
  private JLabel jLabel6;
  private JTextField marcaJugador1;
  private JTextField marcaJugador2;
  private JButton modoJuego1;
  private JButton modoJuego2;
  private JTextField nombreJugador1;
  private JTextField nombreJugador2;
  public static int modoJuego;      // 0 = defecto, 1 = pvp, 2 = contra IA
  public static String nomJugador1;
  public static String nomJugador2;
  //Constructor
  public ModoJuego() {
    this.setTitle("Vamos a jugar "+Bienvenida.enRaya+" en raya");
    getContentPane().setBackground(Bienvenida.fondoJuego);
    initComponents();
  }
  //Codigo generador                       
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    modoJuego1 = new javax.swing.JButton();
    modoJuego2 = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    nombreJugador1 = new javax.swing.JTextField("");
    nombreJugador2 = new javax.swing.JTextField("");
    jLabel4 = new javax.swing.JLabel();
    botonIniciar = new javax.swing.JButton();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    marcaJugador1 = new javax.swing.JTextField();
    marcaJugador2 = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 0, 0));
    jLabel1.setText("Seleccione el modo de juego");

    modoJuego1.setBackground(new java.awt.Color(0, 153, 153));
    modoJuego1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    modoJuego1.setForeground(new java.awt.Color(0, 0, 0));
    modoJuego1.setText("Jugador 1 vs Jugador 2");
    modoJuego1.addActionListener(this);

    modoJuego2.setBackground(new java.awt.Color(0, 153, 153));
    modoJuego2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    modoJuego2.setForeground(new java.awt.Color(0, 0, 0));
    modoJuego2.setText("Contra IA");
    modoJuego2.addActionListener(this);

    jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(0, 0, 0));
    jLabel2.setText("Jugador 1:");
    jLabel2.setOpaque(true);

    jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(0, 0, 0));
    jLabel3.setText("Jugador 2:");
    jLabel3.setOpaque(true);


    jLabel4.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(102, 102, 255));
    jLabel4.setText("Ingrese el nombre del jugador");

    botonIniciar.setBackground(new java.awt.Color(102, 102, 102));
    botonIniciar.setForeground(new java.awt.Color(0, 0, 0));
    botonIniciar.setText("INICIAR");
    botonIniciar.setOpaque(true);
    botonIniciar.addActionListener(this);

    jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(0, 0, 0));
    jLabel5.setText("Marca 1:");
    jLabel5.setOpaque(true);

    jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(0, 0, 0));
    jLabel6.setText("Marca 2:");
    jLabel6.setOpaque(true);

    //Incialmente no se puede llenar ningun campo
    nombreJugador1.setEditable(false);
    nombreJugador2.setEditable(false);
    marcaJugador1.setEditable(false);
    marcaJugador2.setEditable(false);


    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(31, 31, 31)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel1)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                      .addComponent(jLabel2)
                      .addComponent(jLabel3))
                    .addGap(27, 27, 27)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(nombreJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addComponent(nombreJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addComponent(botonIniciar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel5)
                    .addGap(18, 18, 18)
                    .addComponent(marcaJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel6)
                    .addGap(18, 18, 18)
                    .addComponent(marcaJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addContainerGap(47, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel4)
            .addGap(0, 0, Short.MAX_VALUE))))
      .addGroup(layout.createSequentialGroup()
        .addGap(98, 98, 98)
        .addComponent(modoJuego1)
        .addGap(0, 0, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addGap(144, 144, 144)
        .addComponent(modoJuego2)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(22, 22, 22)
        .addComponent(jLabel1)
        .addGap(18, 18, 18)
        .addComponent(modoJuego1)
        .addGap(18, 18, 18)
        .addComponent(modoJuego2)
        .addGap(18, 18, 18)
        .addComponent(jLabel4)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(nombreJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel2)
          .addComponent(jLabel5)
          .addComponent(marcaJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(nombreJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel6)
          .addComponent(marcaJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(27, 27, 27)
        .addComponent(botonIniciar)
        .addContainerGap(55, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>                        

  //Metodos   
  ////-------------Para controlar los clicks que haga el usuario             
  public void actionPerformed(ActionEvent e){
    //Para el boton de modo juego
    if(e.getSource()==modoJuego1){//Habilitamos los 2 campos
      ModoJuego.modoJuego = 1;
      nombreJugador1.setText("");
      marcaJugador1.setBackground(new Color(255,255,255));
      nombreJugador2.setText("");
      marcaJugador2.setBackground(new Color(255,255,255));
      nombreJugador1.setEditable(true);
      marcaJugador1.setBackground(new Color(0,0,255));//Azul
      nombreJugador2.setEditable(true);
      marcaJugador2.setBackground(new Color(255,0,0));//Rojo
    }else if(e.getSource()==modoJuego2){//Habilitamos 1 campo
      ModoJuego.modoJuego = 2;
      nombreJugador1.setText("");
      marcaJugador1.setBackground(new Color(255,255,255));
      nombreJugador2.setText("");
      marcaJugador2.setBackground(new Color(255,255,255));
      nombreJugador1.setEditable(true);
      marcaJugador1.setBackground(new Color(0,0,255));//Azul
      nombreJugador2.setEditable(false);
      nombreJugador2.setText("IA");
      marcaJugador2.setBackground(new Color(255,0,0));//Rojo
    }
    //Boton de iniciar partida
    if(e.getSource()==botonIniciar){
      nomJugador1 = this.nombreJugador1.getText().trim();
      nomJugador2 = this.nombreJugador2.getText().trim();
      if((modoJuego==0)){
        JOptionPane.showMessageDialog(null,"SECCIONE UN MODO DE JUEGO");
      }else if(modoJuego==1){
        if((nomJugador1.equals(""))||(nomJugador2.equals(""))){
          JOptionPane.showMessageDialog(null, "INGRESE NOMBRE DEL JUGADOR");
        }else{
          generarInterfaz(Bienvenida.enRaya); //Generamos el respectivo tablero
        }
      }else if(modoJuego==2){ 
        if(nomJugador1.equals("")){
          JOptionPane.showMessageDialog(null, "INGRESE NOMBRE DEL JUGADOR 1");
        }else{
          generarInterfaz(Bienvenida.enRaya); //Generamos el respectivo tablero
        }
      }
    }
  }
  private void generarInterfaz(int enRaya){
    if(enRaya==3){
      Modelo modelo1 = new Modelo();
      TresEnRaya nivel1 = new TresEnRaya();
      ControladorTresEnRaya controlador1 = new ControladorTresEnRaya(nivel1,modelo1);
      nivel1.setBounds(0, 0, 700, 600);
      nivel1.setLocationRelativeTo(null);
      nivel1.setResizable(true);
      nivel1.setVisible(true);
      this.setVisible(false);
    }else if(enRaya==4){
      Modelo modelo2 = new Modelo();
      CuatroEnRaya nivel2 = new CuatroEnRaya();
      ControladorCuatroEnRaya controlador2 = new ControladorCuatroEnRaya(nivel2,modelo2);
      nivel2.setBounds(0, 0, 860, 750);
      nivel2.setLocationRelativeTo(null);
      nivel2.setResizable(true);
      nivel2.setVisible(true);
      this.setVisible(false);
    }else if(enRaya==5){
      Modelo modelo3 = new Modelo();
      CincoEnRaya nivel3 = new CincoEnRaya();
      ControladorCincoEnRaya controlador = new ControladorCincoEnRaya(nivel3,modelo3);
      nivel3.setBounds(0, 0, 990, 900);
      nivel3.setLocationRelativeTo(null);
      nivel3.setResizable(true);
      nivel3.setVisible(true);
      this.setVisible(false);
    }
  }
}
