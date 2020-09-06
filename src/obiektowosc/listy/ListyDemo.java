package obiektowosc.listy;

import obiektowosc.pociag.Osoba;

import java.util.ArrayList;

public class ListyDemo {

    public static void main(String[] args) {
        int[] liczby = {123, 45, 657, 345, 234, 234};

        int[] liczby2 = new int[3];
        System.out.println("Rozmiary tablic:");
        System.out.println(liczby2.length);
        liczby2[0] = 23;
        liczby2[1] = 3;
        liczby2[2] = 100;
        System.out.println(liczby2.length);

        System.out.println("Rozmiary list: ");
        ArrayList<Integer> liczbyLista = new ArrayList();
        ArrayList<Long> liczbyLongi = new ArrayList<>();
        ArrayList<Osoba> osoby = new ArrayList<>();
        osoby.add(new Osoba("Kowalski", "listonosz"));
        osoby.add(new Osoba("Kowalska", "sekretarka"));
        System.out.println(osoby);
        for (Osoba osoba : osoby) {
            System.out.println(osoba);
        }

        liczbyLongi.add(1231235L);
       // liczbyLongi.add("asdf");


        System.out.println(liczbyLista.size());
        liczbyLista.add(20);
        liczbyLista.add(30);
        liczbyLista.add(40);
        //liczbyLista.add("Marcin");
        System.out.println(liczbyLista);
        System.out.println(liczbyLista.size());
        liczbyLista.add(50);
        System.out.println(liczbyLista);
        System.out.println(liczbyLista.size());
        liczbyLista.remove(0);
        System.out.println(liczbyLista);
        System.out.println(liczbyLista.size());

        String tekst = "Daniel";


        System.out.println("CD");
        ArrayList<String> zwierzeta = new ArrayList<>();
        ArrayList<String> zwierzeta2 = new ArrayList<>();

        zwierzeta.add("słoń");
        zwierzeta.add("krowa");
        zwierzeta.add("koń");

        zwierzeta2.add("pies");
        zwierzeta2.add("kot");
        zwierzeta2.add("papuga");

        System.out.println(zwierzeta);
        System.out.println(zwierzeta2);
        zwierzeta.remove("krowa");
//        zwierzeta.remove(1);
//        zwierzeta.remove(0);
        System.out.println(zwierzeta);
        zwierzeta2.addAll(0, zwierzeta);
        System.out.println(zwierzeta2);
        zwierzeta2.set(1, "zebra");
        System.out.println(zwierzeta2);
//        zwierzeta2.add(0, "mysz");
//        System.out.println(zwierzeta2);

       /* zwierzeta2.clear();
        System.out.println(zwierzeta2);*/















    }

}
