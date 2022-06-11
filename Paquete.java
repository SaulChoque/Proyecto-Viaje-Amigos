import java.util.ArrayList;
import java.io.Serializable;

public class Paquete implements Serializable{
    private String codigo;
    private int precio, nroItinerario;
    private Transporte tranIda, tranVuelta;
    private Hospedaje hosp;
    private Ubicacion destino;
    private Itinerario[]itinerarioDia=new Itinerario[4];
    private ArrayList<String> incluye,noIncluye;

    public Paquete(){
        codigo="";
        precio=0;
        nroItinerario=0;
        tranIda= new Transporte();
        tranVuelta= new Transporte();
        hosp= new Hospedaje();
        for(int i=1; i<nroItinerario; i++){
            itinerarioDia[i]=new Itinerario();
        }
        destino=new Ubicacion(); 
    }

    public Paquete(String a, int b, int c, Hospedaje f){
        codigo=a;
        precio=b;
        nroItinerario=c;
        tranIda=new Transporte();
        tranVuelta=new Transporte();
        hosp=f;
        for(int i=0; i<nroItinerario; i++){
            itinerarioDia[i]=new Itinerario();
        }
        destino=new Ubicacion();
    }

    public void leer() {
        String a="";
        codigo=Leer.dato();
        precio=Leer.datoInt();
        nroItinerario=Leer.datoInt();
        System.out.println(" Inserte no incluye: ");
        do{
            System.out.println(" => "); 
            noIncluye.add(Leer.dato());
            System.out.print("(s/n)=> ");
        }while(Leer.datoChar()=='s');
        
        System.out.println(" Inserte  incluye: ");
        do{
            System.out.println(" => "); 
            incluye.add(Leer.dato());
            System.out.print("(s/n)=> ");
        }while(Leer.datoChar()=='s');

        System.out.println("leer destino => ");
        destino.leer();
    }

    public void mostrar(){
        System.out.println("Codigo: "+codigo+" || Precio: "+precio+" || nroItinerario: "+nroItinerario);
        tranIda.mostrar();
        tranVuelta.mostrar();
        hosp.mostrar();
        destino.mostrar();
        for (String cadena: incluye) {
            System.out.println(cadena);
        }
        for (String cadena: noIncluye) {
            System.out.println(cadena);
        }
    }

    public void addIti(String a , String b, int c){
        this.itinerarioDia[c].addItinerario(a, b);
    }

    public void mostrarResumen(){
        System.out.println("Paquete a "+destino.getZona()+" por Bs. "+this.precio);
    }

    public void addTrasporte(Transporte a, Transporte b){
        tranIda=a;
        tranVuelta=b;
    }
    public void addHospedaje(Hospedaje a){
        hosp=a;
    }




    //Getters & Setters
    public Ubicacion getDestino() {return destino;}
    public String getCodigo() {return codigo;}
    public Hospedaje getHosp() {return hosp;}
    public ArrayList<String> getIncluye() {return incluye;}
    public ArrayList<String> getNoIncluye() {return noIncluye;}
    public Itinerario[] getItinerarioDia() {return itinerarioDia;}
    public int getNroItinerario() {return nroItinerario;}
    public int getPrecio() {return precio;}
    public Transporte getTranIda() {return tranIda;}
    public Transporte getTranVuelta() {return tranVuelta;}

    public void setPrecio(int precio) {this.precio = precio;}
    public void setCodigo(String codigo) {this.codigo = codigo;}
    public void setHosp(Hospedaje hosp) {this.hosp = hosp;}
    public void setIncluye(ArrayList<String> incluye) {this.incluye = incluye;}
    public void setItinerarioDia(Itinerario[] itinerarioDia) {this.itinerarioDia = itinerarioDia;}
    public void setNoIncluye(ArrayList<String> noIncluye) {this.noIncluye = noIncluye;}
    public void setNroItinerario(int nroItinerario) {this.nroItinerario = nroItinerario;}
    public void setTranIda(Transporte tranIda) {this.tranIda = tranIda;}
    public void setTranVuelta(Transporte tranVuelta) {this.tranVuelta = tranVuelta;}
    public void setDestino(Ubicacion destino) {this.destino = destino;}


}
