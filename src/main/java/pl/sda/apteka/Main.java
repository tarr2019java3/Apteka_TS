package pl.sda.apteka;

public class Main {

    public static void main(String[] args) {
String[] nazwa = new String[2];
    nazwa[0]="lek1";
    nazwa[1]="lek2";
    double[] cena = new double[2];
    cena[0]= 4.0;
    cena[1]=4.0;
    double[] refundacja = new double[2];
    refundacja[0] = 0.2;
    refundacja[1] = 0.5;
    Lekarstwa lekarstwa = new Lekarstwa(nazwa, cena, refundacja);
        System.out.println(lekarstwa.maksymalnarefudnacjja());
        System.out.println(lekarstwa.cena("lek2",true));
lekarstwa.wyswietl();




    }
}
