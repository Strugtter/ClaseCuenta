import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Capitan miCapitan = new Capitan("Camilo", "Botina", 1111);
        Date fabricacionVelero = new Date(122,5,2);
        Velero miVelero = new Velero(12000, 20000, fabricacionVelero, 300,miCapitan, 4 );
        int montoAlquilerVelro = miVelero.calcularAlquiler();
        miVelero.tipoVelero();
        System.out.println("El monto del alquiler es: " + montoAlquilerVelro);

        Date fabricacionYate = new Date(119,5,2);
        Yate miYate = new Yate(5000, 20000, fabricacionYate, 100,miCapitan, 8 );
        int montoAlquilerYate = miYate.calcularAlquiler();
        miYate.tipoYate();
        System.out.println("El monto del alquiler es: " + montoAlquilerYate);









    }
}