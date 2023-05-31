package Vista;
import javax.swing.*;

public class TresEnRaya extends javax.swing.JFrame {
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
  private javax.swing.JLabel casilla4;
  private javax.swing.JLabel casilla5;
  private javax.swing.JLabel casilla6;
  private javax.swing.JLabel casilla7;
  private javax.swing.JLabel casilla8;
  private javax.swing.JLabel casilla9;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel32;
  private javax.swing.JLabel jLabel33;
  private javax.swing.JLabel jLabel34;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel victoriasJugador1;
  private javax.swing.JLabel victoriasJugador2;
  private javax.swing.JLabel[][] casillas; 
  private javax.swing.JButton botonSalir;
  //Constructor
  public TresEnRaya() {
    initComponents(); 
    this.setTitle("Vamos a jugar "+Bienvenida.enRaya+" en raya");
    getContentPane().setBackground(Bienvenida.fondoJuego);
    casillas = new JLabel[5][6];
    setCasillas();
    this.jLabel33.setText(ModoJuego.nomJugador1+"(azul)");
    this.jLabel34.setText(ModoJuego.nomJugador2+"(rojo)");
  }                      
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

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(jPanel1Layout.createSequentialGroup()
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
              .addComponent(casilla19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(casilla20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(casilla21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(casilla22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(casilla23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(casilla24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
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
              .addComponent(casilla18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
              .addComponent(casilla7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(casilla8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(casilla9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(casilla10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(casilla11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(casilla12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
              .addComponent(casilla6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addContainerGap(21, Short.MAX_VALUE))
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
          .addComponent(casilla1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(casilla10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(casilla16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(casilla22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(casilla28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(casilla25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(25, Short.MAX_VALUE))
    );

    jLabel32.setBackground(new java.awt.Color(255, 255, 255));
    jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    jLabel32.setForeground(new java.awt.Color(0, 102, 153));
    jLabel32.setText("TRES EN RAYA");

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

    victoriasJugador1.setBackground(new java.awt.Color(102, 102, 102));
    victoriasJugador1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    victoriasJugador1.setOpaque(true);

    botonSalir.setBackground(new java.awt.Color(102, 102, 102));
    botonSalir.setFont(new java.awt.Font("Segoe UI", 0, 14));
    botonSalir.setForeground(new java.awt.Color(0, 0, 0));
    botonSalir.setText("SALIR");
    botonSalir.setBounds(465, 464, 70, 30);
    add(botonSalir);


    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(35, 35, 35)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel1)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel33)
              .addComponent(jLabel34))
            .addGap(45, 45, 45)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(victoriasJugador1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
              .addComponent(victoriasJugador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        .addGap(49, 49, 49))
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(175, 175, 175)
            .addComponent(botonRefrescar))
          .addGroup(layout.createSequentialGroup()
            .addGap(159, 159, 159)
            .addComponent(jLabel32)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(22, 22, 22)
            .addComponent(jLabel32)
            .addGap(18, 18, 18)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(168, 168, 168)
            .addComponent(jLabel1)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addComponent(victoriasJugador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(33, 33, 33)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel34)
              .addComponent(victoriasJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addGap(18, 18, 18)
        .addComponent(botonRefrescar)
        .addContainerGap(23, Short.MAX_VALUE))
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
    casillas[1][0] = casilla7;
    casillas[1][1] = casilla8;
    casillas[1][2] = casilla9;
    casillas[1][3] = casilla10;
    casillas[1][4] = casilla11;
    casillas[1][5] = casilla12;
    casillas[2][0] = casilla13;
    casillas[2][1] = casilla14;
    casillas[2][2] = casilla15;
    casillas[2][3] = casilla16;
    casillas[2][4] = casilla17;
    casillas[2][5] = casilla18;
    casillas[3][0] = casilla19;
    casillas[3][1] = casilla20;
    casillas[3][2] = casilla21;
    casillas[3][3] = casilla22;
    casillas[3][4] = casilla23;
    casillas[3][5] = casilla24;
    casillas[4][0] = casilla25;
    casillas[4][1] = casilla26;
    casillas[4][2] = casilla27;
    casillas[4][3] = casilla28;
    casillas[4][4] = casilla29;
    casillas[4][5] = casilla30;
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