package uniquindio.edu.co;

public class VehiculoFactory {
    public Vehiculo crearVehiculo(TIPO_VEHICULO tipo){
            return switch (tipo) {
                case MOTO -> new Moto();
                case AVION -> new Avion();
                case CARRO -> new Carro();
            };
    }
}
