public class CardCredito {
    private String emisor;
    private Long cupo;
    private String numeroTarjeta;
    private int cvv;
   // private LocalDate fechaVencimiento;

    public CardCredito (){
    }

    public String getEmisor() {
        return emisor;
    }

    public Long getCupo() {
        return cupo;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public int getCvv() {
        return cvv;
    }

   // public LocalData getFechaVencimiento() {
   //     return fechaVencimiento;
   // }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public void setCupo(Long cupo) {
        this.cupo = cupo;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

  //  public void setFechaVencimiento(LocalData fechaVencimiento) {
  //      this.fechaVencimiento = fechaVencimiento;
  //  }

    public void imprimir (){
        String emisor = getEmisor();
        Long cupo = getCupo();
        String numeroTarjeta = getNumeroTarjeta();
        int cvv = getCvv();
        System.out.println("El emisor es: " + emisor + " El cupo es: " + cupo + " el numero de tarjeta es: " + numeroTarjeta + " y el codigo cvv es: "+ cvv);
    }
}




