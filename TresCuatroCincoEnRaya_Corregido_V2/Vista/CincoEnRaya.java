package Vista;

import javax.swing.*;


public class CincoEnRaya extends javax.swing.JFrame {
  //Elementos de la interfaz
  private javax.swing.JButton botonRefrescar;
  private javax.swing.JLabel casilla1;
  private javax.swing.JLabel casilla10;
  private javax.swing.JLabel casilla11;
  private javax.swing.JLabel casilla12;
  private javax.swing.JLabel casilla13;
  private javax.swing.JLabel casilla14;
  private javax.swing.JLabel casilla15;
  private javax.swing.JLabel casilla16;
  private javax.swing.JLabel casilla17;
  private javax.swing.JLabel casilla18;
  private javax.swing.JLabel casilla19;
  private javax.swing.JLabel casilla2;
  private javax.swing.JLabel casilla20;
  private javax.swing.JLabel casilla21;
  private javax.swing.JLabel casilla22;
  private javax.swing.JLabel casilla23;
  private javax.swing.JLabel casilla24;
  private javax.swing.JLabel casilla25;
  private javax.swing.JLabel casilla26;
  private javax.swing.JLabel casilla27;
  private javax.swing.JLabel casilla28;
  private javax.swing.JLabel casilla29;
  private javax.swing.JLabel casilla3;
  private javax.swing.JLabel casilla30;
  private javax.swing.JLabel casilla31;
  private javax.swing.JLabel casilla32;
  private javax.swing.JLabel casilla33;
  private javax.swing.JLabel casilla34;
  private javax.swing.JLabel casilla35;
  private javax.swing.JLabel casilla36;
  private javax.swing.JLabel casilla37;
  private javax.swing.JLabel casilla38;
  private javax.swing.JLabel casilla39;
  private javax.swing.JLabel casilla4;
  private javax.swing.JLabel casilla40;
  private javax.swing.JLabel casilla41;
  private javax.swing.JLabel casilla42;
  private javax.swing.JLabel casilla43;
  private javax.swing.JLabel casilla44;
  private javax.swing.JLabel casilla45;
  private javax.swing.JLabel casilla46;
  private javax.swing.JLabel casilla47;
  private javax.swing.JLabel casilla48;
  private javax.swing.JLabel casilla49;
  private javax.swing.JLabel casilla5;
  private javax.swing.JLabel casilla50;
  private javax.swing.JLabel casilla51;
  private javax.swing.JLabel casilla52;
  private javax.swing.JLabel casilla53;
  private javax.swing.JLabel casilla54;
  private javax.swing.JLabel casilla55;
  private javax.swing.JLabel casilla56;
  private javax.swing.JLabel casilla57;
  private javax.swing.JLabel casilla58;
  private javax.swing.JLabel casilla59;
  private javax.swing.JLabel casilla6;
  private javax.swing.JLabel casilla60;
  private javax.swing.JLabel casilla61;
  private javax.swing.JLabel casilla62;
  private javax.swing.JLabel casilla63;
  private javax.swing.JLabel casilla64;
  private javax.swing.JLabel casilla65;
  private javax.swing.JLabel casilla66;
  private javax.swing.JLabel casilla67;
  private javax.swing.JLabel casilla68;
  private javax.swing.JLabel casilla69;
  private javax.swing.JLabel casilla7;
  private javax.swing.JLabel casilla70;
  private javax.swing.JLabel casilla71;
  private javax.swing.JLabel casilla72;
  private javax.swing.JLabel casilla73;
  private javax.swing.JLabel casilla74;
  private javax.swing.JLabel casilla75;
  private javax.swing.JLabel casilla76;
  private javax.swing.JLabel casilla77;
  private javax.swing.JLabel casilla78;
  private javax.swing.JLabel casilla79;
  private javax.swing.JLabel casilla8;
  private javax.swing.JLabel casilla80;
  private javax.swing.JLabel casilla81;
  private javax.swing.JLabel casilla82;
  private javax.swing.JLabel casilla83;
  private javax.swing.JLabel casilla84;
  private javax.swing.JLabel casilla85;
  private javax.swing.JLabel casilla86;
  private javax.swing.JLabel casilla87;
  private javax.swing.JLabel casilla88;
  private javax.swing.JLabel casilla89;
  private javax.swing.JLabel casilla9;
  private javax.swing.JLabel casilla90;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel32;
  private javax.swing.JLabel jLabel33;
  private javax.swing.JLabel jLabel34;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel victoriasJugador1;
  private javax.swing.JLabel victoriasJugador2;
  private javax.swing.JLabel[][] casillas; //Mi tablero 
  private javax.swing.JButton botonSalir;
  //Constructor
  public CincoEnRaya() {
    initComponents();
    casillas = new JLabel[9][10];
    this.setTitle("Vamos a jugar "+Bienvenida.enRaya+" en raya");
    getContentPane().setBackground(Bienvenida.fondoJuego);
    setCasillas();
    this.jLabel33.setText(ModoJuego.nomJugador1+"(azul)");
    this.jLabel34.setText(ModoJuego.nomJugador2+"(rojo)");
  }
  //Codigo generador                         
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    casilla1 = new javax.swing.JLabel();
    casilla3 = new javax.swing.JLabel();
    casilla5 = new javax.swing.JLabel();
    casilla2 = new javax.swing.JLabel();
    casilla6 = new javax.swing.JLabel();
    casilla4 = new javax.swing.JLabel();
    casilla7 = new javax.swing.JLabel();
    casilla8 = new javax.swing.JLabel();
    casilla9 = new javax.swing.JLabel();
    casilla10 = new javax.swing.JLabel();
    casilla11 = new javax.swing.JLabel();
    casilla12 = new javax.swing.JLabel();
    casilla13 = new javax.swing.JLabel();
    casilla14 = new javax.swing.JLabel();
    casilla15 = new javax.swing.JLabel();
    casilla16 = new javax.swing.JLabel();
    casilla17 = new javax.swing.JLabel();
    casilla18 = new javax.swing.JLabel();
    casilla19 = new javax.swing.JLabel();
    casilla20 = new javax.swing.JLabel();
    casilla21 = new javax.swing.JLabel();
    casilla22 = new javax.swing.JLabel();
    casilla23 = new javax.swing.JLabel();
    casilla24 = new javax.swing.JLabel();
    casilla25 = new javax.swing.JLabel();
    casilla26 = new javax.swing.JLabel();
    casilla27 = new javax.swing.JLabel();
    casilla28 = new javax.swing.JLabel();
    casilla29 = new javax.swing.JLabel();
    casilla30 = new javax.swing.JLabel();
    casilla31 = new javax.swing.JLabel();
    casilla32 = new javax.swing.JLabel();
    casilla33 = new javax.swing.JLabel();
    casilla34 = new javax.swing.JLabel();
    casilla35 = new javax.swing.JLabel();
    casilla36 = new javax.swing.JLabel();
    casilla37 = new javax.swing.JLabel();
    casilla38 = new javax.swing.JLabel();
    casilla39 = new javax.swing.JLabel();
    casilla40 = new javax.swing.JLabel();
    casilla41 = new javax.swing.JLabel();
    casilla42 = new javax.swing.JLabel();
    casilla43 = new javax.swing.JLabel();
    casilla44 = new javax.swing.JLabel();
    casilla45 = new javax.swing.JLabel();
    casilla46 = new javax.swing.JLabel();
    casilla47 = new javax.swing.JLabel();
    casilla48 = new javax.swing.JLabel();
    casilla49 = new javax.swing.JLabel();
    casilla50 = new javax.swing.JLabel();
    casilla51 = new javax.swing.JLabel();
    casilla52 = new javax.swing.JLabel();
    casilla53 = new javax.swing.JLabel();
    casilla54 = new javax.swing.JLabel();
    casilla55 = new javax.swing.JLabel();
    casilla56 = new javax.swing.JLabel();
    casilla57 = new javax.swing.JLabel();
    casilla58 = new javax.swing.JLabel();
    casilla59 = new javax.swing.JLabel();
    casilla60 = new javax.swing.JLabel();
    casilla61 = new javax.swing.JLabel();
    casilla62 = new javax.swing.JLabel();
    casilla63 = new javax.swing.JLabel();
    casilla64 = new javax.swing.JLabel();
    casilla65 = new javax.swing.JLabel();
    casilla66 = new javax.swing.JLabel();
    casilla67 = new javax.swing.JLabel();
    casilla68 = new javax.swing.JLabel();
    casilla69 = new javax.swing.JLabel();
    casilla70 = new javax.swing.JLabel();
    casilla71 = new javax.swing.JLabel();
    casilla72 = new javax.swing.JLabel();
    casilla73 = new javax.swing.JLabel();
    casilla74 = new javax.swing.JLabel();
    casilla75 = new javax.swing.JLabel();
    casilla76 = new javax.swing.JLabel();
    casilla77 = new javax.swing.JLabel();
    casilla78 = new javax.swing.JLabel();
    casilla79 = new javax.swing.JLabel();
    casilla80 = new javax.swing.JLabel();
    casilla81 = new javax.swing.JLabel();
    casilla82 = new javax.swing.JLabel();
    casilla83 = new javax.swing.JLabel();
    casilla84 = new javax.swing.JLabel();
    casilla85 = new javax.swing.JLabel();
    casilla86 = new javax.swing.JLabel();
    casilla87 = new javax.swing.JLabel();
    casilla88 = new javax.swing.JLabel();
    casilla89 = new javax.swing.JLabel();
    casilla90 = new javax.swing.JLabel();
    jLabel32 = new javax.swing.JLabel();
    jLabel33 = new javax.swing.JLabel();
    jLabel34 = new javax.swing.JLabel();
    victoriasJugador2 = new javax.swing.JLabel();
    botonRefrescar = new javax.swing.JButton();
    victoriasJugador1 = new javax.swing.JLabel();
    botonSalir = new JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setBackground(new java.awt.Color(255, 255, 255));
    jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 0, 0));
    jLabel1.setText("CONTROL");

    jPanel1.setBackground(new java.awt.Color(0, 0, 0));

    casilla1.setBackground(new java.awt.Color(255, 255, 255));
    casilla1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla1.setForeground(new java.awt.Color(0, 0, 0));
    casilla1.setOpaque(true);
    casilla1.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla3.setBackground(new java.awt.Color(255, 255, 255));
    casilla3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla3.setForeground(new java.awt.Color(0, 0, 0));
    casilla3.setOpaque(true);
    casilla3.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla5.setBackground(new java.awt.Color(255, 255, 255));
    casilla5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla5.setForeground(new java.awt.Color(0, 0, 0));
    casilla5.setOpaque(true);
    casilla5.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla2.setBackground(new java.awt.Color(255, 255, 255));
    casilla2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla2.setForeground(new java.awt.Color(0, 0, 0));
    casilla2.setOpaque(true);
    casilla2.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla6.setBackground(new java.awt.Color(255, 255, 255));
    casilla6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla6.setForeground(new java.awt.Color(0, 0, 0));
    casilla6.setOpaque(true);
    casilla6.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla4.setBackground(new java.awt.Color(255, 255, 255));
    casilla4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla4.setForeground(new java.awt.Color(0, 0, 0));
    casilla4.setOpaque(true);
    casilla4.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla7.setBackground(new java.awt.Color(255, 255, 255));
    casilla7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla7.setForeground(new java.awt.Color(0, 0, 0));
    casilla7.setOpaque(true);
    casilla7.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla8.setBackground(new java.awt.Color(255, 255, 255));
    casilla8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla8.setForeground(new java.awt.Color(0, 0, 0));
    casilla8.setOpaque(true);
    casilla8.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla9.setBackground(new java.awt.Color(255, 255, 255));
    casilla9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla9.setForeground(new java.awt.Color(0, 0, 0));
    casilla9.setOpaque(true);
    casilla9.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla10.setBackground(new java.awt.Color(255, 255, 255));
    casilla10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla10.setForeground(new java.awt.Color(0, 0, 0));
    casilla10.setOpaque(true);
    casilla10.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla11.setBackground(new java.awt.Color(255, 255, 255));
    casilla11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla11.setForeground(new java.awt.Color(0, 0, 0));
    casilla11.setOpaque(true);
    casilla11.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla12.setBackground(new java.awt.Color(255, 255, 255));
    casilla12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla12.setForeground(new java.awt.Color(0, 0, 0));
    casilla12.setOpaque(true);
    casilla12.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla13.setBackground(new java.awt.Color(255, 255, 255));
    casilla13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla13.setForeground(new java.awt.Color(0, 0, 0));
    casilla13.setOpaque(true);
    casilla13.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla14.setBackground(new java.awt.Color(255, 255, 255));
    casilla14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla14.setForeground(new java.awt.Color(0, 0, 0));
    casilla14.setOpaque(true);
    casilla14.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla15.setBackground(new java.awt.Color(255, 255, 255));
    casilla15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla15.setForeground(new java.awt.Color(0, 0, 0));
    casilla15.setOpaque(true);
    casilla15.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla16.setBackground(new java.awt.Color(255, 255, 255));
    casilla16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla16.setForeground(new java.awt.Color(0, 0, 0));
    casilla16.setOpaque(true);
    casilla16.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla17.setBackground(new java.awt.Color(255, 255, 255));
    casilla17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla17.setForeground(new java.awt.Color(0, 0, 0));
    casilla17.setOpaque(true);
    casilla17.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla18.setBackground(new java.awt.Color(255, 255, 255));
    casilla18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla18.setForeground(new java.awt.Color(0, 0, 0));
    casilla18.setOpaque(true);
    casilla18.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla19.setBackground(new java.awt.Color(255, 255, 255));
    casilla19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla19.setForeground(new java.awt.Color(0, 0, 0));
    casilla19.setOpaque(true);
    casilla19.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla20.setBackground(new java.awt.Color(255, 255, 255));
    casilla20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla20.setForeground(new java.awt.Color(0, 0, 0));
    casilla20.setOpaque(true);
    casilla20.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla21.setBackground(new java.awt.Color(255, 255, 255));
    casilla21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla21.setForeground(new java.awt.Color(0, 0, 0));
    casilla21.setOpaque(true);
    casilla21.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla22.setBackground(new java.awt.Color(255, 255, 255));
    casilla22.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla22.setForeground(new java.awt.Color(0, 0, 0));
    casilla22.setOpaque(true);
    casilla22.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla23.setBackground(new java.awt.Color(255, 255, 255));
    casilla23.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla23.setForeground(new java.awt.Color(0, 0, 0));
    casilla23.setOpaque(true);
    casilla23.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla24.setBackground(new java.awt.Color(255, 255, 255));
    casilla24.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla24.setForeground(new java.awt.Color(0, 0, 0));
    casilla24.setOpaque(true);
    casilla24.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla25.setBackground(new java.awt.Color(255, 255, 255));
    casilla25.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla25.setForeground(new java.awt.Color(0, 0, 0));
    casilla25.setOpaque(true);
    casilla25.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla26.setBackground(new java.awt.Color(255, 255, 255));
    casilla26.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla26.setForeground(new java.awt.Color(0, 0, 0));
    casilla26.setOpaque(true);
    casilla26.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla27.setBackground(new java.awt.Color(255, 255, 255));
    casilla27.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla27.setForeground(new java.awt.Color(0, 0, 0));
    casilla27.setOpaque(true);
    casilla27.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla28.setBackground(new java.awt.Color(255, 255, 255));
    casilla28.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla28.setForeground(new java.awt.Color(0, 0, 0));
    casilla28.setOpaque(true);
    casilla28.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla29.setBackground(new java.awt.Color(255, 255, 255));
    casilla29.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla29.setForeground(new java.awt.Color(0, 0, 0));
    casilla29.setOpaque(true);
    casilla29.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla30.setBackground(new java.awt.Color(255, 255, 255));
    casilla30.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla30.setForeground(new java.awt.Color(0, 0, 0));
    casilla30.setOpaque(true);
    casilla30.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla31.setBackground(new java.awt.Color(255, 255, 255));
    casilla31.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla31.setForeground(new java.awt.Color(0, 0, 0));
    casilla31.setOpaque(true);
    casilla31.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla32.setBackground(new java.awt.Color(255, 255, 255));
    casilla32.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla32.setForeground(new java.awt.Color(0, 0, 0));
    casilla32.setOpaque(true);
    casilla32.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla33.setBackground(new java.awt.Color(255, 255, 255));
    casilla33.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla33.setForeground(new java.awt.Color(0, 0, 0));
    casilla33.setOpaque(true);
    casilla33.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla34.setBackground(new java.awt.Color(255, 255, 255));
    casilla34.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla34.setForeground(new java.awt.Color(0, 0, 0));
    casilla34.setOpaque(true);
    casilla34.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla35.setBackground(new java.awt.Color(255, 255, 255));
    casilla35.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla35.setForeground(new java.awt.Color(0, 0, 0));
    casilla35.setOpaque(true);
    casilla35.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla36.setBackground(new java.awt.Color(255, 255, 255));
    casilla36.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla36.setForeground(new java.awt.Color(0, 0, 0));
    casilla36.setOpaque(true);
    casilla36.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla37.setBackground(new java.awt.Color(255, 255, 255));
    casilla37.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla37.setForeground(new java.awt.Color(0, 0, 0));
    casilla37.setOpaque(true);
    casilla37.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla38.setBackground(new java.awt.Color(255, 255, 255));
    casilla38.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla38.setForeground(new java.awt.Color(0, 0, 0));
    casilla38.setOpaque(true);
    casilla38.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla39.setBackground(new java.awt.Color(255, 255, 255));
    casilla39.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla39.setForeground(new java.awt.Color(0, 0, 0));
    casilla39.setOpaque(true);
    casilla39.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla40.setBackground(new java.awt.Color(255, 255, 255));
    casilla40.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla40.setForeground(new java.awt.Color(0, 0, 0));
    casilla40.setOpaque(true);
    casilla40.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla41.setBackground(new java.awt.Color(255, 255, 255));
    casilla41.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla41.setForeground(new java.awt.Color(0, 0, 0));
    casilla41.setOpaque(true);
    casilla41.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla42.setBackground(new java.awt.Color(255, 255, 255));
    casilla42.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla42.setForeground(new java.awt.Color(0, 0, 0));
    casilla42.setOpaque(true);
    casilla42.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla43.setBackground(new java.awt.Color(255, 255, 255));
    casilla43.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla43.setForeground(new java.awt.Color(0, 0, 0));
    casilla43.setOpaque(true);
    casilla43.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla44.setBackground(new java.awt.Color(255, 255, 255));
    casilla44.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla44.setForeground(new java.awt.Color(0, 0, 0));
    casilla44.setOpaque(true);
    casilla44.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla45.setBackground(new java.awt.Color(255, 255, 255));
    casilla45.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla45.setForeground(new java.awt.Color(0, 0, 0));
    casilla45.setOpaque(true);
    casilla45.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla46.setBackground(new java.awt.Color(255, 255, 255));
    casilla46.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla46.setForeground(new java.awt.Color(0, 0, 0));
    casilla46.setOpaque(true);
    casilla46.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla47.setBackground(new java.awt.Color(255, 255, 255));
    casilla47.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla47.setForeground(new java.awt.Color(0, 0, 0));
    casilla47.setOpaque(true);
    casilla47.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla48.setBackground(new java.awt.Color(255, 255, 255));
    casilla48.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla48.setForeground(new java.awt.Color(0, 0, 0));
    casilla48.setOpaque(true);
    casilla48.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla49.setBackground(new java.awt.Color(255, 255, 255));
    casilla49.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla49.setForeground(new java.awt.Color(0, 0, 0));
    casilla49.setOpaque(true);
    casilla49.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla50.setBackground(new java.awt.Color(255, 255, 255));
    casilla50.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla50.setForeground(new java.awt.Color(0, 0, 0));
    casilla50.setOpaque(true);
    casilla50.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla51.setBackground(new java.awt.Color(255, 255, 255));
    casilla51.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla51.setForeground(new java.awt.Color(0, 0, 0));
    casilla51.setOpaque(true);
    casilla51.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla52.setBackground(new java.awt.Color(255, 255, 255));
    casilla52.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla52.setForeground(new java.awt.Color(0, 0, 0));
    casilla52.setOpaque(true);
    casilla52.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla53.setBackground(new java.awt.Color(255, 255, 255));
    casilla53.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla53.setForeground(new java.awt.Color(0, 0, 0));
    casilla53.setOpaque(true);
    casilla53.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla54.setBackground(new java.awt.Color(255, 255, 255));
    casilla54.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla54.setForeground(new java.awt.Color(0, 0, 0));
    casilla54.setOpaque(true);
    casilla54.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla55.setBackground(new java.awt.Color(255, 255, 255));
    casilla55.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla55.setForeground(new java.awt.Color(0, 0, 0));
    casilla55.setOpaque(true);
    casilla55.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla56.setBackground(new java.awt.Color(255, 255, 255));
    casilla56.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla56.setForeground(new java.awt.Color(0, 0, 0));
    casilla56.setOpaque(true);
    casilla56.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla57.setBackground(new java.awt.Color(255, 255, 255));
    casilla57.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla57.setForeground(new java.awt.Color(0, 0, 0));
    casilla57.setOpaque(true);
    casilla57.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla58.setBackground(new java.awt.Color(255, 255, 255));
    casilla58.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla58.setForeground(new java.awt.Color(0, 0, 0));
    casilla58.setOpaque(true);
    casilla58.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla59.setBackground(new java.awt.Color(255, 255, 255));
    casilla59.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla59.setForeground(new java.awt.Color(0, 0, 0));
    casilla59.setOpaque(true);
    casilla59.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla60.setBackground(new java.awt.Color(255, 255, 255));
    casilla60.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla60.setForeground(new java.awt.Color(0, 0, 0));
    casilla60.setOpaque(true);
    casilla60.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla61.setBackground(new java.awt.Color(255, 255, 255));
    casilla61.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla61.setForeground(new java.awt.Color(0, 0, 0));
    casilla61.setOpaque(true);
    casilla61.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla62.setBackground(new java.awt.Color(255, 255, 255));
    casilla62.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla62.setForeground(new java.awt.Color(0, 0, 0));
    casilla62.setOpaque(true);
    casilla62.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla63.setBackground(new java.awt.Color(255, 255, 255));
    casilla63.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla63.setForeground(new java.awt.Color(0, 0, 0));
    casilla63.setOpaque(true);
    casilla63.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla64.setBackground(new java.awt.Color(255, 255, 255));
    casilla64.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla64.setForeground(new java.awt.Color(0, 0, 0));
    casilla64.setOpaque(true);
    casilla64.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla65.setBackground(new java.awt.Color(255, 255, 255));
    casilla65.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla65.setForeground(new java.awt.Color(0, 0, 0));
    casilla65.setOpaque(true);
    casilla65.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla66.setBackground(new java.awt.Color(255, 255, 255));
    casilla66.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla66.setForeground(new java.awt.Color(0, 0, 0));
    casilla66.setOpaque(true);
    casilla66.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla67.setBackground(new java.awt.Color(255, 255, 255));
    casilla67.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla67.setForeground(new java.awt.Color(0, 0, 0));
    casilla67.setOpaque(true);
    casilla67.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla68.setBackground(new java.awt.Color(255, 255, 255));
    casilla68.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla68.setForeground(new java.awt.Color(0, 0, 0));
    casilla68.setOpaque(true);
    casilla68.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla69.setBackground(new java.awt.Color(255, 255, 255));
    casilla69.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla69.setForeground(new java.awt.Color(0, 0, 0));
    casilla69.setOpaque(true);
    casilla69.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla70.setBackground(new java.awt.Color(255, 255, 255));
    casilla70.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla70.setForeground(new java.awt.Color(0, 0, 0));
    casilla70.setOpaque(true);
    casilla70.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla71.setBackground(new java.awt.Color(255, 255, 255));
    casilla71.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla71.setForeground(new java.awt.Color(0, 0, 0));
    casilla71.setOpaque(true);
    casilla71.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla72.setBackground(new java.awt.Color(255, 255, 255));
    casilla72.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla72.setForeground(new java.awt.Color(0, 0, 0));
    casilla72.setOpaque(true);
    casilla72.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla73.setBackground(new java.awt.Color(255, 255, 255));
    casilla73.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla73.setForeground(new java.awt.Color(0, 0, 0));
    casilla73.setOpaque(true);
    casilla73.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla74.setBackground(new java.awt.Color(255, 255, 255));
    casilla74.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla74.setForeground(new java.awt.Color(0, 0, 0));
    casilla74.setOpaque(true);
    casilla74.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla75.setBackground(new java.awt.Color(255, 255, 255));
    casilla75.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla75.setForeground(new java.awt.Color(0, 0, 0));
    casilla75.setOpaque(true);
    casilla75.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla76.setBackground(new java.awt.Color(255, 255, 255));
    casilla76.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla76.setForeground(new java.awt.Color(0, 0, 0));
    casilla76.setOpaque(true);
    casilla76.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla77.setBackground(new java.awt.Color(255, 255, 255));
    casilla77.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla77.setForeground(new java.awt.Color(0, 0, 0));
    casilla77.setOpaque(true);
    casilla77.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla78.setBackground(new java.awt.Color(255, 255, 255));
    casilla78.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla78.setForeground(new java.awt.Color(0, 0, 0));
    casilla78.setOpaque(true);
    casilla78.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla79.setBackground(new java.awt.Color(255, 255, 255));
    casilla79.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla79.setForeground(new java.awt.Color(0, 0, 0));
    casilla79.setOpaque(true);
    casilla79.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla80.setBackground(new java.awt.Color(255, 255, 255));
    casilla80.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla80.setForeground(new java.awt.Color(0, 0, 0));
    casilla80.setOpaque(true);
    casilla80.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla81.setBackground(new java.awt.Color(255, 255, 255));
    casilla81.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla81.setForeground(new java.awt.Color(0, 0, 0));
    casilla81.setOpaque(true);
    casilla81.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla82.setBackground(new java.awt.Color(255, 255, 255));
    casilla82.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla82.setForeground(new java.awt.Color(0, 0, 0));
    casilla82.setOpaque(true);
    casilla82.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla83.setBackground(new java.awt.Color(255, 255, 255));
    casilla83.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla83.setForeground(new java.awt.Color(0, 0, 0));
    casilla83.setOpaque(true);
    casilla83.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla84.setBackground(new java.awt.Color(255, 255, 255));
    casilla84.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla84.setForeground(new java.awt.Color(0, 0, 0));
    casilla84.setOpaque(true);
    casilla84.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla85.setBackground(new java.awt.Color(255, 255, 255));
    casilla85.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla85.setForeground(new java.awt.Color(0, 0, 0));
    casilla85.setOpaque(true);
    casilla85.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla86.setBackground(new java.awt.Color(255, 255, 255));
    casilla86.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla86.setForeground(new java.awt.Color(0, 0, 0));
    casilla86.setOpaque(true);
    casilla86.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla87.setBackground(new java.awt.Color(255, 255, 255));
    casilla87.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla87.setForeground(new java.awt.Color(0, 0, 0));
    casilla87.setOpaque(true);
    casilla87.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla88.setBackground(new java.awt.Color(255, 255, 255));
    casilla88.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla88.setForeground(new java.awt.Color(0, 0, 0));
    casilla88.setOpaque(true);
    casilla88.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla89.setBackground(new java.awt.Color(255, 255, 255));
    casilla89.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla89.setForeground(new java.awt.Color(0, 0, 0));
    casilla89.setOpaque(true);
    casilla89.setPreferredSize(new java.awt.Dimension(50, 50));

    casilla90.setBackground(new java.awt.Color(255, 255, 255));
    casilla90.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    casilla90.setForeground(new java.awt.Color(0, 0, 0));
    casilla90.setOpaque(true);
    casilla90.setPreferredSize(new java.awt.Dimension(50, 50));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(casilla81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(casilla82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(casilla83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(casilla84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(casilla85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(casilla86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(casilla87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(casilla88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(casilla89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(casilla90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
              .addComponent(casilla71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(casilla72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(casilla73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(casilla74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(casilla75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(casilla76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(casilla77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(casilla78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(casilla79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(casilla80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(casilla61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(casilla62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(casilla63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(casilla64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(casilla65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(casilla66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(casilla67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(casilla68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(casilla69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(casilla70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(casilla51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(casilla52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(casilla53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(casilla54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(casilla55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(casilla56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(casilla57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(casilla58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(casilla59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(casilla60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(casilla41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(casilla42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(casilla43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(casilla44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(casilla45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(casilla46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(casilla47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(casilla48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(casilla49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(casilla50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(casilla31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(casilla32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(casilla33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(casilla34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(casilla35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(casilla36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(casilla37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(casilla38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(casilla39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(casilla40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                      .addComponent(casilla21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addGap(18, 18, 18)
                      .addComponent(casilla22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addGap(18, 18, 18)
                      .addComponent(casilla23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addGap(18, 18, 18)
                      .addComponent(casilla24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addGap(18, 18, 18)
                      .addComponent(casilla25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addGap(18, 18, 18)
                      .addComponent(casilla26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addGap(18, 18, 18)
                      .addComponent(casilla27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addGap(18, 18, 18)
                      .addComponent(casilla28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addGap(18, 18, 18)
                      .addComponent(casilla29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addGap(18, 18, 18)
                      .addComponent(casilla30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(casilla11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(casilla12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(casilla13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(casilla14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(casilla15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(casilla16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(casilla17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(casilla18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(casilla19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(casilla20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                      .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(casilla1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(casilla2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(casilla3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(casilla4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(casilla5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(casilla6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(casilla7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(casilla8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(casilla9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(casilla10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
        .addContainerGap(22, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(28, 28, 28)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(casilla4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(casilla14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(casilla24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(casilla34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(casilla44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(casilla54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(casilla64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(casilla74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(casilla84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(21, Short.MAX_VALUE))
    );

    jLabel32.setBackground(new java.awt.Color(255, 255, 255));
    jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    jLabel32.setForeground(new java.awt.Color(0, 102, 153));
    jLabel32.setText("CINCO EN RAYA");

    jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    jLabel33.setForeground(new java.awt.Color(0, 0, 0));
    jLabel33.setText("Jugador 1:");

    jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    jLabel34.setForeground(new java.awt.Color(0, 0, 0));
    jLabel34.setText("Jugador 2:");

    victoriasJugador2.setBackground(new java.awt.Color(102, 102, 102));
    victoriasJugador2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    victoriasJugador2.setOpaque(true);

    botonRefrescar.setBackground(new java.awt.Color(102, 102, 102));
    botonRefrescar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    botonRefrescar.setForeground(new java.awt.Color(0, 0, 0));
    botonRefrescar.setText("Refrescar tablero");

    botonSalir.setBackground(new java.awt.Color(102, 102, 102));
    botonSalir.setFont(new java.awt.Font("Segoe UI", 0, 14));
    botonSalir.setForeground(new java.awt.Color(0, 0, 0));
    botonSalir.setText("SALIR");
    botonSalir.setBounds(730, 699, 70, 30);
    add(botonSalir);

    victoriasJugador1.setBackground(new java.awt.Color(102, 102, 102));
    victoriasJugador1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    victoriasJugador1.setOpaque(true);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(27, 27, 27)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(26, 26, 26)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel1)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel33)
                  .addComponent(jLabel34))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(victoriasJugador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(victoriasJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
          .addGroup(layout.createSequentialGroup()
            .addGap(314, 314, 314)
            .addComponent(botonRefrescar))
          .addGroup(layout.createSequentialGroup()
            .addGap(281, 281, 281)
            .addComponent(jLabel32)))
        .addContainerGap(22, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel1)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(victoriasJugador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel33))
        .addGap(33, 33, 33)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel34)
          .addComponent(victoriasJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(278, 278, 278))
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel32)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(botonRefrescar)
        .addContainerGap(24, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>                                                                    
  
  //Metodos    
  private void setCasillas(){
    casillas[0][0] = casilla1;
    casillas[0][1] = casilla2;
    casillas[0][2] = casilla3;
    casillas[0][3] = casilla4;
    casillas[0][4] = casilla5;
    casillas[0][5] = casilla6;
    casillas[0][6] = casilla7;
    casillas[0][7] = casilla8;
    casillas[0][8] = casilla9;
    casillas[0][9] = casilla10;
    casillas[1][0] = casilla11;
    casillas[1][1] = casilla12;
    casillas[1][2] = casilla13;
    casillas[1][3] = casilla14;
    casillas[1][4] = casilla15;
    casillas[1][5] = casilla16;
    casillas[1][6] = casilla17;
    casillas[1][7] = casilla18;
    casillas[1][8] = casilla19;
    casillas[1][9] = casilla20;
    casillas[2][0] = casilla21;
    casillas[2][1] = casilla22;
    casillas[2][2] = casilla23;
    casillas[2][3] = casilla24;
    casillas[2][4] = casilla25;
    casillas[2][5] = casilla26;
    casillas[2][6] = casilla27;
    casillas[2][7] = casilla28;
    casillas[2][8] = casilla29;
    casillas[2][9] = casilla30;
    casillas[3][0] = casilla31;
    casillas[3][1] = casilla32;
    casillas[3][2] = casilla33;
    casillas[3][3] = casilla34;
    casillas[3][4] = casilla35;
    casillas[3][5] = casilla36;
    casillas[3][6] = casilla37;
    casillas[3][7] = casilla38;
    casillas[3][8] = casilla39;
    casillas[3][9] = casilla40;
    casillas[4][0] = casilla41;
    casillas[4][1] = casilla42;
    casillas[4][2] = casilla43;
    casillas[4][3] = casilla44;
    casillas[4][4] = casilla45;
    casillas[4][5] = casilla46;
    casillas[4][6] = casilla47;
    casillas[4][7] = casilla48;
    casillas[4][8] = casilla49;
    casillas[4][9] = casilla50;
    casillas[5][0] = casilla51;
    casillas[5][1] = casilla52;
    casillas[5][2] = casilla53;
    casillas[5][3] = casilla54;
    casillas[5][4] = casilla55;
    casillas[5][5] = casilla56;
    casillas[5][6] = casilla57;
    casillas[5][7] = casilla58;
    casillas[5][8] = casilla59;
    casillas[5][9] = casilla60;
    casillas[6][0] = casilla61;
    casillas[6][1] = casilla62;
    casillas[6][2] = casilla63;
    casillas[6][3] = casilla64;
    casillas[6][4] = casilla65;
    casillas[6][5] = casilla66;
    casillas[6][6] = casilla67;
    casillas[6][7] = casilla68;
    casillas[6][8] = casilla69;
    casillas[6][9] = casilla70;
    casillas[7][0] = casilla71;
    casillas[7][1] = casilla72;
    casillas[7][2] = casilla73;
    casillas[7][3] = casilla74;
    casillas[7][4] = casilla75;
    casillas[7][5] = casilla76;
    casillas[7][6] = casilla77;
    casillas[7][7] = casilla78;
    casillas[7][8] = casilla79;
    casillas[7][9] = casilla80;
    casillas[8][0] = casilla81;
    casillas[8][1] = casilla82;
    casillas[8][2] = casilla83;
    casillas[8][3] = casilla84;
    casillas[8][4] = casilla85;
    casillas[8][5] = casilla86;
    casillas[8][6] = casilla87;
    casillas[8][7] = casilla88;
    casillas[8][8] = casilla89;
    casillas[8][9] = casilla90;
  }
  public JLabel[][] getCasillas(){
    return this.casillas;
  }
  public JLabel getVictoriasJugador1(){
    return this.victoriasJugador1;
  }
  public JLabel getVictoriasJugador2(){
    return this.victoriasJugador2;
  }
  public JButton getBotonRefrescar(){
    return this.botonRefrescar;
  }
  public JButton getBotonSalir(){
    return botonSalir;
  }
}