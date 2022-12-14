package BlattG;

public class Konto {
    private String kontoNr;
    private double kontostand;

    Konto(String kontoNr, double kontostand){
        this.kontoNr = kontoNr;
        this.kontostand = kontostand;
    }

    String getKontoNr(){
        return kontoNr;
    }


    double getKontostand(){
        return kontostand;
    }


    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(getKontoNr());
        return sb.toString();
    }

    void einzahlen(double betrag){
        if (betrag > 0){
        kontostand = kontostand + betrag;
            System.out.println("Einzahlung: " + betrag + " €");
            System.out.println("Kontostand: " + kontostand + " €");
        }
    }

    void abheben(double betrag){
        if (betrag < kontostand){
            kontostand = kontostand - betrag;
            System.out.println("Ausgabe: " + betrag + " €");
            System.out.println("Kontostand: " + kontostand + " €");
        }
        else {
            System.out.println("Kontostand ist zu niedrig");
        }
    }
}
