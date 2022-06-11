
public class Principal {

	public static void main(String[] args) 
	{

		//JOSE MENU
		bool sw = true;
		while( sw ) {
			System.out.println("\n ");
			System.out.println(" MENU DE VIAJES ");
			System.out.println(" ==== ");
			System.out.println(" ");
			System.out.println("1. CREAR VIAJE ");
			System.out.println("2. MOSTRAR PAQUETE ");
			System.out.println("3. SELECCIONAR PAQUETE ");
			
			
			//SAUL SWITCH
			switch(Leer.datoChar()) {

				case '1':
					System.out.println();
					vx.crear();
					break;
				case '2':
					System.out.println();
					kkk.adicionar();
					break;
					










				case '3':
					System.out.println();
					System.out.print(" Inserte codigo del paquete a seleccionar => ");
					String x=Leer.dato();
					vx.seleccionarPaq(x);
					break;
				case '4':
					System.out.println();
					kkk.capacidad();
					break;
				case '5':
					System.out.println();
					kkk.buscarAsiento();
					break;
				case '6':
					Console.Write("\nInserte la hora a buscar => ");
					kkk.eliminar(Console.ReadLine());
					break;
				default:
					System.out.println();
					System.out.println("\n El programa ya termino !!!");
					sw = false;
					break;
			}
		}
	}

}
