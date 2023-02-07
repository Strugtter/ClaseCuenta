import java.util.Calendar;
import java.util.Date;

public class Embarcacion {

    private int precioBase;
    private int valorAdicional;
    private Date anoFabricacion;
    private int esolora;
    private Capitan capitan;
    private int alquiler;

    public Embarcacion(int precioBase, int valorAdicional, Date anoFabricacion, int esolora, Capitan capitan) {
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anoFabricacion = anoFabricacion;
        this.esolora = esolora;
        this.capitan = capitan;
    }

    public int calcularAlquiler(){

        Calendar calendario = Calendar.getInstance();
        calendario.setTime(anoFabricacion);
        int year = calendario.get(Calendar.YEAR);

        if(year<2020){
            alquiler = precioBase;
        } else {
            alquiler = precioBase + 20000;
        }
        return alquiler;
    }
}
