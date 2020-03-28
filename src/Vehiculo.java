
public class Vehiculo {
    
    private double velocidad;
    private double VMAX = 100.0;

    public Vehiculo(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    
    public String controlarVelocidad(double v){
    
        String mensaje = "";
        
        if (v > VMAX) {
            
            mensaje = "Ud supera la velocidad máxima";
            
        }else  {
            mensaje = "la velocidad esta dentro del límite permitido";
        } 
        return mensaje;
    
    }

    
    @Override
    public String toString() {
        return "Vehiculo{" + "velocidad=" + velocidad + ", VMAX=" + VMAX + '}';
    }
    
    
}
