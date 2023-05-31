package Vista;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class Bienvenida extends JFrame implements ActionListener{
  //Elementos de la interfaz
  private JButton boton3EnRaya;
  private JButton boton4EnRaya;
  private JButton boton5EnRaya;
  private JLabel jLabel1;
  private JLabel jLabel2;
  private JMenu jMenu1;
  private JMenu jMenu3;
  private JMenu jMenu4;
  private JMenuBar jMenuBar1;
  private JMenuItem menuItemBlanco;
  private JMenuItem menuItemCreador;
  private JMenuItem menuItemMorado;
  private JMenuItem menuItemSalir;
  private JMenuItem menuItemVerde;
  public static Color fondoJuego = new Color(153,153,153);;//por defecto
  public static int enRaya;      
  //Constructor
  public Bienvenida() {
    setTitle("BIENVENID@ AL JUEGO EN RAYA");
    initComponents();
    getContentPane().setBackground(fondoJuego);
  }
  //Codigo generador
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    boton3EnRaya = new javax.swing.JButton();
    boton5EnRaya = new javax.swing.JButton();
    boton4EnRaya = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenu1 = new javax.swing.JMenu();
    menuItemSalir = new javax.swing.JMenuItem();
    jMenu3 = new javax.swing.JMenu();
    menuItemCreador = new javax.swing.JMenuItem();
    jMenu4 = new javax.swing.JMenu();
    menuItemVerde = new javax.swing.JMenuItem();
    menuItemMorado = new javax.swing.JMenuItem();
    menuItemBlanco = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//

    jLabel1.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(51, 51, 255));
    jLabel1.setText("Bienvenido al juego en raya ");

    boton3EnRaya.setBackground(new java.awt.Color(0, 153, 153));
    boton3EnRaya.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    boton3EnRaya.setForeground(new java.awt.Color(0, 0, 0));
    boton3EnRaya.setText("JUGAR 3 EN RAYA");
    boton3EnRaya.addActionListener(this);

    boton5EnRaya.setBackground(new java.awt.Color(0, 153, 153));
    boton5EnRaya.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    boton5EnRaya.setForeground(new java.awt.Color(0, 0, 0));
    boton5EnRaya.setText("JUGAR 5 EN RAYA");
    boton5EnRaya.addActionListener(this);

    boton4EnRaya.setBackground(new java.awt.Color(0, 153, 153));
    boton4EnRaya.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    boton4EnRaya.setForeground(new java.awt.Color(0, 0, 0));
    boton4EnRaya.setText("JUGAR 4 EN RAYA");
    boton4EnRaya.addActionListener(this);

    jLabel2.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(0, 0, 0));
    jLabel2.setText("Trabajo final de Taller de Programacion");
    jLabel2.setOpaque(true);

    jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));
    jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
    jMenuBar1.setOpaque(true);

    jMenu1.setText("OPCIONES");

    menuItemSalir.setText("Salir");
    menuItemSalir.addActionListener(this);
    jMenu1.add(menuItemSalir);

    jMenuBar1.add(jMenu1);

    jMenu3.setText("ACERCA DE");

    menuItemCreador.setText("Creadores");
    menuItemCreador.addActionListener(this);
    jMenu3.add(menuItemCreador);

    jMenuBar1.add(jMenu3);

    jMenu4.setText("TEMA");

    menuItemVerde.setText("Verde");
    menuItemVerde.addActionListener(this);
    jMenu4.add(menuItemVerde);

    menuItemMorado.setText("Morado");
    menuItemMorado.addActionListener(this);
    jMenu4.add(menuItemMorado);

    menuItemBlanco.setText("Blanco");
    menuItemBlanco.addActionListener(this);
    jMenu4.add(menuItemBlanco);

    jMenuBar1.add(jMenu4);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(42, 42, 42)
            .addComponent(jLabel1))
          .addGroup(layout.createSequentialGroup()
            .addGap(100, 100, 100)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(boton5EnRaya)
              .addComponent(boton3EnRaya)
              .addComponent(boton4EnRaya)))
          .addGroup(layout.createSequentialGroup()
            .addGap(70, 70, 70)
            .addComponent(jLabel2)))
        .addContainerGap(38, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(21, 21, 21)
        .addComponent(jLabel1)
        .addGap(18, 18, 18)
        .addComponent(boton3EnRaya)
        .addGap(18, 18, 18)
        .addComponent(boton4EnRaya)
        .addGap(18, 18, 18)
        .addComponent(boton5EnRaya)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
        .addComponent(jLabel2)
        .addGap(16, 16, 16))
    );

    pack();
  }// </editor-fold>                                                                   

  //Metodos
  //-------------Para controlar los clicks que haga el usuario
  public void actionPerformed(ActionEvent e) {
    //Boton de en raya
    if(e.getSource()==boton3EnRaya){
      Bienvenida.enRaya = 3;
      ModoJuego modoJuego = new ModoJuego();
      modoJuego.setBounds(0, 0, 400, 400);
      modoJuego.setLocationRelativeTo(null);
      modoJuego.setResizable(true);
      modoJuego.setVisible(true);
      this.setVisible(false);//Ocultamos bienvenida una vez abierta otra interfaz
    }else if(e.getSource()==boton4EnRaya){
      Bienvenida.enRaya = 4;
      ModoJuego modoJuego = new ModoJuego();
      modoJuego.setBounds(0, 0, 400, 400);
      modoJuego.setLocationRelativeTo(null);
      modoJuego.setResizable(true);
      modoJuego.setVisible(true);
      this.setVisible(false);
    }else if(e.getSource()==boton5EnRaya){
      Bienvenida.enRaya = 5;
      ModoJuego modoJuego = new ModoJuego();
      modoJuego.setBounds(0, 0, 400, 400);
      modoJuego.setLocationRelativeTo(null);
      modoJuego.setResizable(true);
      modoJuego.setVisible(true);
      this.setVisible(false);
    }
    //Control de los menu items
    if(e.getSource()==menuItemSalir){
      System.exit(0);
    }else if(e.getSource()==menuItemCreador){
    JOptionPane.showMessageDialog(null, "☼☼☼ Felipe Rivera Leyton Ludwin ☼☼☼\n☼☼☼ Mamani Adam Jhoel ☼☼☼\n☼☼☼ Katherine Valeria Roman Verduguez ☼☼☼");
    }else if(e.getSource()==menuItemVerde){
      getContentPane().setBackground(new Color(0,204,0));
      fondoJuego = new Color(0,204,0);
    }else if(e.getSource()==menuItemMorado){
      getContentPane().setBackground(new Color(51,0,51));
      fondoJuego = new Color(51,0,51);
    }else if(e.getSource()==menuItemBlanco){
      getContentPane().setBackground(new Color(255,255,255));
      fondoJuego = new Color(255,255,255);
    }
  }
}