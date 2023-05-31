/*
 * Version Corregida 2
 * Implementacion del modelo: 
 *   1. Adaptamos el proyectoL TresCuatroCincoEnRaya a:
 *      a) La nueva logica del ingeniero
 *   2. Modo juego 1: funcionando (PvP)
 *   3. Modo juego 2: funcionando (IA)
 */
import Vista.Bienvenida;

public class Main {
  public static void main(String[] args){
    // Pruebas sobre Interfaz de bienvenida
    Bienvenida interfazBienvenida = new Bienvenida();
    interfazBienvenida.setBounds(0, 0, 401, 330);
    interfazBienvenida.setLocationRelativeTo(null);
    interfazBienvenida.setResizable(true);
    interfazBienvenida.setVisible(true); 

    //Pruebas sobre Interfaz de modo del juego
    /*ModoJuego modoJuego = new ModoJuego();
    modoJuego.setBounds(0, 0, 400, 400);
    modoJuego.setLocationRelativeTo(null);
    modoJuego.setResizable(true);
    modoJuego.setVisible(true);*/

    //Pruebas sobre Interfaz de tres en raya
    /*TresEnRaya nivel1 = new TresEnRaya();
    nivel1.setBounds(0, 0, 700, 600);
    nivel1.setLocationRelativeTo(null);
    nivel1.setResizable(true);
    nivel1.setVisible(true);*/

    //Pruebas sobre Interfaz de cuatro en raya
    /*CuatroEnRaya nivel2 = new CuatroEnRaya();
    nivel2.setBounds(0, 0, 860, 750);
    nivel2.setLocationRelativeTo(null);
    nivel2.setResizable(true);
    nivel2.setVisible(true);*/

    //Pruebas sobre Interfaz de Cinco en raya
    /*CincoEnRaya nivel3 = new CincoEnRaya();
    nivel3.setBounds(0, 0, 990, 900);
    nivel3.setLocationRelativeTo(null);
    nivel3.setResizable(true);
    nivel3.setVisible(true);*/

    //--------------Prueba de tres en raya con modelo-vista-controlador
    /*Modelo modelo1 = new Modelo();
    TresEnRaya nivel1 = new TresEnRaya();
    ControladorTresEnRaya controlador1 = new ControladorTresEnRaya(nivel1,modelo1);
    nivel1.setBounds(0, 0, 700, 600);
    nivel1.setLocationRelativeTo(null);
    nivel1.setResizable(true);
    nivel1.setVisible(true);*/

    //-------------Prueba de cuatro en raya con modelo-vista-controlador
    /*Modelo modelo2 = new Modelo();
    CuatroEnRaya nivel2 = new CuatroEnRaya();
    ControladorCuatroEnRaya controlador2 = new ControladorCuatroEnRaya(nivel2,modelo2);
    nivel2.setBounds(0, 0, 860, 750);
    nivel2.setLocationRelativeTo(null);
    nivel2.setResizable(true);
    nivel2.setVisible(true);*/

    //--------------Prueba de cinco en raya con modelo-vista-controlador
    /*Modelo modelo3 = new Modelo();
    CincoEnRaya nivel3 = new CincoEnRaya();
    ControladorCincoEnRaya controlador = new ControladorCincoEnRaya(nivel3,modelo3);
    nivel3.setBounds(0, 0, 990, 900);
    nivel3.setLocationRelativeTo(null);
    nivel3.setResizable(true);
    nivel3.setVisible(true);*/
  }
}
