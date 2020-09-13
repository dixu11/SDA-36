package obiektowosc.kolekcje.sets;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class SetsDemo {
    public static void main(String[] args) {
        //set - zachowuje wyłącznie unikatowe wartości
        //    - nie pamięta kolejności elementów
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(44);
        numbers.add(10);
//        numbers.get(0);
        System.out.println(numbers);


        Person person = new Person("Radek", LocalDate.now().minusYears(20));
        Person person2 = new Person("Ewa",LocalDate.now().minusYears(25));
        Person person3 = new Person("Jan",LocalDate.now().minusYears(30));
        Person person4 = new Person("Jan",LocalDate.now().minusYears(30));

        Set<Person> people = new HashSet<>();
        people.add(person);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        System.out.println(people);

        System.out.println(person.equals(person2));  // false
        System.out.println(person3.equals(person4)); // true


    }
}
