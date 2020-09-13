package obiektowosc.obiektowosc.dziedziczenie;

public class Kon extends Zwierze {


    public Kon(String imie, int wiek) {
        super(imie, wiek);
    }

    @Override
    public void wydajDzwiek() {
        //super.wydajDzwiek();
        System.out.println("ihaha!");
    }
}
