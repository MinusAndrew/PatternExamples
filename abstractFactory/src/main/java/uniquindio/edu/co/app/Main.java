package uniquindio.edu.co.app;

import uniquindio.edu.co.factory.ConsolaFactory;
import uniquindio.edu.co.factory.PlayStationFactory;
import uniquindio.edu.co.factory.SwitchFactory;

public class Main {
    public static void main(String[] args) {
        String consola = "nintendo";

        ConsolaFactory consolaFactory = consola.equalsIgnoreCase("nintendo")
                ? new SwitchFactory()
                : new PlayStationFactory();

        Application app = new Application(consolaFactory);

        app.ejecutarProgramas();
    }
}