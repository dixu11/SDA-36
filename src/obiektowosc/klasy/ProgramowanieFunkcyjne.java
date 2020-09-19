package obiektowosc.klasy;

public class ProgramowanieFunkcyjne {

    public static void main(String[] args) {

       /* function funkcja = void metoda(int liczba1, int liczba2){
            return liczba1 + liczba2;
        }*/

        ModyfikatorTekstu zwiekszajacyLitery = new ModyfikatorTekstu(){
            @Override
            public String modyfikujTekst(String tekst) {
                return tekst.toUpperCase();
            }
        };

        String zmodyfikowany = zwiekszajacyLitery.modyfikujTekst("abcd");
        System.out.println(zmodyfikowany);

        ModyfikatorTekstu ucinajacyOstatniaLitere = new ModyfikatorTekstu() {
            @Override
            public String modyfikujTekst(String tekst) {
                return tekst.substring(0, tekst.length() - 1);
            }
        };

        System.out.println(ucinajacyOstatniaLitere.modyfikujTekst("abcdefg"));



    }


}
