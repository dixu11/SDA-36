package obiektowosc.kolekcje.lists;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Lists {

    //ArrayList:
    // [Marcin][Zofia][Ania][null][null][null]

    //LinkedList:
    //[Ola]>[Adam]>[Roman]>[Roman]>[Roman]>[Roman]>[Roman]>null


    public static void main(String[] args) {
        LocalTime start = LocalTime.now();

        List<String> names = new ArrayList<>();
        names.add("Marcin");
        names.add("Zofia");
        names.add("Ania");

        printNamesStatistics(names);

        List<String> names2 = new LinkedList<>();
        names2.add("Ola");
        names2.add("Adam");

        printNamesStatistics(names2);


       /* Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        LocalTime end = LocalTime.now();
        System.out.println(end.getSecond() - start.getSecond());*/

    }


    public static void printNamesStatistics(List<String> namesList){
        System.out.println("Mamy " + namesList.size() + " imion");
        System.out.println("Ostatnie to: " + namesList.get(namesList.size()-1));
    }


}
