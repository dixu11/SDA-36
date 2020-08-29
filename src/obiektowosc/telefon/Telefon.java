package obiektowosc.telefon;

import java.util.Random;

public class Telefon {

    String system;
    double pamiec = 1;
    boolean zbityEkran;

    public void zaprezentuj() {
        System.out.println("System to: " + system);
        System.out.println("Pamiec to: " + pamiec);
        if (zbityEkran) {
            System.out.println("Zbity ekran!");
        }
    }

    public void rzucTelefonem(){
        Random random = new Random();
        boolean zbilismy = random.nextBoolean();
        if (zbilismy) {
            zbityEkran = true;
        }
    }

    //metoda zwieksz pamiec => 2x wiecej pamieci
    //dodatkowa cecha =>  zajetaPamiec
    //nowa metoda uruchomAplikacje => zwiekszac zajeta pamiec o 0,1-0,2 ->
    // ale nie moze przekroczyc dostepnej pamieci
    //cecha ileOtwartych


}
