import java.util.ArrayList;
import java.util.List;

public class Read {
    public static void main(String[] args) {

        // Read: Problem 1
        // Creates a List that stores Integer objects
        List<Integer> myAges = new ArrayList<>();

        // Read: Problem 2
        // Creates an Integer object with the value 22
        Integer x = 22;

        // Prints the value of x
        System.out.println(x);

        // Read: Problem 3
        // Adds values into the List
        myAges.add(x);
        myAges.add(Integer.valueOf(25));
        myAges.add(27);

        // Read: Problem 4
        // Retrieves the value at index 2 and unboxes it into an int
        int a = myAges.get(2);

        // Prints the value
        System.out.println(a);

        // Read: Problem 5
        // Creates a Holder object containing the String "Portland"
        Holder<String> myHolder = new Holder("Portland");

        // Prints the Holder object
        System.out.println(myHolder);

        /*
         OUTPUT:
         22
         27
         This is a Holder that contains: {Portland}

         PURPOSE:
         Demonstrates Java Generics, Lists, autoboxing/unboxing,
         and how generic classes can store different data types safely.
        */
    }
}