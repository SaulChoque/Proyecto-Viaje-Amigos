import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ArchivoOT {
    private String nombre;
    public ArchivoOT(){this.nombre="";}
    public ArchivoOT(String x){this.nombre=x;}

    public void crear() throws FileNotFoundException, IOException
    {
        ObjectOutputStream arch=new ObjectOutputStream(new FileOutputStream(this.nombre));
        arch.close();
        System.out.println("Archivo creado");
    }

    void listar() throws IOException, ClassNotFoundException
    {
        ObjectOutputStream arch=new ObjectOutputStream(new FileOutputStream(this.nombre));
        
        //OperadorTurismo vx
        try{
            while(true){
                //vx=new OperadorTurismo();
                //vx=(OperadorTurismo) arch.readObject();
                //vx.mostrar();
            }
        }catch(Exception a){

        }finally{
            arch.close();
        }
    }
    void adicionar(OperadorTurismo x) throws FileNotFoundException, IOException
    {
        ObjectOutputStream archi1=new ObjectOutputStream(new FileOutputStream("architempo.obj"));
        ObjectInputStream archi = new ObjectInputStream(new FileInputStream(this.nombre));
        OperadorTurismo opx;
        try
        {    
            while(true){
                opx=(OperadorTurismo)archi.readObject();
                archi1.writeObject(opx);
            } 
        }
        catch(Exception e)
        {
            archi1.writeObject(x);
            archi1.close();
            archi.close();
            File farchi=new File(this.nombre);
            File farchi1=new File("architempo.obj");
            farchi1.renameTo(farchi);
            System.out.println("obj adicionado ");
        }
    }
}
