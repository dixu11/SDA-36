package metody;

import java.util.Scanner;

public class Asystent {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        wyswietlOpcje();
        int opcja = pobierzWybor();
        uruchomOpcje(opcja);
    }

    static void wyswietlOpcje() {
        System.out.println("Jaki program chcesz uruchomić?");
        System.out.println("1. Przepis jajecznica");
        System.out.println("2. Podaj wiek");
        System.out.println("3. Lotto");
    }

    static int pobierzWybor() {
        Scanner scanner = new Scanner(System.in);
        int opcja = scanner.nextInt();
        return opcja;
    }

    static void uruchomOpcje(int opcja) {
        switch (opcja) {
            case 1:
                Metody.przepis();
                break;
            case 2:
                SprawdzWiek.sprawdzWiek();
                break;
            case 3:
                Loteria.zagrajWLotto();
                break;
        }
    }


}
