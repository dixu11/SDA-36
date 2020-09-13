package obiektowosc.kolekcje.sets.sortowanie;

import obiektowosc.kolekcje.sets.Person;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        //+ -> przed
        //- -> za
        //0 -> takie same

        if (p1.getBirthdate().isAfter(p2.getBirthdate())) {
            return 1;
        } else if (p1.getBirthdate().isBefore(p2.getBirthdate())) {
            return -1;
        } else {
            return 0;
        }
    }
}
