public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Clasica miClasica = new Clasica();
        miClasica.setEmisor("Visa");
        miClasica.setCupo(2234L);
        miClasica.setNumeroTarjeta("999999");
        miClasica.setCvv(12);
        miClasica.imprimir();

        Dorada miDorada = new Dorada();
        miDorada.setEmisor("MasterCard");
        miDorada.setCupo(4444l);
        miDorada.setNumeroTarjeta("88888");
        miDorada.setCvv(13);
        miDorada.imprimir();

        Dorada miPlatinum = new Dorada();
        miPlatinum.setEmisor("American Express");
        miPlatinum.setCupo(5555l);
        miPlatinum.setNumeroTarjeta("7777");
        miPlatinum.setCvv(14);
        miPlatinum.imprimir();

        Dorada miBlack = new Dorada();
        miBlack.setEmisor("Visa");
        miBlack.setCupo(6666l);
        miBlack.setNumeroTarjeta("6666");
        miBlack.setCvv(15);
        miBlack.imprimir();

    }
}