package obiektowosc.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamMap {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Wojtek", 20));
        people.add(new Person("Ania", 30));
        people.add(new Person("Radek", 25));

        people.stream()
                .map(osoba -> osoba.getName())
                .forEach(imie -> System.out.println(imie));

        long lacznyWiek = people.stream()
                .mapToInt(osoba -> osoba.getAge()) //zwraca stream w wersji dla intów z dodatkowymi metodami do operacji na liczbach
                .sum();
        System.out.println("Razem maja lat: " + lacznyWiek);


        //nie zdazylismy:
        //omówić flatMap
        //czym jest Optional
        //korzystanie z map na streamach
    }


}


class Person{

    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
