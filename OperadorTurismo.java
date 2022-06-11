public class OperadorTurismo {
    
    private String nombre;
    private String descripcion;
    private Ubicacion direccion;
    private int telefono;
    Paquete paquetes[]=new Paquete[20];
    private int nroPaquetes;

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTelefono() {
        return telefono;
    }

 
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getNroPaquetes() {
        return nroPaquetes;
    }
    


    public void setNroPaquetes(int nroPaquetes) {
        this.nroPaquetes = nroPaquetes;
    }
    public  OperadorTurismo()
    {
       nombre="Sport Turing";
       descripcion="dedicados a el vieje y deportes extremos en el oriente boliviano creando momentos inolvidables";
       
        direccion=new Ubicacion();
        telefono=2830973;
        for (int i = 1; i < 19+1; i++) {
            paquetes[i]=new Paquete();
        }
    
        nroPaquetes=3;
    }
    public OperadorTurismo(String n,String des,int tele,int nro)
    {
        nombre=n;
       descripcion=des;
      
        telefono=tele;
        for (int i = 1; i < 19+1; i++) {
            paquetes[i]=new Paquete();
        }
        nroPaquetes=nro;
         direccion=new Ubicacion();
        direccion.leer();
    }
    public void mostrar()
    {
        System.out.println(" nombre: "+this.nombre+" || descripcion: "+getDescripcion()+" || telefono: "+getTelefono()+" || numero de paquetes:"+getNroPaquetes()+" || direccion: ");
        direccion.mostrar();
        for (int i=0; i<getNroPaquetes(); i++) {
            paquetes[i].mostrar();
        }
    }
    public void mostrarResumen()
    {
        System.out.println(" nombre "+getNombre()+" descripcion "+getDescripcion());
        for (int i=0; i<getNroPaquetes(); i++) {
            paquetes[i].mostrarResumen();
        }
    }
    public Paquete destino(Ubicacion des)
    {
        
        for (int i=0; i < getNroPaquetes(); i++) {
            if (paquetes[i].getDestino().equals(des)) paquetes[i].mostrarResumen();
        }
        return this.seleccionarCod();
    }

    public Paquete mostPrecio(int x)
    {

        for (int i = 1; i < getNroPaquetes()+1; i++) {
            if (paquetes[i].getPrecio()==x) mostrarResumen();
        }
        return this.seleccionarCod();
    }
    public Paquete seleccionarCod(){
        System.out.print("Inserte el codigo del paquete que quiera seleccionar => ");
        String cod=Leer.dato();
        Paquete paqueteSeleccionado=new Paquete();
        for (int i=0; i<getNroPaquetes(); i++) {
            if (paquetes[i].getCodigo().equals(cod)) paqueteSeleccionado=paquetes[i];
        }
        return (paqueteSeleccionado);
    }
    
    public  void anadirUbicacion(Ubicacion ubi)
    {
        setDireccion(ubi);
    }

    public Ubicacion getDireccion() {
        return direccion;
    }

    public void setDireccion(Ubicacion direccion) {
        this.direccion = direccion;
    }

    public void leer()
    {
         for (int i = 1; i < getNroPaquetes()+1; i++) {
            paquetes[i].leer();
        }
    }
}
