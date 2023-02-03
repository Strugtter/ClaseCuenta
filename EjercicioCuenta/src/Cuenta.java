public class Cuenta {
    private double saldoDeCuenta;
    private String nombreDelTitular;

    private long numeroDeCuenta;

    public Cuenta(String nombreDelTitular , double saldoDeCuenta , long numeroDeCuenta){
        this.nombreDelTitular = nombreDelTitular;
        this.saldoDeCuenta = saldoDeCuenta;
        this.numeroDeCuenta = numeroDeCuenta;
    }

    void setSaldoDeCuenta (double cantIngreso){
        this.saldoDeCuenta += cantIngreso;
    }
    void modificarSaldoDeCuenta (double cantIngreso){
        this.saldoDeCuenta = this.saldoDeCuenta - cantIngreso;
    }

    double getSaldoDeCuenta (){
       return  this.saldoDeCuenta;
    }

}
