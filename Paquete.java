import java.util.ArrayList;

public class Paquete {
    private String codigo;
    private int precio, nroItinerario;
    private Transporte tranIda, tranVuelta;
    private Hospedaje hosp;
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
}

public Paquete(String a, int b, int c, Hospedaje f){
    codigo=a;
    precio=b;
    nroItinerario=c;
    tranIda=new Transporte();
    tranVuelta=new Transporte();
    hosp=f;
    for(int i=1; i<nroItinerario; i++){
        itinerarioDia[i]=new Itinerario();
    }
}

public void leer() {
    String a="";
    codigo=Leer.dato();
    precio=Leer.datoInt();
    nroItinerario=Leer.datoInt();
    for(int i=1; i<nroItinerario; i++){
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

public void motrar(){
    System.out.println("codigo:"+codigo);
    System.out.println("precio:"+precio);
    System.out.println("nroItinerario:"+nroItinerario);
    tranIda.mostrar();
    tranVuelta.mostrar();
    hosp.mostrar();
    for (String cadena: incluye) {
        System.out.println(cadena);
      }
      for (String cadena: noIncluye) {
        System.out.println(cadena);
      }
}

public void mostrarResumen(){

}

}
