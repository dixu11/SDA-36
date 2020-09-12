package obiektowosc.dziedziczenie;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        //Kot
        Zwierze animal = new Pies("Lucyna", 10);
        Zwierze animal2 = new Kot();
        Kon kon = new Kon("Radek", 7);
        System.out.println(animal);
        System.out.println(animal2);
        System.out.println(kon);


        //animal.polujNaMyszy();
        //animal.biegaj();
        animal.wydajDzwiek();
        animal2.wydajDzwiek();

        if (animal instanceof Pies) {
            System.out.println("Animal to pies");
        } else {
            System.out.println("Animal to inne zwierze");
        }


        //gorszy kod bez zastosowania polimorfizmu
     /*   if (animal == pies) {
            animal.szczekaj();
        } else if (animal == kot) {
            animal.mialcz();
        }*/


        // animal2.aportuj();

        //Zwierze
        System.out.println("Wszystkie zwierzeta:");
        List<Zwierze> zwierzeta = new ArrayList<>();
        zwierzeta.add(animal);
        zwierzeta.add(animal2);
        zwierzeta.add(kon);
        for (Zwierze zwierze : zwierzeta) {
            zwierze.biegaj();
            zwierze.wydajDzwiek();
        }

        Pies animalJakoPies = (Pies) animal; //downcasting
       // animal.aportuj(); // nie działa bo po Zwierze
       animalJakoPies.aportuj(); // działa bo po Pies
        Zwierze animal3 = kon; // upcasting


    }
}
