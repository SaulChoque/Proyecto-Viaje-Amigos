//import java.util.Scanner;
import java.io.Serializable;
public class Amigo extends Persona implements Serializable{

	
	private int telefono;
	
	public Amigo(){
		super();
		telefono=0;
	}
	
	public void leer() {
		super.leer();
		//Scanner lee = new Scanner(System.in);
		System.out.println("Introduzca el telefono => ");
		this.telefono = Leer.datoInt();
	}
	public void mostrar() {
		super.mostrar();
		System.out.println("Telefono: "+this.telefono);
	}

	//Getters & Setters
	public int getTelefono() {return telefono;}
	public void setTelefono(int telefono) {this.telefono = telefono;}
}
