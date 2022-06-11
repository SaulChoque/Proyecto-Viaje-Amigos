import java.io.Serializable;

public class Terrestre extends Transporte implements Serializable{
    private String tipoV, tipoA, matricula;
    //TipoV: Tipo vehiculo , TipoA: Tipo asientos
    public Terrestre() {
        super();
        tipoV="";
        tipoA="";
        matricula="";
    }
    
    public Terrestre(String a, String b, Ubicacion c, Ubicacion d, String tv, String ta, String m){
        super(a, b, c, d);
        tipoV=tv;
        tipoA=ta;
        matricula=m;
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Matricula: "+this.matricula);
        System.out.println("Tipo Vehiculo: "+this.tipoV+" || Tipo asientos: "+this.tipoA);
    }
    
    public String getMatricula() {return matricula;}
    public String getTipoA() {return tipoA;}
    public String getTipoV() {return tipoV;}
    public void setMatricula(String matricula) {this.matricula = matricula;}
    public void setTipoA(String tipoA) {this.tipoA = tipoA;}
    public void setTipoV(String tipoV) {this.tipoV = tipoV;}
}
