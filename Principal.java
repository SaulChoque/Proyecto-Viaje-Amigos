import java.io.FileNotFoundException;
import java.io.IOException;


public class Principal {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		ArchivoOT AOT = new ArchivoOT("Operadores.obj");
		ArchivoViaje AV = new ArchivoViaje("Viajes.obj");

		OperadorTurismo a1=new OperadorTurismo("Turismo Bolivia", "Turismo al interior del pais", 22813405, 4);
		OperadorTurismo a2=new OperadorTurismo("EXTREMESPORTS", "Turismo de riesgo ", 77242197, 4);
		OperadorTurismo a3=new OperadorTurismo("AKAPACHA", "Operadora de turismo desde 2003", 71248627, 4);
		OperadorTurismo a4=new OperadorTurismo("BARROBIKING", "Tours extremos en bicicleta", 800179000, 4);
		
		a1.anadirUbicacion(new Ubicacion("La Paz","Sagarnaga"));
		a2.anadirUbicacion(new Ubicacion("La Paz","Obrajes"));
		a3.anadirUbicacion(new Ubicacion("La Paz","Sagarnaga"));
		a4.anadirUbicacion(new Ubicacion("Cochabamba","La Chimba"));
		
		//paquete lectura
		System.out.println("- P1");
		a1.leer();
		System.out.println("- P2");
		a2.leer();
		System.out.println("- P3");
		a3.leer();
		System.out.println("- P4");
		a4.leer();

		//saul
		a1.paquetes[0].addTrasporte(new Aereo("05:30","10:00",new Ubicacion("La Paz","El Alto"),new Ubicacion("Santa Cruz","Santa Cruz"),"BOA","A001"),new Aereo("06:30","10:30",new Ubicacion("Santa Cruz","Santa Cruz"),new Ubicacion("La Paz","El Alto"),"AMAZONAS","HJ5001"));
		a1.paquetes[1].addTrasporte(new Transporte(),new Transporte());
		a1.paquetes[2].addTrasporte(new Aereo(),new Aereo());
		a1.paquetes[3].addTrasporte(new Transporte(),new Transporte());

		//david
		a2.paquetes[0].addTrasporte(new Transporte(),new Transporte());
		a2.paquetes[1].addTrasporte(new Transporte(),new Transporte());
		a2.paquetes[2].addTrasporte(new Transporte(),new Transporte());
		a2.paquetes[3].addTrasporte(new Aereo(),new Aereo());

		//?
		a3.paquetes[0].addTrasporte(new Transporte(),new Transporte());
		a3.paquetes[1].addTrasporte(new Transporte(),new Transporte());
		a3.paquetes[2].addTrasporte(new Aereo(),new Aereo());
		a3.paquetes[3].addTrasporte(new Transporte(),new Transporte());

		//Jose
		a4.paquetes[0].addTrasporte(new Transporte(),new Transporte());
		a4.paquetes[1].addTrasporte(new Transporte(),new Transporte());
		a4.paquetes[2].addTrasporte(new Aereo(),new Aereo());
		a4.paquetes[3].addTrasporte(new Transporte(),new Transporte());

		




		AOT.adicionar(x);



/* 

//JOSE MENU
int op=0;
try {
	do		
	{
		System.out.println("\n ");
		System.out.println(" MENU DE VIAJES ");
				System.out.println(" ==== ");
				System.out.println(" ");
				System.out.println("1. CREAR VIAJE ");
				System.out.println("2. MOSTRAR PAQUETE ");
				System.out.println("3. SELECCIONAR PAQUETE ");
				
				op = Leer.datoInt();
				//SAUL SWITCH
				switch(op) {
					
					case '1':
					System.out.println();
					AV.crear();
					//aaa
						break;
						case '2':
						System.out.println();
						
						
						case '3':
						System.out.print("\n\nIntroduzca el codigo del paquete a seleccionar => ");
						vx.seleccionarPaq(Leer.dato());
						break;
						
						default:
						System.out.println();
						System.out.println("\n El programa ya termino !!!");
						sw = false;
						break;
					}
				}while(op>4)
			}catch (Exception e) {
				System.out.println("error"+e);
			}
			
			*/
		}
		
	}
	