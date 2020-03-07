package main.java.pl.sda.apteka;

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

            for (int i = 0; i == this.nazwa.length - 1; i++) {

                if (this.getNazwa()[i] == lek)
                     cenafinal =this.getCena()[i] * this.getRefundacja()[i];
            }
        }
        else {
            for (int i = 0; i == this.nazwa.length - 1; i++) {

                if (this.getNazwa()[i] == lek)
                    cenafinal = this.getCena()[i];
            }
        }
        return cenafinal;
    }
}