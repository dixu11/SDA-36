package obiektowosc.enumy;

public enum Kierunek {
    POLNOC(0), POLUDNIE(180), WSCHOD(90), ZACHOD(270), NIEZNANY(-1);

    private int stopnie;

    Kierunek(int stopnie) {
        this.stopnie = stopnie;
    }

    public int getStopnie() {
        return stopnie;
    }

    public static Kierunek znajdzKierunekPoStopniach(int stopnie){
        for (Kierunek kierunek : values()) {
            if (kierunek.stopnie == stopnie) {
                return kierunek;
            }
        }
        return NIEZNANY;
    }
}
