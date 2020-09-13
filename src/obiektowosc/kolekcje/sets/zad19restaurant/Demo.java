package obiektowosc.kolekcje.sets.zad19restaurant;

public class Demo {

    public static void main(String[] args) {
        Dish dish = new Dish("calzone", 30, DishType.DINNER);
        Dish dish2 = new Dish("kotlet schabowy",18, DishType.DINNER);
        Dish dish3 = new Dish("jajecznica", 15, DishType.BREAKFAST);

        Restaurant restaurant = new Restaurant();
        restaurant.addDish(dish);
        restaurant.addDish(dish2);
        restaurant.addDish(dish3);
        System.out.println(restaurant);
      //  restaurant.removeDish(new Dish("kotlet schabowy",18, DishType.DINNER));
        System.out.println(restaurant);

        try {
            System.out.println(restaurant.findDishByName("calzone"));
            System.out.println(restaurant.findDishByName("hummus"));
        } catch (RestaurantException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(restaurant.findDishesByType(DishType.DINNER));
        System.out.println(restaurant.findDishesByType(DishType.APPETIZER));


    }

    /*
    * Stwórz obiekt Dish (potrawa), potrawa ma posiadać nazwę, cenę, wartość kaloryczną oraz enum - typ (np. BREAKFAST, DINNER, APPETIZER).

    Uwaga, żadna z poniższych metod nie powinna drukować nic w konsoli. Wykorzystaj metody toString oraz wartości zwracane lub obsługę wyjątków :)

stwórz klasę Restaurant, zawierającą zbiór dań

    * */
}
