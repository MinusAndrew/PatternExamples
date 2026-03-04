package uniquindio.edu.co.factory;

import uniquindio.edu.co.games.Juego;
import uniquindio.edu.co.games.Mariano;
import uniquindio.edu.co.online.Online;
import uniquindio.edu.co.online.SwitchOnline;

public class SwitchFactory implements ConsolaFactory{
    @Override
    public Juego crearJuego() {
        return new Mariano();
    }

    @Override
    public Online crearConexion() {
        return new SwitchOnline();
    }
}
