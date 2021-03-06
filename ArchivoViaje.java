import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ArchivoViaje {

    private String nombre;
    private Viaje temp;
    public ArchivoViaje(){this.nombre="";}
    public ArchivoViaje(String x){this.nombre=x;}

    public void crear() throws FileNotFoundException, IOException
    {
        temp=new Viaje();
        ObjectOutputStream arch=new ObjectOutputStream(new FileOutputStream(this.nombre));
        arch.close();
        System.out.println("Archivo creado");
    }

    public void listar() throws IOException, ClassNotFoundException
    {
        ObjectInputStream arch=new ObjectInputStream(new FileInputStream(this.nombre));
        Viaje vx;
        try{
            while(true)
            {
                vx=new Viaje();
                vx=(Viaje) arch.readObject();
                vx.mostrar();
            }
        }catch(Exception a){

        }finally{
            arch.close();
        }
    }
    public void adicionar() throws FileNotFoundException, IOException
    {
        //ObjectInputStream archi = new ObjectInputStream(new FileInputStream(this.nombre));
        ObjectOutputStream archi=new ObjectOutputStream(new FileOutputStream(this.nombre));
        Viaje vx;
        try
        {    
                do{
                    vx=new Viaje();
                    vx.leerFechaAmigos();
                    archi.writeObject(vx);
                    System.out.print("|| Desea seguir añadiendo registros? (s/n) => ");
                }while(Leer.datoChar()=='s');
        }
        catch(Exception e)
        {}
        finally{
            archi.close();
            File farchi=new File(this.nombre);
            File farchi1=new File("architempo.obj");
            farchi1.renameTo(farchi);
            System.out.println("obj adicionado ");
        }
    }
    public void seleccionarPaq(String x, ArchivoOT y) throws IOException, ClassNotFoundException
    {
        ObjectOutputStream arch=new ObjectOutputStream(new FileOutputStream(this.nombre));
        temp.seleccionarPaq(x,y);
        try{
            arch.writeObject(temp);
        }catch(Exception a){

        }finally{
            System.out.println("Se ha agregado el paquete !!!");
            arch.close();
        }
    }   
}
