package obiektowosc.klasy;

public class KlasyAnonimowe {

    public static void main(String[] args) {
        Car car = new Car(1000, "BMW");
        Car car2 = new Car(2000, "Fiat");
        car.run();
        car2.run();
        final InteegerHolder liczba = new InteegerHolder(20);
        liczba.liczba = 100;


        Car truck = new Car(1500, "Volvo") {  // mozna przekazywać dane tylko ze stałych

            @Override
            public void run() {
                System.out.println(liczba);
                System.out.println("Cieżarówka przewozi towary");
            }

        };
        truck.run();

        System.out.println(car.getClass().getName());
        System.out.println(car2.getClass().getName());
        System.out.println(truck.getClass().getName());


    }


}

class InteegerHolder {
    int liczba;

    public InteegerHolder(int liczba) {
        this.liczba = liczba;
    }
}
