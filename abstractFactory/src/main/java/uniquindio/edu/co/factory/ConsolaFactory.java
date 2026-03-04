package uniquindio.edu.co.factory;

import uniquindio.edu.co.games.Juego;
import uniquindio.edu.co.online.Online;

public interface ConsolaFactory {
    Juego crearJuego();
    Online crearConexion();
}
