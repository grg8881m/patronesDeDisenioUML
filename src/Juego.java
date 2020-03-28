
public class Juego {
 
    
    private String nombre;
    private Jugador jugador; //relación fuerte, es una composición.

    public Juego(String nombre, Jugador jugador) {
        this.nombre = nombre;
        this.jugador = jugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public String toString() {
        return "Juego{" + "nombre=" + nombre + ", jugador=" + jugador + '}';
    }
    
    
}
