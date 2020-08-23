package metody;

import java.util.Scanner;

public class SprawdzWiek {

    static void sprawdzWiek() {
        System.out.println("Ile masz lat?");
        Scanner scanner = new Scanner(System.in);
        int wiek = scanner.nextInt();
        System.out.println("Masz " + wiek);
    }



}
