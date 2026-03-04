package co.edu.uniquindio.model;

public class Gym {
    private static Gym instance;

    String name;
    int id;

    private Gym(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Gym getInstance() {
        if (instance == null){
            instance = new Gym(727, "GymUQ");
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Gym{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
