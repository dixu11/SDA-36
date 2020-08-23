package podstawy;

import java.util.Arrays;
import java.util.Scanner;

public class Zad10 {

  /*  Zad 10
    Napisz program, który zapyta użytkownika ile notatek potrzebuje i stworzy tablicę tekstów o wpisanej wielkości.
    Następnie stwórz pętlę,
    która pozwoli wprowadzać notatki tyle razy ile jest miejsc w tablicy i wyświetl wszystkie pozycje tablicy.*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile notatek potrzebujesz?");
        int amount = scanner.nextInt();
        scanner.nextLine();
        if (amount <= 0) {
            System.out.println("Nieprawidłowa ilość notatek");
            return;
        }
        String[] notes = new String[amount];

        for (int i = 0; i < notes.length; i++) {
            System.out.println("Podaj notatkę nr: " + (i+1));
            String note = scanner.nextLine();
            notes[i] = note;
        }

        System.out.println("Twoje notatki:");
        for (String note : notes) {
            System.out.println(note);
        }
       // System.out.println(Arrays.toString(notes));
    }
}
