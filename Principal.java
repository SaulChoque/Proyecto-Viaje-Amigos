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
		a1.paquetes[1].addTrasporte(new Terrestre(),new Terrestre("05:30","10:00",new Ubicacion("La Paz","El Alto"),new Ubicacion("Santa Cruz","Santa Cruz")));
		a1.paquetes[2].addTrasporte(new Aereo(),new Aereo());
		a1.paquetes[3].addTrasporte(new Terrestre(),new Terrestre());

		//david
		a2.paquetes[0].addTrasporte(new Terrestre("08:00","14:00",new Ubicacion("La paz"," el alto"),new Ubicacion("coroico","La Paz"),"miniobus"," regular "," 2989 LPCS"),new Terrestre("23:59","7:00",new Ubicacion("Coroico"," La paz"),new Ubicacion("Terminal ","La Paz"),"miniobus"," regular "," 2989 LPCS"));
		a2.paquetes[1].addTrasporte(new Terrestre("12:00","17:00",new Ubicacion("Terminal La paz","La paz",new Ubicacion("Prov Illimani","La paz")."bus Cama","haciento cama","4089 JKPO")),new Terrestre("20:00","03:00",new Ubicacion("Prov Illimani","Terminal La paz")."bus Cama","haciento cama","3045 JKPO"));
		a2.paquetes[2].addTrasporte(new Terrestre("10:00","15:00",new Ubicacion("Terminal La paz","Chapare Cochabamba"),"bus normal","haciento normal","3244 YUOO"),new Terrestre("21:00","10:00",new Ubicacion("Terminal CochaBamba","Terminal La paz"),"bus Cama","haciento cama","3920 YHJA"));
		a2.paquetes[3].addTrasporte(new Aereo("05:30","10:00",new Ubicacion("La Paz","El Alto"),new Ubicacion("Tarija ","Tarija"),"TAM","C001"),new Aereo("4:30","19:00",new Ubicacion("Tarija","Tarija"),new Ubicacion("La paz","El alto"),"TAM","D023"));

		//?
		a3.paquetes[0].addTrasporte(new Terrestre(),new Terrestre());
		a3.paquetes[1].addTrasporte(new Terrestre(),new Terrestre());
		a3.paquetes[2].addTrasporte(new Aereo(),new Aereo());
		a3.paquetes[3].addTrasporte(new Terrestre(),new Terrestre());

		//Jose
		a4.paquetes[0].addTrasporte(new Terrestre(),new Terrestre());
		a4.paquetes[1].addTrasporte(new Terrestre(),new Terrestre());
		a4.paquetes[2].addTrasporte(new Aereo(),new Aereo());
		a4.paquetes[3].addTrasporte(new Terrestre(),new Terrestre());

		




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
	