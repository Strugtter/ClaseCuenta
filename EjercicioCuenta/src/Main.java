public class Main {
    public static void main(String[] args) {

        //Instancia de la cuenta
        Cuenta Micuenta1 = new Cuenta("Camilo", 1000, 1234l);
        Cuenta Micuenta2 = new Cuenta("Andres", 2000, 6789l);

        Banco miBanco = new Banco();
        miBanco.agregarCuenta(Micuenta1);
        miBanco.agregarCuenta(Micuenta2);

        boolean transferencia = miBanco.trasnferir(1,0,2500);
        double SaldoCuenta1 = Micuenta1.getSaldoDeCuenta();
        double SaldoCuenta2 = Micuenta2.getSaldoDeCuenta();
        if(transferencia == true){
            System.out.println("Se realizó la transferencia");
            System.out.println("saldo cuenta 1: " + SaldoCuenta1);
            System.out.println("saldo cuenta 2:" + SaldoCuenta2);
        } else {
            System.out.println("La transferencia no se realizó");
            System.out.println("saldo cuenta 1: " + SaldoCuenta1);
            System.out.println("saldo cuenta 2:" + SaldoCuenta2);
        }




    }
}