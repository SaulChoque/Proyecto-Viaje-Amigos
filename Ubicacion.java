import java.util.Scanner;
public class Ubicacion {
    
    private String departamento;
    private String zona;

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * @return the zona
     */
    public String getZona() {
        return zona;
    }

    /**
     * @param zona the zona to set
     */
    public void setZona(String zona) {
        this.zona = zona;
    }
    public  Ubicacion()
    {
        departamento="la paz";
        zona="obrajes";
    }
    public  Ubicacion(String depa,String zon)
    {
        departamento=depa;
        zona=zon;
    }
    public void mostrar()
    {
        System.out.println(" Departamento "+getDepartamento()+" Zona "+getZona());
    }
    public  void leer()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Añadir departamento");
        departamento=sc.next();
        System.out.println("Añadir zona");
        zona=sc.next();
    }
}
