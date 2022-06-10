//import java.util.Scanner;

public class Persona {

	protected String nombre;
	protected int ci;
	protected String genero;
	
	public void leer() 
	{
		//Scanner lee = new Scanner(System.in);
		System.out.print("Introdusca el nombre => ");
		this.nombre = Leer.dato();
		System.out.print("Introdusca C.I => ");
		this.ci = Leer.datoInt();
		System.out.println("Introdusca el genero(Masculino'm'/Femenino'f') => ");
		this.genero = Leer.dato();
	}
	public void mostrar() 
	{
		System.out.println("Nombre: "+this.nombre);
		System.out.println("C.I.: "+this.ci);
		if (genero=="m") {
			System.out.println("Genero: Masculino");
		}
		if (genero=="f") {
			System.out.println("Genero: Femenino");
		}
	}
	
}
