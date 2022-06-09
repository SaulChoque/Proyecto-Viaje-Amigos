import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
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
        try{
            //Vieja vx=new Viaje();
            while(true){
                //vx=(Viaje) arch.readObject();
                //vx.mostrar();
            }
        }catch(Exception a){
            System.out.println("// Error: "+a);

        }finally{
            arch.close();
        }
    }
    void adicionar() throws FileNotFoundException, IOException
    {
        ObjectOutputStream archt=new ObjectOutputStream(new FileOutputStream("tempViejas.obj"));
        ObjectInputStream arch=new ObjectInputStream(new FileInputStream(this.nombre));
        try{
            //Vieja vx=new Viaje();
            while(true){
                //vx.leer();
                //vx=(Viaje) arch.readObject();
                
            }
        }catch(Exception a){
            System.out.println("// Error: "+a);

        }finally{
            arch.close();
        }        
    }

}
