public class Itinerario {
    private int dia, nroActividades;
    private String actividad[][] = new String [20][2];
    
    public Itinerario() {
        dia=0;

        //f1=hora
        //f2=descripcion
        //Salar de Uyuni
        actividad[1][1]="10:30";
        actividad[1][2]="visita al cementerio de trenes";
        actividad[2][1]="11:00";
        actividad[2][2]="Ir a Colchani para observar artesanias de Sal";
        actividad[3][1]="12:00";
        actividad[3][2]="Ir hacia el hotel de Sal";
        actividad[4][1]="12:30";
        actividad[4][2]="Almuerzo";
        actividad[5][1]="15:00";
        actividad[5][2]="Visitar la isla del pescado con cactus gigantes, desde el cual podran observar el Salar en su totalidad";
        actividad[6][1]="19:30";
        actividad[6][2]="Volver al hospedaje en el Hotel de Sal y cena";
    }

    public Itinerario(int a){
        dia=a;

        actividad[7][1]="10:00";
        actividad[7][2]="Salir del Hotel para poder visitar los diferentes lagos como ser: Laguna Kañapa, Laguna Hedionda, Laguna Chiarkota, Arbol de Piedra";
        actividad[8][1]="19:00";
        actividad[8][2]="Finalmente llegaremos hasta la laguna Colorada donde dormiremos en un refugio";
    }

        public Itinerario(String a){
        dia=0;

        actividad[9][1]="05:00";
        actividad[9][2]="Salir de la Laguna Colorada para ver los Geysers con el salir del sol";
        actividad[10][1]="08:00";
        actividad[10][2]="Visitar las aguas termales y fumarolas";
        actividad[11][1]="13:00";
        actividad[11][2]="Terminar el Tour en la Laguna Verde";
        actividad[12][1]="16:00";
        actividad[12][2]="retorno a Uyuni";
        actividad[13][1]="18:30";
        actividad[13][2]="Arribo a Uyuni";
    }
       public void leer(){
        
       }

    }