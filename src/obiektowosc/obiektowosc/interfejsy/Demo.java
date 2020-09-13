package obiektowosc.obiektowosc.interfejsy;

public class Demo {

    public static void main(String[] args) {
        //Aplikacja uruchamia się i zamyka, przy starcie zaczytuje pliki a przy zamknieciu zapisuje
        //odczyt i zapis jest w osobnym obiekcie
        Aplikacja aplikacja = new Aplikacja(new RepozytoriumHDD());
        aplikacja.start();
        aplikacja.stop();

    }

}
