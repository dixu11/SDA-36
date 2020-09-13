package obiektowosc.obiektowosc.wyjatki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WyjatkiDemo2 {
    public static void main(String[] args) {



        File file = new File("cytat.txt");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("W pliku jest:");
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (FileNotFoundException exception){
            System.out.println("Brak pliku");
        }
        System.out.println("Koniec");
    }
}
