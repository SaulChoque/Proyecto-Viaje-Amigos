
public class Principal {

	public static void main(String[] args) 
	{
		//JOSE MENU
		int op=0;
		try {
			do		
			{System.out.println("\n ");
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
					Console.WriteLine();
					kkk.crear();
					break;
				case '2':
					Console.WriteLine();
					kkk.adicionar();
					break;
				case '3':
					Console.WriteLine();
					kkk.listar();
					break;
				case '4':
					Console.WriteLine();
					kkk.capacidad();
					break;
				case '5':
					Console.WriteLine();
					kkk.buscarAsiento();
					break;
				case '6':
					Console.Write("\nInserte la hora a buscar => ");
					kkk.eliminar(Console.ReadLine());
					break;
				default:
					Console.WriteLine();
					Console.WriteLine("\n El programa ya termino !!!");
					sw = false;
					break;
			}
			}while(op>4)
			}catch (Exception e) {
			System.out.println("error"+e);
		}
		
	}

}
