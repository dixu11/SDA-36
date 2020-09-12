package obiektowosc.dziedziczenie;

public class Kot extends Zwierze{

    private String imie;
    private int age;


    public Kot(String imie, int age) {
        this.imie = imie;
        this.age = age;
    }

    public Kot() {
        imie = "Mruczek";
        age = 2;
    }

    public void wydajDzwiek(){
        super.wydajDzwiek();
        System.out.println("Miał miał");
    }

    public void polujNaMyszy() {
        System.out.println("Kot gania myszy");
    }

}
