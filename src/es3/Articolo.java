
package es3;

import java.util.Random;

public class Articolo {
    private int id;
    private String description;
    private int prezzo;
    private int numeroPezzi;

    public Articolo(String description, int prezzo, int numeroPezzi) {
        Random rndm = new Random();
        this.id = rndm.nextInt(1, 10000);
        this.description = description;
        this.prezzo = prezzo;
        this.numeroPezzi = numeroPezzi;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public String getDescription() {
        return description;
    }

    public int getNumeroPezzi() {
        return numeroPezzi;
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", prezzo=" + prezzo +
                ", numeroPezzi=" + numeroPezzi +
                '}';
    }
}