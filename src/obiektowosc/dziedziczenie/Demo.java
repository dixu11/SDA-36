package obiektowosc.dziedziczenie;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        //Kot
        Kot kot = new Kot("Lucyna",10);
        //Pies
        Pies pies = new Pies();
        Kon kon = new Kon("Radek", 7);
        System.out.println(kot);
        System.out.println(pies);
        System.out.println(kon);

        kot.polujNaMyszy();
        kot.biegaj();
        pies.aportuj();

        //Zwierze
        System.out.println("Wszystkie zwierzeta:");
        List<Zwierze> zwierzeta = new ArrayList<>();
        zwierzeta.add(kot);
        zwierzeta.add(pies);
        zwierzeta.add(kon);
        for (Zwierze zwierze : zwierzeta) {
            zwierze.biegaj();
            zwierze.wydajDzwiek();
        }

    }
}
