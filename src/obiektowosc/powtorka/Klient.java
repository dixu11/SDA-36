package obiektowosc.powtorka;

import java.time.LocalDate;
import java.util.Random;

public class Klient {

    private int id;

    private static int poprzednieId = 0;
    private String login;
    private String haslo;
    private LocalDate dataUrodzenia;
    private int punkty = 0;
    //  private String ranga = "junior";

    public Klient(String login, String haslo) {
        this.login = login;
        this.haslo = haslo;
        losujPunkty();
        nadajId();

    }

    public Klient(String login, String haslo, LocalDate dataUrodzenia) {
        this.login = login;
        this.haslo = haslo;
        this.dataUrodzenia = dataUrodzenia;
        losujPunkty();
        nadajId();
    }

    private void losujPunkty() {
        Random random = new Random();
        int wylosowana = random.nextInt(1001) + 90;
        punkty = wylosowana;
    }

    private void nadajId() {
        id = poprzednieId;
        poprzednieId++;
    }

    public void dodajPunkty(int ile) {
        punkty += ile;

    }

    public String getRanga() {
        if (punkty > 1000) {
            return "senior";
        } else if (punkty > 500) {
            return "regular";
        } else {
            return "junior";
        }
    }


    public int getPunkty() {
        return punkty;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", haslo='" + haslo + '\'' +
                ", dataUrodzenia=" + dataUrodzenia +
                ", punkty=" + punkty +
                ", ranga='" + getRanga() + '\'' +
                '}';
    }
}
