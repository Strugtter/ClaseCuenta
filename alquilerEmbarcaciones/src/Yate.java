import java.util.Date;

public class Yate extends Embarcacion{

    private int cantidadCamarote;

    public Yate(int precioBase, int valorAdicional, Date anoFabricacion, int esolora, Capitan capitan, int cantidadCamarote) {
        super(precioBase, valorAdicional, anoFabricacion, esolora, capitan);
        this.cantidadCamarote = cantidadCamarote;

    }

    public void tipoYate(){
        if(cantidadCamarote >= 7){
            System.out.println("El yate es de lujo porque tiene " + cantidadCamarote + " camarotes");
        } else {
            System.out.println("El yate no es de lujo porque tiene " + cantidadCamarote + " camarotes");
        }
    }
}
