package obiektowosc.kolekcje.maps;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer, String> users = new HashMap<>();
        users.put(1, "Daniel");
        users.put(2, "Kasia");
        users.put(3, "Zenek");
        users.put(5, "Zofia");
        users.put(2, "Marcin");
        users.put(6, "Daniel");

        System.out.println(users);
        System.out.println(users.get(5));
        System.out.println(users.keySet());
        System.out.println(users.values());

        for (Integer id : users.keySet()) {
            System.out.println(id + " -> " + users.get(id));
        }

        for (String value : users.values()) {
            System.out.println(value);
        }

        for (Map.Entry<Integer, String> entry : users.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
