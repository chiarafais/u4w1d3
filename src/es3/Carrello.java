package es3;


import java.util.Arrays;

public class Carrello {
    private Cliente cliente;
    private Articolo[] articoli;
    private int totale;


    public Carrello(Cliente user) {

        this.cliente = user;
        this.articoli = new Articolo[5];

    }

    ;

    public static int totaleArticoli(int[] prezzi) {
        int somma = 0;
        for (int i = 0; i < prezzi.length; i++) {
            somma += prezzi[i];
        }
        return somma;
    }

    public void setArticoli(Articolo[] articoli) {
        this.articoli = articoli;
    }


    @Override
    public String toString() {
        return "Carrello{" +
                "cliente=" + cliente +
                ", articoli=" + Arrays.toString(articoli) +
                ", totale=" + totale +
                '}';
    }
}