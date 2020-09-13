package obiektowosc.kolekcje.queues;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {
//        Queue<String> names = new ArrayBlockingQueue<>(3); // blonkowanie max rozmiaru
//        Queue<String> names = new PriorityQueue<>(); // kolejka priorytetowa -> ustawia ich wg comparable -> naturalny porządek
        Queue<String> names = new LinkedList<>();

        names.add("Marcin");
        names.add("Ola");
        names.add("Kasia");
        names.add("Maria");
        names.add("Wojtek"); //dodaje na koniec

        System.out.println(names.remove()); //usuwa z początku i dostarcza referencje
        System.out.println(names.remove());
        System.out.println(names.element()); //dostarcza referencje ale nie usuwa
        System.out.println(names.remove());
        System.out.println(names.remove());
        System.out.println(names.remove());
//        System.out.println(names.element());


        List<String> names2 = new LinkedList<>();
        /*System.out.println(names.get());
        System.out.println(names2.get(1));
        System.out.println(names.offer("Marcin"));
        System.out.println(names2.offer("Marcin"));*/


        Stack<String> booksAsStack = new Stack<>(); //stara klasa - teraz używać interfejsu Deque
        booksAsStack.push("Czysty Kod");
        booksAsStack.push("Java 9");
        System.out.println(booksAsStack.pop());

        Deque<String> booksAsStack2 = new LinkedList<>();
        booksAsStack2.addLast("Czysty Kod");
        booksAsStack2.addLast("Java 9");
        System.out.println(booksAsStack2.removeFirst());

    }
}
