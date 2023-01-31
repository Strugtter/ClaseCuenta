public class Cuenta {
    private double saldoDeCuenta;
    private String nombreDelTitular;

    private long numeroDeCuenta;
    private int cantIngresar;
    private int cantRetirar;

    public Cuenta(String nombreDelTitular , double saldoDeCuenta ){

        this.nombreDelTitular = nombreDelTitular;
        this.saldoDeCuenta = saldoDeCuenta;
    }

    void setIngreso (int cantIngreso){
        this.cantIngresar = cantIngreso;
    }

    void setRetiro (int cantRetiro){
        this.cantRetirar = cantRetiro;
    }

    double getSaldoCuenta (){
       return  this.saldoDeCuenta;
    }

    String getDatosCuenta (){
      return  this.nombreDelTitular;
    }
}
