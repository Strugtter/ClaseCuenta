import java.util.Date;
import java.util.Calendar;


public class  Velero extends Embarcacion {

    private int cantidadMastiles;

    public Velero(int precioBase, int valorAdicional, Date anoFabricacion, int esolora, Capitan capitan, int cantidadMastiles) {
        super(precioBase, valorAdicional, anoFabricacion, esolora, capitan);
        this.cantidadMastiles = cantidadMastiles;
    }

    public void tipoVelero(){
        if(cantidadMastiles >= 4){
            System.out.println("El velero es grande porque tiene " + cantidadMastiles + " Mástiles");
        } else {
            System.out.println("El velero es pequeño porque tiene " + cantidadMastiles + " Mástiles");
        }
    }


}
