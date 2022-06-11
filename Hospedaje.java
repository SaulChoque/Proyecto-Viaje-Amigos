import java.io.Serializable;

public class Hospedaje implements Serializable{
    private String nombre;
    private Ubicacion direccion;

    public Hospedaje(){
        this.nombre="hotel transilvania";
        this.direccion=new Ubicacion();
    }

    public Hospedaje(String nom,Ubicacion a){
        this.nombre=nom;
        this.direccion=a;
    }

    public void mostrar(){
        System.out.println(" Nombre "+getNombre()+" Direccion ");
        direccion.mostrar();
    }
    
    //Getters & Setters
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public Ubicacion getDireccion() {return direccion;}
    public void setDireccion(Ubicacion direccion) {this.direccion = direccion;}
    
}

