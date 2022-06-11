import java.io.Serializable;

public class Ubicacion implements Serializable{
    
    private String departamento, zona;

    public Ubicacion()
    {
        departamento="la paz";
        zona="obrajes";
    }

    public Ubicacion(String depa,String zon)
    {
        departamento=depa;
        zona=zon;
    }

    public void mostrar()
    {System.out.println(" Departamento "+getDepartamento()+" Zona "+getZona());}

    public void leer()
    {
        System.out.print("Anadir departamento => ");
        departamento=Leer.dato();
        System.out.print("Anadir zona => ");
        zona=Leer.dato();
    }

    //getters & setters
    public String getDepartamento() {return departamento;}
    public void setDepartamento(String departamento) {this.departamento = departamento;}
    public String getZona() {return zona;}
    public void setZona(String zona) {this.zona = zona;}
    public String getDireccion() {return departamento+" "+zona;}
}
