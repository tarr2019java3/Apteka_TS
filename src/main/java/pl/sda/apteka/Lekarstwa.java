package pl.sda.apteka;

public class Lekarstwa {
    private String[] nazwa;
    private double[] cena;
    private double[] refundacja;

    public Lekarstwa(String[] nazwa, double[] cena, double[] refundacja) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.refundacja = refundacja;
    }

    public Lekarstwa() {
    }

    public String[] getNazwa() {
        return nazwa;
    }

    public void setNazwa(String[] nazwa) {
        this.nazwa = nazwa;
    }

    public double[] getCena() {
        return cena;
    }

    public void setCena(double[] cena) {
        this.cena = cena;
    }

    public double[] getRefundacja() {
        return refundacja;
    }

    public void setRefundacja(double[] refundacja) {
        this.refundacja = refundacja;
    }

    public double cena(String lek, boolean ubezpieczony) {
        double cenafinal=0;
        if (ubezpieczony) {

            for (int i = 0; i < this.nazwa.length; i++) {

                if (this.getNazwa()[i].equals(lek))
                     cenafinal =this.getCena()[i]-(this.getCena()[i] * this.getRefundacja()[i]);
            }
        }
        else {
            for (int i = 0; i< this.nazwa.length - 1; i++) {

                if (this.getNazwa()[i].equals(lek))
                    cenafinal = this.getCena()[i];
            }
        }
        return cenafinal;
    }

    public String maksymalnarefudnacjja(){
        int nrlek=0;
        double maksref =0;

        for(int i =0;i < this.refundacja.length;i++){
            if(maksref<=this.getCena()[i]*this.getRefundacja()[i]){
                maksref = this.getCena()[i]*this.getRefundacja()[i];
                nrlek = i;
            }
        }


        return this.getNazwa()[nrlek];
    }
    public double kosztCalkowity(){
        double koszt = 0;
        for(int i =0;i < this.refundacja.length;i++){

            koszt=this.getCena()[i]-(this.getCena()[i] * this.getRefundacja()[i]);
            }

        return koszt;
    }

    public void wyswietl(){
        for(int i =0;i<this.getRefundacja().length;i++ ){
        System.out.println(this.getNazwa()[i]+", "+this.getCena()[i]+", "+this.getRefundacja()[i]);
        }
    }


}
