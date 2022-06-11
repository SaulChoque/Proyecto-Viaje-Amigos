import java.util.ArrayList;

public class Paquete {
    private String codigo;
    private int precio, nroItinerario;
    private Transporte tranIda, tranVuelta;
    private Hospedaje hosp;
    private Ubicacion destino;
    private Itinerario[]itinerarioDia=new Itinerario[4];
    private ArrayList<String> incluye;
    private ArrayList<String> noIncluye;

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
    for(int i=0; i<nroItinerario; i++){
        itinerarioDia[i].leer();
    } 
    do{
        System.out.println("No Incluye"); 
        noIncluye.add(Leer.dato());
    }while(Leer.datoChar()=='s');
    
    do{
        System.out.println("Incluye"); 
        incluye.add(Leer.dato());
    }while(Leer.datoChar()=='s');
}

public void mostrar(){
    System.out.println("codigo:"+codigo);
    System.out.println("precio:"+precio);
    System.out.println("nroItinerario:"+nroItinerario);
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

public void mostrarResumen(){
    

}


public Ubicacion getDestino() {
    return destino;
}
public String getCodigo() {
    return codigo;
}
public Hospedaje getHosp() {
    return hosp;
}
public ArrayList<String> getIncluye() {
    return incluye;
}
public ArrayList<String> getNoIncluye() {
    return noIncluye;
}
public Itinerario[] getItinerarioDia() {
    return itinerarioDia;
}
public int getNroItinerario() {
    return nroItinerario;
}
public int getPrecio() {
    return precio;
}
public Transporte getTranIda() {
    return tranIda;
}
public Transporte getTranVuelta() {
    return tranVuelta;
}
public void setPrecio(int precio) {
    this.precio = precio;
}
public void setCodigo(String codigo) {
    this.codigo = codigo;
}
public void setHosp(Hospedaje hosp) {
    this.hosp = hosp;
}
public void setIncluye(ArrayList<String> incluye) {
    this.incluye = incluye;
}
public void setItinerarioDia(Itinerario[] itinerarioDia) {
    this.itinerarioDia = itinerarioDia;
}
public void setNoIncluye(ArrayList<String> noIncluye) {
    this.noIncluye = noIncluye;
}
public void setNroItinerario(int nroItinerario) {
    this.nroItinerario = nroItinerario;
}
public void setTranIda(Transporte tranIda) {
    this.tranIda = tranIda;
}
public void setTranVuelta(Transporte tranVuelta) {
    this.tranVuelta = tranVuelta;
}
public void setDestino(Ubicacion destino) {
    this.destino = destino;
}


}
