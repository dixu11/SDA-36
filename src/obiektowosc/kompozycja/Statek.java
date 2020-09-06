package obiektowosc.kompozycja;

public class Statek {

    private String nazwiskoKapitana;
    private Kontener ladunek;

    public Statek(String nazwiskoKapitana, Kontener ladunek) {
        this.nazwiskoKapitana = nazwiskoKapitana;
        this.ladunek = ladunek;
    }

    public Statek(String nazwiskoKapitana) {
        this.nazwiskoKapitana = nazwiskoKapitana;
        ladunek = new Kontener("");
    }

    public void otworzKontener(String haslo){
        if (haslo.equals("roman") && ladunek != null) {
            System.out.println("Hasło poprawne otwieram kontener");
            ladunek.setOtwarty(true);
        } else {
            System.out.println("Złe hasło. Nie zobaczysz ładunku");
        }
    }


    @Override
    public String toString() {
        return "Statek{" +
                "nazwiskoKapitana='" + nazwiskoKapitana + '\'' +
                ", ladunek=" + ladunek +
                '}';
    }
}
