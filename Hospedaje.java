
import proyectomenfy.Ubicacion;

public class Hospedaje {
    private String nombre;
    private Ubicacion direccion;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public Ubicacion getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(Ubicacion direccion) {
        this.direccion = direccion;
    }
    
    public Hospedaje()
    {
    nombre="hotel transilvania";
    direccion=new Ubicacion();
    }
    public Hospedaje(String nom,Ubicacion a)
    {
    nombre=nom;
    direccion=a;
    }
    public void mostrar()
    {
        System.out.println(" Nombre "+getNombre()+" Direccion ");
        direccion.mostrar();
    }
    
}

