package co.edu.uniquindio;

import co.edu.uniquindio.model.Gym;

public class Main {
    static void main() {

        System.out.println(Gym.getInstance());

        Gym.getInstance().setName("SmartFit");

        System.out.println(Gym.getInstance());

        Gym.getInstance().setId(484);

        System.out.println(Gym.getInstance());

        }
}
