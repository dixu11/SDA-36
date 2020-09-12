package obiektowosc.dziedziczenie;

public class RobotPiesek  extends Robot implements ZwierzeDomowe, UrzadzenieDomowe{
    @Override
    public void wymienBaterie() {
        System.out.println("Wymienia baterie paliszki");
    }

    @Override
    public void poglaszcz() {
        System.out.println("piesek robot podskakuje");
    }

    @Override
    public int podajCene() {
        return 100;
    }
}
