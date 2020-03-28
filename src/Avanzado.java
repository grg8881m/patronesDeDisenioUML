
public class Avanzado extends Jugador{
    
    private Vehiculo vehiculo;
    
    public Avanzado(Vehiculo vehiculo, String nombre, int numeroVidas){
        super(nombre, numeroVidas);
        this.vehiculo = vehiculo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
      
}
