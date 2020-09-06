package obiektowosc.pociag;

public class Osoba {
    private String nazwisko;
    private String funkcja;

    public Osoba(String nazwisko, String funkcja) {
        this.nazwisko = nazwisko;
        this.funkcja = funkcja;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "nazwisko='" + nazwisko + '\'' +
                ", funkcja='" + funkcja + '\'' +
                '}';
    }
}

//private, default, protected, public
//klasa  , pakiet , podklasy , dla wszystkich
