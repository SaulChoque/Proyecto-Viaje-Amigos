import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
        ObjectOutputStream archi1=new ObjectOutputStream(new FileOutputStream("architempo.obj"));
        ObjectInputStream archi = new ObjectInputStream(new FileInputStream(this.nombre));
        Viaje vx;
        try
        {    
            while(true){
                vx=(Viaje)archi.readObject();
                archi1.writeObject(vx);
            } 
        }
        catch(Exception e)
        {
            do{
                vx=new Viaje();
                vx.leerFechaAmigos();
                archi1.writeObject(vx);
                System.out.print("|| Desea seguir añadiendo registros? (s/n) => ");
            }while(System.in.read()==115);
        }
        finally{
            archi1.close();
            archi.close();
            File farchi=new File(this.nombre);
            File farchi1=new File("architempo.obj");
            farchi1.renameTo(farchi);
            System.out.println("obj adicionado ");
        }
    }

}
