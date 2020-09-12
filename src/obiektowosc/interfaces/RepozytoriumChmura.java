package obiektowosc.interfaces;

public class RepozytoriumChmura implements Repozytorium {

    public void odczytajPliki() {
        System.out.println("Odczyt z chmury");
    }

    public void zapiszPliki() {
        System.out.println("Zapisujemy na chmurę");
    }

}
