package metody;

import java.util.Scanner;

public class MetodyKomunikacja {
    public static void main(String[] args) {
        double cena = pobierzCeneProduktu();
        czyMoznaNaRaty(cena);
    }

    //pobieramy liczbę od 0 do 100_000
    static double pobierzCeneProduktu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj cene produktu");
        double podaneDane = scanner.nextDouble();
        if (podaneDane < 1 || podaneDane > 100_000) {
            System.out.println("Niepoprawne dane");
            System.out.println("Cena musi być minimum 1zł");
            System.out.println("Cena to maksymalnie 100 000zł");
        }
        return podaneDane;
    }
    //aby metoda produkowała dane określonego typu trzeba zamiast void napisać ten typ
    //taka metoda musi mieć na końcu instrukcję retrun x; gdzie x to wartość zgadzająca się z ustalonym typem
    //z takiej metody można pobierać dane w miejscu wywołania np: int pobrna = metoda();


    //otrzymuje liczbę do 100_000, jeśli ta liczba jest powyżej 1000 to raty dostępne
    static void czyMoznaNaRaty(double otrzymanaCena) {
        if (otrzymanaCena >= 1000) {
            System.out.println("Raty dostępne");
        } else {
            System.out.println("Za mała cena aby dostać na raty");
        }
    }

    //aby metoda OTRZYMYWALA dane - należy w nawiasie zadeklarować dowolną ilość zmiennych np. void metoda(int liczba, String tekst)
    //przy wywoływaniu tej metody TRZEBA dostarczyć pasujące typami wartości w odpowiedniej kolejności aby metoda miała co wstawić do tych zmiennych
    //np: metoda(10,"hello");
    // wartości te w trakcie wywołania zostaną zapakowane do zmiennch w metodzie i dostępne w tej metodzie

}
