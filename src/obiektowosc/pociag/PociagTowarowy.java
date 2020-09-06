package obiektowosc.pociag;

public class PociagTowarowy {
    private Wagon[] wagony;
    private Osoba maszynista = new Osoba("Kowalski", "maszynista");

    public PociagTowarowy(Wagon[] wagony) {
        this.wagony = wagony;
    }


    public boolean czyPrzeladowany(){
        for (Wagon wagon : wagony) {
            if (wagon.czyPrzeladowany()) {
                return true;
            }
        }
        return false;
    }


}
