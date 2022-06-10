public class Viaje {
    private String fechaInicio;
    private String fechaFinal;
    private int nroAmigos; 
    private Amigo amigos[] = new Amigo[20];
    private ArchivoOT operador;
    private Paquete paquete;
    private int precioTotal;
    
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
