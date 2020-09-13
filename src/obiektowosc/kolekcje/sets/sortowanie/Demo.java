package obiektowosc.kolekcje.sets.sortowanie;

import obiektowosc.kolekcje.sets.Person;

import java.time.LocalDate;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person("Radek", LocalDate.now().minusYears(20));
        Person person2 = new Person("Ewa",LocalDate.now().minusYears(25));
        Person person3 = new Person("Jan",LocalDate.now().minusYears(30));

        List<Person> people = new ArrayList<>();
        people.add(person);
        people.add(person2);
        people.add(person3);

        PersonComparator personComparator = new PersonComparator(); //niestandardowe sortowanie
        people.sort(personComparator);
        System.out.println(people);


        Set<Person> peopleSet = new HashSet<>(); //nieuporzadkowane
        Set<Person> peopleSet2 = new LinkedHashSet<>(); //kolejność wg ustawienia
        Set<Person> peopleSet3 = new TreeSet<>(); //trzyma dane posortowane   -> wykorzystuje compareTo()
        peopleSet3.add(person);
        peopleSet3.add(person2);
        peopleSet3.add(person3);
        System.out.println(peopleSet3);


       /* peopleSet3.add(10);
        peopleSet3.add(1);
        peopleSet3.add(20);
        System.out.println(peopleSet3);*/


    }
}
