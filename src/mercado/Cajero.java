package mercado;

import java.util.ArrayList;

public class Cajero extends Thread {

    // Declaring private instance variables
    private String Id; 
    private ArrayList<String> Transacciones; 
    private int Tiempo;

    
    public Cajero(String Id, ArrayList<String> Transacciones) {
        this.Id = Id;
        this.Transacciones = Transacciones;
    }

    // Overriding the getId() method from the Thread class
    @Override
    public long getId() {
        // You can convert your String ID to long if needed.
        return Long.parseLong(Id);
    }

    
    public void setId(String Id) {
        this.Id = Id;
    }

    
    public ArrayList<String> getTransacciones() {
        return Transacciones;
    }

  
    public void setTransacciones(ArrayList<String> transacciones) {
        this.Transacciones = transacciones;
    }
}
