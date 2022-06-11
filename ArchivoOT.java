import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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

    public void listar() throws IOException, ClassNotFoundException
    {
        ObjectInputStream arch = new ObjectInputStream(new FileInputStream(nombre));
        
        OperadorTurismo opx;
        try{
            while(true){
                opx=new OperadorTurismo();
                opx=(OperadorTurismo) arch.readObject();
                opx.mostrar();
            }
        }catch(Exception a){

        }finally{
            arch.close();
        }
    }
    public void adicionar(OperadorTurismo x) throws FileNotFoundException, IOException
    {
        ObjectOutputStream archi=new ObjectOutputStream(new FileOutputStream(this.nombre));
        
        OperadorTurismo opx;
        try
        {    
            archi.writeObject(x);
        }
        catch(Exception e)
        {}
        finally{
            archi.close();
            archi.close();
            File farchi=new File(this.nombre);
            File farchi1=new File("architempo.obj");
            farchi1.renameTo(farchi);
            System.out.println("obj adicionado ");      
        }
    }
    /*
     
    public void buscDestino(String x, String y) throws IOException, ClassNotFoundException
    {
        ObjectInputStream arch = new ObjectInputStream(new FileInputStream(nombre));
        OperadorTurismo opx;
        Paquete px=new Paquete();
        Ubicacion ux=new Ubicacion(x,y);
        try{
            while(true){
                opx=new OperadorTurismo();
                opx=(OperadorTurismo) arch.readObject();
                opx.destino(ux);
            }
        }catch(Exception a){
            
        }finally{
            arch.close();
        }
        if(px.equals(new Paquete())){
            System.out.println("|| No Existe un paquete con dicho desino!!!");
        }
    }
    */
    public void buscNom(String x) throws IOException, ClassNotFoundException
    {
        ObjectInputStream arch = new ObjectInputStream(new FileInputStream(nombre));
        OperadorTurismo opx;
        try{
            while(true){
                opx=new OperadorTurismo();
                opx=(OperadorTurismo) arch.readObject();
                if(opx.getNombre().equals(x)){
                    opx.mostrar();
                }
            }
        }catch(Exception a){

        }finally{
            arch.close();
        }
    }
    public void buscPrecio(int x) throws IOException, ClassNotFoundException
    {
        ObjectInputStream arch = new ObjectInputStream(new FileInputStream(nombre));
        OperadorTurismo opx;
        Paquete px=new Paquete();
        try{
            while(true){
                opx=new OperadorTurismo();
                opx=(OperadorTurismo) arch.readObject();
                opx.mostPrecio(x);
            }
        }catch(Exception a){

        }finally{
            arch.close();
        }
        if(px.equals(new Paquete())){
            System.out.println("|| No Existe un paquete con dicho precio!!!");
        }
    }
    public Paquete seleccionarPaq(String x) throws IOException, ClassNotFoundException
    {
        ObjectInputStream arch = new ObjectInputStream(new FileInputStream(nombre));
        OperadorTurismo opx;
        Paquete px=new Paquete();
        try{
            while(true){
                opx=new OperadorTurismo();
                opx=(OperadorTurismo) arch.readObject();
                px=opx.seleccionarCod(x);
            }
        }catch(Exception a){

        }finally{
            arch.close();
        }
        if(px.equals(new Paquete())){
            System.out.println("|| No Existe un paquete con dicho codigo!!!");
        }
        else{        
            System.out.print("|| Desea seleccionar este paquete? (s/n) => ");
            if(Leer.datoChar()=='s'){
                return px;
            }
        }return new Paquete();
    }
}
