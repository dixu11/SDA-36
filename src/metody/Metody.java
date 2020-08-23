package metody;

public class Metody {

    public static void main(String[] args) {
        przygotowanieSkladnikow();
        gotowanie();
        podanie();
    }

    static void przygotowanieSkladnikow() {
        System.out.println("Potrzebne składniki:");
        System.out.println("Jajka");
        System.out.println("Chleb");
        System.out.println("Masło");
    }

    static void gotowanie() {
        System.out.println("Przygotowanie:");
        System.out.println("Rozbić jajka");
        System.out.println("smażenie");
        System.out.println("Smarowanie chleba...");
    }

    static void podanie() {
        System.out.println("Podanie");
        System.out.println("Wiadomo...");
    }


    public static void przepis() {
        przygotowanieSkladnikow();
        gotowanie();
        podanie();
    }

    //pobierz wiek / czyPelnoletni
    //policz do 10
    //przeliczNaMinuty


}
