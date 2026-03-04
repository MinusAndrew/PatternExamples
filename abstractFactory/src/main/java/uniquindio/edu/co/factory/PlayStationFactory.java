package uniquindio.edu.co.factory;

import uniquindio.edu.co.games.AstroBot;
import uniquindio.edu.co.games.Juego;
import uniquindio.edu.co.online.Online;
import uniquindio.edu.co.online.PlayStationNetwork;

public class PlayStationFactory implements ConsolaFactory{

    @Override
    public Juego crearJuego() {
        return new AstroBot();
    }

    @Override
    public Online crearConexion() {
        return new PlayStationNetwork();
    }
}
