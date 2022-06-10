public class Terrestre extends Transporte{
    private String tipoV, tipoA, nombre, matricula;
    
    public Terrestre() {

    }

    public Terrestre(String a, String b, Ubicacion c, Ubicacion d, String tv, String ta, String n, String m){
        super(a, b, c, d);
        tipoV=tv;
        tipoA=ta;
        nombre=n;
        matricula=m;
    }
}
