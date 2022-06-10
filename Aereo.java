public class Aereo extends Transporte{
    private String aereolina, codigo;

    public Aereo(){
        super();
        aereolina="";
        codigo="";
    }

    public Aereo(String a, String b, Ubicacion c, Ubicacion d, String ae, String co){
        super(a, b, c, d);
        aereolina=ae;
        codigo=co;
    }
}
