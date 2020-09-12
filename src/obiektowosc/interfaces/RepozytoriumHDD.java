package obiektowosc.interfaces;

public class RepozytoriumHDD implements Repozytorium{

    public void odczytajPliki() {
        System.out.println("Odczyt z dysku");
    }

    public void zapiszPliki() {
        System.out.println("Zapisujemy na dysk");
    }


}
