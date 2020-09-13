package obiektowosc.obiektowosc.interfejsy;

//co przy starcie co przy zamknięciu
public class Aplikacja {

  private Repozytorium repozytorium;

    public Aplikacja(Repozytorium repozytorium) {
        this.repozytorium = repozytorium;
    }

    public void start() {

        System.out.println("Startujemy");
        repozytorium.odczytajPliki();
    }

    public void stop() {
        System.out.println("Zamykamy");
        repozytorium.zapiszPliki();
    }


}
