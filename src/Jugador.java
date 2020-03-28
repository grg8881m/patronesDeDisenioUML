
public class Jugador {
    
    private String nombre;
    private int numeroVidas;

    public Jugador(String nombre, int numeroVidas) {
        this.nombre = nombre;
        this.numeroVidas = numeroVidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroVidas() {
        return numeroVidas;
    }

    public void setNumeroVidas(int numeroVidas) {
        this.numeroVidas = numeroVidas;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", numeroVidas=" + numeroVidas + '}';
    }
    
    
    public String andar(int x, int y){
        return "El jugador " + getNombre() + "Se ha movido a la coordenada (" + x + "," + y + ")";
    }
    
}
