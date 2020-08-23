package podstawy;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Loteria {
    public static void main(String[] args) {
        //wprowadzenie 6 liczb (1-24)
        int pula = 6;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witamy w loterii!");
        System.out.println("Wprowadź " + pula+ " liczb");
        int[] wprowadzone = new int[pula];
        //sprytniejsze rozwiązanie
        for (int i = 0; i < pula; i++) {
            System.out.printf("Wprowadź %d liczbę:\n", i + 1);
            wprowadzone[i] = scanner.nextInt();
            if (wprowadzone[i] < 1 || wprowadzone[i] > 24) {
                System.out.println("Liczba ze złego zakresu, wprowadź ponownie!");
                i--;
            }
        }

        System.out.println("Wprowadzone liczby:");
        System.out.println(Arrays.toString(wprowadzone));
        int[] wylosowane = new int[pula];
        Random random = new Random();

        for (int i = 0; i < pula; i++) {
            int wylosowana = random.nextInt(24) +1; //0-23 -> +1
            wylosowane[i] = wylosowana;
        }

        System.out.println("Wylosowane liczby:");
        System.out.println(Arrays.toString(wylosowane));

        char[] java = {'j', 'a', 'v', 'a'};
        String text = new String(java);
        String text2 = String.copyValueOf(java);

    }
}







//stara wersja etapu 1
  /*  for (int i = 0; i < pula; i++) {
            boolean niepoprawna;
            do {
                System.out.printf("Wprowadź %d liczbę:\n",i+1);
                wprowadzone[i] = scanner.nextInt();
                niepoprawna = wprowadzone[i] < 1 || wprowadzone[i] > 24;
                if (niepoprawna) {
                    System.out.println("Liczba ze złego zakresu, wprowadź ponownie!");
                }
            }while (niepoprawna);

        }*/
