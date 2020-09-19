package obiektowosc.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {

        List<String> imiona = List.of("Daniel", "Gosia", "Magda", "Magda", "Wojtek", "Ola");
        imiona.forEach(imie -> System.out.println(imie));



        List<String> wynikMetody1 = znajdzImionaZenskie(imiona);
        List<String> wynikMetody2 = znajdzImionaZenskie2(imiona);

        System.out.println(wynikMetody1);
        System.out.println(wynikMetody2);


        imiona.stream()
                .distinct()
                .sorted( (imie1,imie2) -> imie1.length() - imie2.length()  )
                .forEach(imie -> System.out.println(imie));

      long ileMeskich=  imiona.stream()
                .filter(imie -> !imie.endsWith("a"))
                .count();

        System.out.println("Męskich: " + ileMeskich);



    }


    public static List<String> znajdzImionaZenskie(List<String> imiona) {
        List<String> zenskieImiona = new ArrayList<>();
        for (String imie : imiona) {
            if (imie.endsWith("a")) {
                zenskieImiona.add(imie);
            }
        }
        return zenskieImiona;
    }

    public static List<String> znajdzImionaZenskie2(List<String> imiona) {
        return imiona.stream()
                .filter(imie -> imie.endsWith("a"))
                .collect(Collectors.toList());              // stream otrzymuje kopie danych z listy
    }


}
