package es3;

import java.util.Random;

public class Cliente {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String dataIscrizione;

    public Cliente(String name, String surname, String email, String dataIscrizione) {
        Random rndm = new Random();
        this.id = rndm.nextInt(1, 10000);
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", dataIscrizione=" + dataIscrizione +
                '}';
    }
}