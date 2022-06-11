import java.io.Serializable;

public class OperadorTurismo implements Serializable{
    
    private String nombre,descripcion;
    private Ubicacion direccion;
    private int telefono,nroPaquetes;
    Paquete paquetes[]=new Paquete[20];

    public  OperadorTurismo(){
        this.nombre="";
        this.descripcion="";
        this.direccion=new Ubicacion();
        this.telefono=0;
        for (int i=0; i<20; i++) paquetes[i]=new Paquete();
        this.nroPaquetes=3;
    }
    public OperadorTurismo(String n,String des,int tele,int nro){
        this.nombre=n;
        this.descripcion=des;
        this.telefono=tele;
        for (int i=0; i<20; i++) paquetes[i]=new Paquete();
        this.nroPaquetes=nro;
        this.direccion=new Ubicacion();
    }
    public void mostrar(){
        System.out.println("\n// OPERADOR "+this.nombre);
        System.out.println("nombre: "+this.nombre+" || descripcion: "+this.descripcion+" || telefono: "+this.telefono+" || numero de paquetes:"+this.nroPaquetes+" || direccion: ");
        direccion.mostrar();
        for (int i=0; i<this.nroPaquetes; i++) {
            paquetes[i].mostrar();
        }
    }
    public void mostrarResumen(){
        System.out.println("\n nombre "+this.nombre+" descripcion "+this.descripcion);
        for (int i=0; i<getNroPaquetes(); i++) paquetes[i].mostrarResumen();
    }
    
    public void destino(Ubicacion des){
        for (int i=0; i <this.nroPaquetes; i++) {
            if (paquetes[i].getDestino().equals(des)) paquetes[i].mostrarResumen();
        }
        //return this.seleccionarCod();
    }
    
    public void mostPrecio(int x){
        for (int i=0; i<this.nroPaquetes; i++) {
            if (paquetes[i].getPrecio()==x) mostrarResumen();
        }
        //return this.seleccionarCod();
    }
    
    public Paquete seleccionarCod(String x){
        Paquete paqueteSeleccionado=new Paquete();
        for (int i=0; i<this.nroPaquetes; i++) {
            if (paquetes[i].getCodigo().equals(x)) paqueteSeleccionado=paquetes[i];
        }
        return (paqueteSeleccionado);
    }

    public void leer()
    {
        for (int i = 1; i < getNroPaquetes()+1; i++) {
            paquetes[i].leer();
        }
    }
    
    //Getters & Setters
    public String getNombre() {return nombre;}
    public String getDescripcion() {return descripcion;}
    public int getTelefono() {return telefono;}
    public int getNroPaquetes() {return nroPaquetes;}
    public Ubicacion getDireccion() {return direccion;}
    public Paquete[] getPaquetes() {return paquetes;}
    
    public void setNombre(String nombre) {this.nombre = nombre;} 
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}  
    public void setTelefono(int telefono) {this.telefono = telefono;}  
    public void setNroPaquetes(int nroPaquetes) {this.nroPaquetes = nroPaquetes;}
    public void anadirUbicacion(Ubicacion ubi){setDireccion(ubi);}  
    public void setDireccion(Ubicacion direccion) {this.direccion = direccion;}
    public void setPaquetes(Paquete[] paquetes) {this.paquetes = paquetes;}
    
}