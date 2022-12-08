package BlattG;

public class KontoMain {
    public static void main (String [] args){
        Konto k1 = new Konto("05122022", 1000);


        k1.abheben(50);
        k1.einzahlen(943);

        System.out.println(k1.getKontostand());
        System.out.println(k1.getKontoNr());
        System.out.println(k1.toString());

    }
}
