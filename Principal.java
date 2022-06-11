
public class Principal {

	public static void main(String[] args) 
	{
		//JOSE MENU
		bool sw = true;
		while( sw ) {
			Console.WriteLine("\n ");
			Console.WriteLine(" MENU ");
			Console.WriteLine(" ==== ");
			Console.WriteLine(" ");
			Console.WriteLine("1. CREAR ");
			Console.WriteLine("2. ADICION ");
			Console.WriteLine("3. LISTADO ");
			Console.WriteLine("4. INCISO B) ");
			Console.WriteLine("5. INCISO C) ");
			Console.WriteLine("6. INCISO D) ");
			Console.WriteLine("0. SALIR ");
			Console.WriteLine(" ");
			Console.Write("INTRODUCIR UNA OPCION => ");
			
			//SAUL SWITCH
			switch( Console.ReadKey().KeyChar ) {

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
		}
	}

}
