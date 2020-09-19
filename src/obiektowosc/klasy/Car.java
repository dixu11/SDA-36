package obiektowosc.klasy;

public class Car {

    private int mileage;
    private String name;

    public Car(int mileage, String name) {
        this.mileage = mileage;
        this.name = name;
    }

    public void run() {
        System.out.println("Samochód jedzie");
    }


}
