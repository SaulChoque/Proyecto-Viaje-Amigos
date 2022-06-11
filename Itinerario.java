import java.io.Serializable;
public class Itinerario implements Serializable{
    private int dia, nroActividades;
    private String actividad[][] = new String [20][2];
    
    public Itinerario() {
        dia=0;
    }

    public Itinerario(int a){
        dia=a;
    }

    public void addItinerario(String a, String b){
        actividad[nroActividades][0]=a;
        actividad[nroActividades][0]=b;
        nroActividades++;
    }
}