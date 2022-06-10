import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ArchivoViaje {

    private String nombre;
    public ArchivoViaje(){this.nombre="";}
    public ArchivoViaje(String x){this.nombre=x;}

    public void crear() throws FileNotFoundException, IOException
    {
        ObjectOutputStream arch=new ObjectOutputStream(new FileOutputStream(this.nombre));
        arch.close();
        System.out.println("Archivo creado");
    }

    void listar() throws IOException, ClassNotFoundException
    {
        ObjectOutputStream arch=new ObjectOutputStream(new FileOutputStream(this.nombre));
        //Vieja vx
        try{
            while(true)
            {
                //vx=new Viaje();
                //vx=(Viaje) arch.readObject();
                //vx.mostrar();
            }
        }catch(Exception a){

        }finally{
            arch.close();
        }
    }
    void adicionar() throws FileNotFoundException, IOException
    {
        Scanner sc=new Scanner(System.in);
        ObjectOutputStream archt=new ObjectOutputStream(new FileOutputStream("tempViejas.obj"));
        ObjectInputStream arch=new ObjectInputStream(new FileInputStream(this.nombre));
        //Vieja vx
        try{
            do{
                //vx=new Viaje();
                //vx.leer();
                //arch.writeObject(vx);
                System.out.println("Desea seguir añadiendo  Viajes (y/n): ");
            }while(sc.nextLine().charAt(0)=='s');
                
        }catch(Exception a){

        }finally{
            arch.close();
        }        
    }

}
