package es1;

public class Rettangolo {
    private int altezza;
    private int larghezza;

    public Rettangolo(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;

    }

    public static void DueRettangoli(int altezza1, int altezza2, int larghezza1, int larghezza2) {
        int perimetro1 = (altezza1 + larghezza1) * 2;
        int perimetro2 = (altezza2 + larghezza2) * 2;
        int area1 = altezza1 * larghezza1;
        int area2 = altezza2 * larghezza2;
        int sumper = perimetro1 + perimetro2;
        int sumarea = area1 + area2;
        System.out.println("Il perimetro del rettangolo 1 è " + perimetro1 + "il perimetro del rettangolo2 è" + perimetro2 + "l'area del rettangolo 1 è " + area1 + "l'area del rettangolo 2 è" + area2 + "la somma dei perimetri è " + sumper + "la somma delle aree è" + sumarea);
    }

    public void AreaEPerimetroRettangolo() {
        int perimetro = (this.altezza + this.larghezza) * 2;
        int area = this.altezza * this.larghezza;
        System.out.println("Il perimetro del rettangolo è " + perimetro + "L'area del rettangolo è " + area);

    }

    public int getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }
}

