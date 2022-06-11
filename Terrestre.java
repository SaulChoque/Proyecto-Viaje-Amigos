import java.io.Serializable;

public class Terrestre extends Transporte implements Serializable{
    private String tipoV, tipoA, nombre, matricula;
    
    public Terrestre() {
        super();
        tipoV="";
        tipoA="";
        nombre="";
        matricula="";
    }

    public Terrestre(String a, String b, Ubicacion c, Ubicacion d, String tv, String ta, String n, String m){
        super(a, b, c, d);
        tipoV=tv;
        tipoA=ta;
        nombre=n;
        matricula=m;
    }

    public String getMatricula() {
        return matricula;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTipoA() {
        return tipoA;
    }
    public String getTipoV() {
        return tipoV;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTipoA(String tipoA) {
        this.tipoA = tipoA;
    }
    public void setTipoV(String tipoV) {
        this.tipoV = tipoV;
    }

    public void mostrar(){
        super.mostrar();

    }
}
