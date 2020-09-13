package obiektowosc.kolekcje.sets.zad19restaurant;

import java.util.HashSet;
import java.util.Set;

public class Restaurant {

    private Set<Dish> dishes = new HashSet<>();

    public void addDish(Dish dish) {
        dishes.add(dish);
    }
    public void removeDish(Dish dish) {
        dishes.remove(dish);
    }

    public Dish findDishByName(String dishName) {
        for (Dish dish : dishes) {
            if (dish.getName().equals(dishName)) {
                return dish;
            }
        }
        throw new RestaurantException("nie znaleziono potrawy o poszukiwanej nazwie: " + dishName);
    }

    public Set<Dish> findDishesByType(DishType type) {
        Set<Dish> found = new HashSet<>();
        for (Dish dish : dishes) {
            if (dish.getType() == type) {
                found.add(dish);
            }
        }
        return found;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "dishes=" + dishes +
                '}';
    }



    /*

    stwórz metodę pozwalającą wyszukać dania po typie potrawy, jeśli nie ma żadnej potrawy w danym typie, metoda ma zwracać
*  pustą listę.*/


}
