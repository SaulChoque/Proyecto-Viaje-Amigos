//import java.util.Scanner;
import java.io.Serializable;

public class Persona implements Serializable{

	protected String nombre,genero;
	protected int ci;
	
	public Persona(){
		nombre="";
		genero="";
		ci=0;
	}


	public void leer() 
	{
		//Scanner lee = new Scanner(System.in);
		System.out.print("Introduzca el nombre => ");
		this.nombre = Leer.dato();
		System.out.print("Introduzca C.I => ");
		this.ci = Leer.datoInt();
		System.out.println("Introduzca el genero(Masculino'm'/Femenino'f') => ");
		this.genero = Leer.dato();
	}

	public void mostrar() 
	{
		System.out.print("Nombre: "+this.nombre+" || C.I.: "+this.ci);
		if (genero=="m") {
			System.out.println("Genero: Masculino");
		}
		if (genero=="f") {
			System.out.println("Genero: Femenino");
		}
	}

	//Getters & Setters
	public String getNombre() {return nombre;}
	public String getGenero() {return genero;}
	public int getCi() {return ci;}

	public void setCi(int ci) {this.ci = ci;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public void setGenero(String genero) {this.genero = genero;}	
}

