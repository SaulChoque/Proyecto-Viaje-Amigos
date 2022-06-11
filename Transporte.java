public class Transporte {
    protected String horaSal, horaLleg; 
    protected Ubicacion origen, destino;

    public Transporte(){
        horaSal="";
        horaLleg="";
        origen=new Ubicacion();
        destino=new Ubicacion();
    }

    public Transporte(String a, String b, Ubicacion c, Ubicacion d){
        horaSal=a;
        horaLleg=b;
        origen=c;
        destino=d;
    }
    public String getHoraSal() {
        return horaSal;
    }
    public String getHoraLleg() {
        return horaLleg;
    }
    public Ubicacion getOrigen() {
        return origen;
    }
    public Ubicacion getDestino() {
        return destino;
    }

    public void setDestino(Ubicacion destino) {
        this.destino = destino;
    }
    public void setHoraLleg(String horaLleg) {
        this.horaLleg = horaLleg;
    }
    public void setHoraSal(String horaSal) {
        this.horaSal = horaSal;
    }
    public void setOrigen(Ubicacion origen) {
        this.origen = origen;
    }

    public void mostrar(){

    }
}
