package es2;

public class Chiamata {
    private int numero;
    private int durata;

    public Chiamata(int numero, int durata) {
        this.numero = numero;
        this.durata = durata;
    }

    @Override
    public String toString() {
        return "Chiamata{" +
                "numero=" + numero +
                ", durata=" + durata +
                '}';
    }
}