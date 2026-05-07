import java.util.ArrayList;
import java.util.List;

public class Fix {
    public static void main(String[] args) {

        // Fix: Problem 1

        // BUG:
        // Tried casting a String into an Integer.
        // Error occurs because "test" is not an Integer.

        List<String> v = new ArrayList<>();
        v.add("test");

        String i = v.get(0);

        System.out.println(i);

        // Fix: Problem 2

        // BUG:
        // List<Integer> cannot store a double value (3.14).

        List<Double> myNumbers = new ArrayList<>();
        myNumbers.add(3.14);

        System.out.println(myNumbers);

        // Fix: Problem 3

        // BUG:
        // Holder<Integer> was storing a String.

        Holder<String> holder1 = new Holder<>("Indianapolis");

        System.out.println(holder1);
        System.out.println(holder1.getValue());

        // Fix: Problem 4

        // BUG:
        // Generics cannot use primitive types like int.

        Holder<Integer> holder2 = new Holder<>(35);

        System.out.println(holder2);

        // Fix: Problem 5

        // BUG:
        // Cannot assign a Double directly to an int without conversion.

        List<Double> myTemps = new ArrayList<>();
        myTemps.add(72.0);

        double g = myTemps.get(0);

        System.out.println(g);
    }
}