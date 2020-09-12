package obiektowosc.enumy;

public class SatelitaDemo {

    public static void main(String[] args) {
        Satelita satelita = new Satelita(Kierunek.WSCHOD);
        Satelita satelita2 = new Satelita(Kierunek.ZACHOD);

        Kierunek kierunek=  satelita.getKierunek();
        Kierunek kierunek2=  satelita2.getKierunek();
        System.out.println("Szukam satelity skierowanego na wschód");

        if (kierunek == Kierunek.WSCHOD) {
            System.out.println("s1 to ten którego szukam");
        }
        //KierunekSwiata.wschod = 1000;
        if (kierunek2 == Kierunek.WSCHOD) {
            System.out.println("s2 to ten którego szukam");
        }

        switch (kierunek){
            case POLNOC:
                System.out.println("case dla polnocy");
                break;
            case POLUDNIE:
                System.out.println("case dla poludnia");
                break;
            case WSCHOD:
                break;
            case ZACHOD:
                break;
        }

        for (Kierunek value : Kierunek.values()) {
            System.out.println(value);
        }


        System.out.println("-----");
        System.out.println(kierunek.getStopnie());
        System.out.println(Kierunek.znajdzKierunekPoStopniach(90));
        System.out.println(Kierunek.znajdzKierunekPoStopniach(100));

    }


}
