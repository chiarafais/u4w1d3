
package es2;

public class Main {
    public static void main(String[] args) {
        Chiamata chiamata1 = new Chiamata(329444555, 20);
        Chiamata chiamata2 = new Chiamata(33345555, 5);
        Chiamata chiamata3 = new Chiamata(33345555, 10);
        Chiamata chiamata4 = new Chiamata(33345755, 2);
        Chiamata chiamata5 = new Chiamata(333457556, 1);
        Sim sim1 = new Sim(329555444);
        Chiamata[] arrayChiamata = {chiamata1, chiamata2, chiamata3, chiamata4, chiamata5};
        sim1.setChiamate(arrayChiamata);
        System.out.println(sim1);
    }
}