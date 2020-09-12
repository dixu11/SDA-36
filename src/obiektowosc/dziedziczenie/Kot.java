package obiektowosc.dziedziczenie;

public class Kot extends Zwierze{

    public Kot(){
       super("mruczek",2);
    }

    public Kot(String imie,int wiek){
        super(imie, wiek);
    }


    public void wydajDzwiek(){
        System.out.println("Miał miał");
    }

    public void polujNaMyszy() {
        System.out.println("Kot gania myszy");
    }

}
