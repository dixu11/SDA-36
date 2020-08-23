package metody;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Loteria {

    static int pula = 6;






    public static void main(String[] args) {


        //wprowadzanie liczb
        int pula = 6;
        int[] wprowadzone = pobierzLiczby(pula);

        //wprowadzenie 6 liczb (1-24)


        //losowanie liczb
        int[] wylosowane = new int[pula];
        Random random = new Random();

        for (int i = 0; i < pula; i++) {
            int wylosowana = random.nextInt(24) + 1; //0-23 -> +1
            wylosowane[i] = wylosowana;
        }

        System.out.println("Wylosowane liczby:");
        System.out.println(Arrays.toString(wylosowane));

        // porównanie
        int trafione = 0;
        for (int wprowadzona : wprowadzone) {
            for (int wylosowana : wylosowane) {
                if (wprowadzona == wylosowana) {
                    trafione++;
                    System.out.println("Ta liczba trafiona: " + wylosowana);
                }
            }
        }

        // wyniki
        System.out.println("Masz " + trafione + " liczb");
        switch (trafione) {
            case 3:
                System.out.println("Wygrana 16 zł");
            case 4:
                System.out.println("Wygrana 200 zł");
            case 5:
                System.out.println("Wygrana 4 000 zł");
            case 6:
                System.out.println("Wygrana 1 500 000 zł");
            default:
                System.out.println("Wygrana 0 zł");
        }

    }

    //metoda potrzebuje -> info o puli
    //metoda produkuje -> tablice liczb
    static int[] pobierzLiczby(int pula) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witamy w loterii!");
        System.out.println("Wprowadź " + pula + " liczb");
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
        return wprowadzone;
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
