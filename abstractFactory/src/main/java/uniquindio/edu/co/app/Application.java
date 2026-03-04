package uniquindio.edu.co.app;

import uniquindio.edu.co.factory.ConsolaFactory;
import uniquindio.edu.co.games.Juego;
import uniquindio.edu.co.online.Online;

public class Application {
    private Juego juego;
    private Online online;

    public Application(ConsolaFactory factory){
        this.juego = factory.crearJuego();
        this.online = factory.crearConexion();
    }

    public void ejecutarProgramas(){
        juego.jugar();
        online.ejecutar();
    }

}
