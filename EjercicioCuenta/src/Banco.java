public class Banco {
    private Cuenta[] cuentas;
    private int contadorCuentas = 0;

    public Banco (){
        this.cuentas = new Cuenta[2];
    }

    public void agregarCuenta(Cuenta cuenta){
        if(contadorCuentas <=1){
            cuentas[contadorCuentas] = cuenta;
            contadorCuentas++;
        } else {
            System.out.println("No se puede agregar mas cuentas");
        }
    }

    public boolean trasnferir(int cuentaRemitente, int cuentaRecibe, double monto){
        double saldoCuentaRemitente = this.cuentas[cuentaRemitente].getSaldoDeCuenta();
        double saldoCuentaRecibe = this.cuentas[cuentaRecibe].getSaldoDeCuenta();

        if (monto > saldoCuentaRemitente){
            System.out.println("Saldo insuficiente");
            return false;
        } else {
            this.cuentas[cuentaRecibe].setSaldoDeCuenta(monto);
            this.cuentas[cuentaRemitente].modificarSaldoDeCuenta(monto);
            return true;
        }
    }


}
