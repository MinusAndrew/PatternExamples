package uniquindio.edu.co;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        VehiculoFactory factory = new VehiculoFactory();

        Vehiculo mototo = factory.crearVehiculo(TIPO_VEHICULO.MOTO);
        Vehiculo avon = factory.crearVehiculo(TIPO_VEHICULO.AVION);
        mototo.arrancar();
        avon.arrancar();
    }
}