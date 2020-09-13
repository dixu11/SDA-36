package obiektowosc.kolekcje.sets.zad19restaurant;

import java.util.Objects;

public class Dish {

    private String name;
    private double price;
    private DishType type;
    private int energy =100;


    public Dish(String name, double price, DishType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public Dish(String name, double price, DishType type, int energy) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.energy = energy;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return Double.compare(dish.price, price) == 0 &&
                energy == dish.energy &&
                Objects.equals(name, dish.name) &&
                type == dish.type;
    }

    public String getName() {
        return name;
    }

    public DishType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, type, energy);
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", energy=" + energy +
                '}';
    }
}
