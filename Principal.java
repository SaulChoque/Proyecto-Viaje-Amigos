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
		a1.paquetes[0].addTrasporte(new Aereo("05:30","10:00",new Ubicacion("La Paz","El Alto Aeropuerto"),new Ubicacion("Santa Cruz","Santa Cruz"),"BOA","A001"),new Aereo("06:30","10:30",new Ubicacion("Santa Cruz","Santa Cruz"),new Ubicacion("La Paz","El Alto"),"AMAZONAS","HJ5001"));
		a1.paquetes[1].addTrasporte(new Terrestre("08:35","10:00",new Ubicacion("La Paz","Terminal La Paz"),new Ubicacion("Chuquisaca","Centro"),"Bus","Leito","JDK258"),new Terrestre("19:00","22:00",new Ubicacion("Choquisaca","Terminal Buses"),new Ubicacion("El Alto","Terminal"),"Bus","Leito","IOR256"));
		a1.paquetes[2].addTrasporte(new Aereo("14:45","18:50",new Ubicacion("La Paz","El Alto Aeropuerto"),new Ubicacion("Beni","Aeropuerto"),"BOA","JFK23"),new Aereo("06:30","10:30",new Ubicacion("Beni","Aeropuerto"),new Ubicacion("La Paz","El Alto Aeropuerto"),"AMAZONAS","JFIF5832"));
		a1.paquetes[3].addTrasporte(new Terrestre("15:45","17:23",new Ubicacion("La Paz","Sagarnaga"),new Ubicacion("Oruro","Terminal"),"MiniBus","Leito","FKF258"),new Terrestre("19:00","22:00",new Ubicacion("Oruro","Terminal Buses"),new Ubicacion("El Alto","Terminal"),"MiniBus","Normal","THQ825"));

		//david
		a2.paquetes[0].addTrasporte(new Terrestre("08:00","14:00",new Ubicacion("La paz"," el alto"),new Ubicacion("coroico","La Paz"),"miniobus"," regular "," 2989 LPCS"),new Terrestre("23:59","7:00",new Ubicacion("Coroico"," La paz"),new Ubicacion("Terminal ","La Paz"),"miniobus"," regular "," 2989 LPCS"));
		a2.paquetes[1].addTrasporte(new Terrestre("12:00","17:00",new Ubicacion("Terminal La paz","La paz",new Ubicacion("Prov Illimani","La paz")."bus Cama","haciento cama","4089 JKPO")),new Terrestre("20:00","03:00",new Ubicacion("Prov Illimani","Terminal La paz")."bus Cama","haciento cama","3045 JKPO"));
		a2.paquetes[2].addTrasporte(new Terrestre("10:00","15:00",new Ubicacion("Terminal La paz","Chapare Cochabamba"),"bus normal","haciento normal","3244 YUOO"),new Terrestre("21:00","10:00",new Ubicacion("Terminal CochaBamba","Terminal La paz"),"bus Cama","haciento cama","3920 YHJA"));
		a2.paquetes[3].addTrasporte(new Aereo("05:30","10:00",new Ubicacion("La Paz","El Alto"),new Ubicacion("Tarija ","Tarija"),"TAM","C001"),new Aereo("4:30","19:00",new Ubicacion("Tarija","Tarija"),new Ubicacion("La paz","El alto"),"TAM","D023"));

		//?
		a3.paquetes[0].addTrasporte(new Terrestre("16:45","19:23",new Ubicacion("La Paz","Sagarnaga"),new Ubicacion("La Paz","Yungas"),"MiniBus","Normal","JYU286"),new Terrestre("19:00","22:00",new Ubicacion("La Paz","Terminal Buses"),new Ubicacion("El Alto","Terminal"),"MiniBus","Normal","KJD258"));
		a3.paquetes[1].addTrasporte(new Terrestre("07:35","11:00",new Ubicacion("La Paz","Terminal La Paz"),new Ubicacion("La Paz","Yungas"),"MiniBus","Normal","JGH968"),new Terrestre("19:00","22:00",new Ubicacion("La Paz","Terminal Buses"),new Ubicacion("El Alto","Terminal"),"MiniBus","Leito","JDK150"));
		a3.paquetes[2].addTrasporte(new Aereo("06:30","11:00",new Ubicacion("La Paz","El Alto Aeropuerto"),new Ubicacion("Santa Cruz","Santa Cruz"),"BOA","SD201"),new Aereo("06:30","10:30",new Ubicacion("Santa Cruz","Santa Cruz"),new Ubicacion("La Paz","El Alto"),"BOA","SFE201"));
		a3.paquetes[3].addTrasporte(new Terrestre("08:35","11:00",new Ubicacion("La Paz","Terminal La Paz"),new Ubicacion("La Paz","Yungas"),"MiniBus","Normal","GDF256"),new Terrestre("19:00","22:00",new Ubicacion("La Paz","Terminal Buses"),new Ubicacion("El Alto","Terminal"),"MiniBus","Normal","FRF526"));
		
		//Jose
		a4.paquetes[0].addTrasporte(new Terrestre("08:00","10:00",new Ubicacion("La Paz","La Paz"),new Ubicacion("Cochabamba","Totora"),"Bus","Normal","35DG54"),new Terrestre("15:00","17:00",new Ubicacion("Cochabamba","Cochambamba"),new Ubicacion("La Paz","La Paz"),"Bus","Normal","4HYVY55"));
		a4.paquetes[1].addTrasporte(new Terrestre("07:00","10:30",new Ubicacion("La Paz","La Paz"),new Ubicacion("La Paz","Coroico"),"Minibus","Normal","G5GDH4"),new Terrestre("10:00","12:00",new Ubicacion("La Paz","Coroico"),new Ubicacion("La Paz","La Paz"),"Minibus","Normal","3HU5G5"));
		a4.paquetes[2].addTrasporte(new Aereo("06:00","11:00",new Ubicacion("La Paz","El Alto"),new Ubicacion("Santa Cruz","Santa Cruz"),"TAM","DT01"),new Aereo("08:30","12:00",new Ubicacion("Santa Cruz","Santa Cruz"),new Ubicacion("La Paz","El Alto"),"TAM","UA01"));
		a4.paquetes[3].addTrasporte(new Terrestre("11:00","14:00",new Ubicacion("La Paz","La Paz"),new Ubicacion("Oruro","Uyuni"),"Bus","Bus/Cama","DT58G5"),new Terrestre("08:00","10:00",new Ubicacion("Oruro","Uyuni"),new Ubicacion("La Paz","La Paz"),"Bus","Bus/Cama","364ASU1"));







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
	