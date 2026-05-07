import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Create {
    public static void main(String[] args) {

        // Create: Problem 1
        // Create a List of Maps
        List<Map<String, Integer>> world = new ArrayList<>();

        // Create: Problem 2
        // Create USA map
        Map<String, Integer> usa = new LinkedHashMap<>();

        usa.put("New York City", 8600000);
        usa.put("Los Angeles", 4000000);
        usa.put("Chicago", 2700000);
        usa.put("Houston", 2400000);

        // Add USA map to world
        world.add(usa);

        // Create: Problem 3
        // Create Canada map
        Map<String, Integer> canada = new LinkedHashMap<>();

        canada.put("Toronto", 5400000);
        canada.put("Montreal", 3500000);
        canada.put("Vancouver", 2300000);
        canada.put("Calgary", 1200000);

        // Add Canada map to world
        world.add(canada);

        // Create: Problem 4
        // Retrieve second key-value pair from first map

        List<String> usaKeys = new ArrayList<>(usa.keySet());

        String secondUSAKey = usaKeys.get(1);

        System.out.println(secondUSAKey + " -> " + usa.get(secondUSAKey));

        // Create: Problem 5
        // Retrieve first key-value pair from second map

        List<String> canadaKeys = new ArrayList<>(canada.keySet());

        String firstCanadaKey = canadaKeys.get(0);

        System.out.println(firstCanadaKey + " -> " + canada.get(firstCanadaKey));
    }
}