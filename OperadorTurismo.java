public class OperadorTurismo {
    
    private String nombre;
    private String descripcion;
    private Ubicacion direccion;
    private int telefono;
    paquete paquetes[]=new paquete[20];
    private int nroPaquetes;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the direccion
     */
    

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the nroPaquetes
     */
    public int getNroPaquetes() {
        return nroPaquetes;
    }
    

    /**
     * @param nroPaquetes the nroPaquetes to set
     */
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
            paquetes[i]=new paquete();
        }
    
        nroPaquetes=3;
    }
    public OperadorTurismo(String n,String des,int tele,int nro)
    {
        nombre=n;
       descripcion=des;
      
        telefono=tele;
        for (int i = 1; i < 19+1; i++) {
            paquetes[i]=new paquete();
        }
        nroPaquetes=nro;
         direccion=new Ubicacion();
        direccion.leer();
    }
    public void mostrar()
    {
        System.out.println(" nombre "+getNombre()+" descripcion "+getDescripcion()+" telefono "+getTelefono()+" numero de paquetes"+getNroPaquetes()+" direccion ");
        direccion.mostrar();
        for (int i = 1; i < getNroPaquetes()+1; i++) {
            paquetes[i].mostrar();
        }
    }
    public void mostrarResumen()
    {
        System.out.println(" nombre "+getNombre()+" descripcion "+getDescripcion());
        for (int i = 1; i < getNroPaquetes()+1; i++) {
            paquetes[i].mostrar();
        }
    }
    public  Object destino(Ubicacion des)
    {
        String cod="";
        paquete paqueteSeleccionado=new paquete();
        
        for (int i = 1; i < getNroPaquetes()+1; i++) {
            
            if (paquetes[i].getDestino().equals(des))
                {
                      paquetes[i].mostrar();
                }
        }
        System.out.println("escriba el codigo del  paquete que quiera seleccionar");
       // cod=Leer.dato();
        for (int i = 0; i < getNroPaquetes(); i++) {
            
            if (paquetes[i].getCodigo().equals(cod))
                {
                     paqueteSeleccionado=paquetes[i];
                }
        }
        return (paqueteSeleccionado);
    }
    public void mostPrecio(int x)
    {
        for (int i = 1; i < getNroPaquetes()+1; i++) {
            
            if (paquetes[i].getPrecio()==x)
                {
                      mostrarResumen();
                }
        }
    }
    public  void añadirUbicacion(Ubicacion ubi)
    {
        setDireccion(ubi);
    }

    /**
     * @return the direccion
     */
    public Ubicacion getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(Ubicacion direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the ubicacion
     */
    public void leer()
    {
         for (int i = 1; i < getNroPaquetes()+1; i++) {
            paquetes[i].leer();
        }
    }
}
