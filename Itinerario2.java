public class Itinerario2 {
    private int dia;
    private String actividad[][] = new String [20][2];
    
    public Itinerario2() {
        dia=1;

        //f1=hora
        //f2=descripcion
        //Huayna Potosi
        actividad[1][1]="10:00";
        actividad[1][2]="Saliendo del Hotel hasta la plataforma de Zongo";
        actividad[2][1]="15:00";
        actividad[2][2]="Tendremos una paractica en el glaciar antiguo y la asistencia de un guia experto";
    }

    public Itinerario2(int a){
        dia=2;

        actividad[3][1]="10:00";
        actividad[3][2]="Empezamos con el ascenso hasta campo alto 5200m hasta llegar a un refugio, despues de un breve descanso revisamos el equipo de montaña, cenaremos temprano";
    }

        public Itinerario2(String a){
        dia=3;

        actividad[4][1]="06:00";
        actividad[4][2]="Despues de un desayuno muy temprano empezamos nuestro ascenso hacia la cara Este, para luego continuar el ascenso hasta la cumbre del Huayna Potosi (6088m) son seis horas de ascenso";
        actividad[5][1]="13:00";
        actividad[5][2]="Descendemos hasta campo Alto y despues hasta campo altoy despues hasta campo base";
    }
    void mostrar(){
       
    }
    
}