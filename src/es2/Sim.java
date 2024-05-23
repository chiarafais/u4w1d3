package es2;

import java.util.Arrays;

public class Sim {

    private int numero;
    private int credito;
    private Chiamata[] chiamate;

    public Sim(int numero) {
        this.numero = numero;
        this.credito = 0;
        this.chiamate = new Chiamata[5];
    }

    public void setChiamate(Chiamata[] chiamate) {
        this.chiamate = chiamate;
    }

    @Override
    public String toString() {
        return "Sim{" +
                "numero=" + numero +
                ", credito=" + credito +
                ", chiamate=" + Arrays.toString(chiamate) +
                '}';
    }


}
