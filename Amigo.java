//import java.util.Scanner;

public class Amigo extends Persona{

	private int telefono;
	
	public void leer() 
	{
		super.leer();
		//Scanner lee = new Scanner(System.in);
		System.out.println("Introdusca el telefono");
		this.telefono = Leer.datoInt();
	}
	public void mostrar() 
	{
		super.mostrar();
		System.out.println("Telefono: "+this.telefono);
	}
}
