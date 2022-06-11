import java.io.Serializable;
public class Aereo extends Transporte implements Serializable{
    private String aereolina, codigo;

    public Aereo(){
        super();
        this.aereolina="";
        this.codigo="";
    }

    public Aereo(String a, String b, Ubicacion c, Ubicacion d, String ae, String co){
        super(a, b, c, d);
        this.aereolina=ae;
        this.codigo=co;
    }

    public void mostrar(){
        super.mostrar();
        System.out.println("Aereolina: "+this.aereolina+" || Codigo: "+this.codigo);
    }

    //Getters & Setters
    public String getAereolina() {return aereolina;}
    public String getCodigo() {return codigo;}
    public void setAereolina(String aereolina) {this.aereolina = aereolina;}
    public void setCodigo(String codigo) {this.codigo = codigo;}
}
