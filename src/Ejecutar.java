
public class Ejecutar {

   
    public static void main(String[] args) {
     
    Jugador jugador1 = new Principiante("Gio kasamoto",3);
    
    Vehiculo vehiculo = new Vehiculo(120.0);
    
    Jugador jugador2 = new Avanzado(vehiculo, "Ralf", 6);
    
        System.out.println(vehiculo.controlarVelocidad(vehiculo.getVelocidad()));
        
        System.out.println(jugador1.andar(20, 5));
        
        System.out.println(jugador2.andar(-2, 4));
    }
}
