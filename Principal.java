
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
					System.out.println();
					vx.crear();
					//aaa
					break;
				case '2':

					System.out.println();
					kkk.adicionar();
					break;

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
		
	}

}
