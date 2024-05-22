package es1;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(15, 20);


        Rettangolo rettangolo2 = new Rettangolo(20, 20);


        int altret1 = rettangolo1.getAltezza();
        int largret1 = rettangolo1.getLarghezza();

        int altret2 = rettangolo2.getAltezza();
        int largret2 = rettangolo2.getLarghezza();

        rettangolo1.AreaEPerimetroRettangolo();

        Rettangolo.DueRettangoli(altret1, altret2, largret1, largret2);

    }
}
