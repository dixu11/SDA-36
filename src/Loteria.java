import java.util.Arrays;
import java.util.Scanner;

public class Loteria {
    public static void main(String[] args) {
        //wprowadzenie 6 liczb (1-24)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witamy w loterii!");
        System.out.println("Wprowadź 6 liczb");
        int[] liczby = new int[6];

        for (int i = 0; i < 6; i++) {
            boolean niepoprawna;
            do {
                System.out.printf("Wprowadź %d liczbę:\n",i+1);
                liczby[i] = scanner.nextInt();
                niepoprawna = liczby[i] < 1 || liczby[i] > 24;
                if (niepoprawna) {
                    System.out.println("Liczba ze złego zakresu, wprowadź ponownie!");
                }
            }while (niepoprawna);

        }

        System.out.println(Arrays.toString(liczby));

    }
}
