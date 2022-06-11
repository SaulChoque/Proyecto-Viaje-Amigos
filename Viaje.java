import java.io.Serializable;

public class Viaje implements Serializable{
    private String fechaInicio;
    private String fechaFinal;
    private int nroAmigos; 
    private Amigo amigos[] = new Amigo[20];
    private ArchivoOT operador;
    private Paquete paquete;
    private int precioTotal;
    
    public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getFechaFinal() {
		return fechaFinal;
	}
	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	public int getNroAmigos() {
		return nroAmigos;
	}
	public void setNroAmigos(int nroAmigos) {
		this.nroAmigos = nroAmigos;
	}
	public Amigo[] getAmigos() {
		return amigos;
	}
	public void setAmigos(Amigo[] amigos) {
		this.amigos = amigos;
	}
	public ArchivoOT getOperador() {
		return operador;
	}
	public void setOperador(ArchivoOT operador) {
		this.operador = operador;
	}
	public Paquete getPaquete() {
		return paquete;
	}
	public void setPaquete(Paquete paquete) {
		this.paquete = paquete;
	}
	public int getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(int precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	public void leerFechaAmigos() 
    {
    	System.out.print("Introdusca la fecha de inicio del viaje (DD/MM/AA) => ");
    	this.fechaInicio = Leer.dato();
    	System.out.print("Introdusca la fecha final del viaje (DD/MM/AA) => ");
    	this.fechaFinal = Leer.dato();
    	System.out.print("Introdusca el numero de amigos => ");
    	this.nroAmigos = Leer.datoInt();
		for (int i = 0; i < this.nroAmigos; i++) {
			this.amigos[i].leer();
		}
	}
    public void mostrarAmigos() 
    {
		System.out.println("Numero de amigos: "+this.nroAmigos);
		for (int i = 0; i < amigos.length; i++) {
			this.amigos[i].mostrar();
		}
	}
    public void mostrar() 
    {
		System.out.println("Fecha de Inicio del Viaje: "+this.fechaInicio);
		System.out.println("Fecha Final del Viaje: "+this.fechaFinal);
		
		
		System.out.println("Precio Total: Bs. "+this.precioTotal);
	}
    public void seleccionarOT() 
    {
		
	}
}
