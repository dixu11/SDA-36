package obiektowosc.telefon;

public class TelefonDemo {
    public static void main(String[] args) {
        Telefon telefon1 = new Telefon();
        Telefon telefon2 = new Telefon();
        telefon1.pamiec = 2;
        telefon1.system = "Android";

        telefon2.system = "IOs";
        telefon1.zaprezentuj();
        telefon2.zaprezentuj();

        telefon1.rzucTelefonem();
        telefon2.rzucTelefonem();

        telefon1.zaprezentuj();
        System.out.println("--");
        telefon2.zaprezentuj();

    }
}
