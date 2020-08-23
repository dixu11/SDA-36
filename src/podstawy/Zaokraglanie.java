package podstawy;

public class Zaokraglanie {
    public static void main(String[] args) {
        double liczba = 3.894;
        int liczbaInt = (int)liczba;
        System.out.println(liczbaInt);

      int zaokraglona =  (int) Math.round(liczba);
        System.out.println(zaokraglona);

       /* liczba *= 100;
        int liczbaJakoInt = (int) liczba;
        liczba /= 100;
        System.out.println(liczbaInt);*/

        System.out.printf("Moja liczba to: %.1f", liczba);

    }
}
