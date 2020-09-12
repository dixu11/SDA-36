package obiektowosc.dziedziczenie;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        //Kot
        Zwierze animal = new Pies("Lucyna", 10);
        ZwierzeDomowe animal2 = new Kot();


        //Zwierze jakiesZwierze = new Zwierze("Zofia",20);

        Kon kon = new Kon("Radek", 7);
        Slon slon = new Slon("Elek", 40);
        Tygrys tygrys = new Tygrys();
        tygrys.poluj();
        System.out.println(animal);
        System.out.println(animal2);
        System.out.println(kon);


        //animal.polujNaMyszy(); // ogolny rodzaj referencji nie pozwala nam na wywołanie metody konkretnego zwierzecia
        //animal.biegaj();
        //polimorfizm: na wspolnej referencji wywolanie tej samej metody daje inny efekt ponieważ mamy do czynienia z innym obiektem
        animal.wydajDzwiek();
        //animal2.wydajDzwiek();

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
        //zwierzeta.add(animal2);
        zwierzeta.add(kon);
        zwierzeta.add(slon);
        zwierzeta.add(tygrys);
       // zwierzeta.add(jakiesZwierze);
        for (Zwierze zwierze : zwierzeta) {
            zwierze.biegaj();
            zwierze.wydajDzwiek();
        }

        Pies animalJakoPies = (Pies) animal; //downcasting
       // animal.aportuj(); // nie działa bo po Zwierze
       animalJakoPies.aportuj(); // działa bo po Pies
        Zwierze animal3 = kon; // upcasting


        //Abstrakcyjne klasy:
        //nie mozna tworzyc obiektow z nich
        //mogą mieć abstrakcyjne metody np:
        // public abstract void wydajDzwiek();
        //    metody abstrakcyjne muszą być nadpisane w klasach dziedziczacych
    }
}
