import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Write {

    public static void main(String[] args) {

        // Write: Problem 1
        // Declare a List of Integers and add squares
        List<Integer> squares = new ArrayList<>();

        squares.add(1);
        squares.add(4);
        squares.add(9);
        squares.add(16);
        squares.add(25);

        System.out.println(squares);

        // Write: Problem 2
        // Declare a Holder containing 37
        Holder<Integer> numberHolder = new Holder<>(37);

        System.out.println(numberHolder);

        // Write: Problem 3
        // Declare a Holder containing "Paris"
        Holder<String> cityHolder = new Holder<>("Paris");

        System.out.println(cityHolder);

        // Write: Problem 4
        // Declare a Map of cities and zip codes
        Map<String, Integer> cityZipCodes = new HashMap<>();

        // Write: Problem 5
        // Add values to the Map
        cityZipCodes.put("Colorado Springs, Colorado", 80911);
        cityZipCodes.put("Reynoldsburg, Ohio", 43068);
        cityZipCodes.put("Rochester, New York", 14617);

        System.out.println(cityZipCodes);
    }
}