// Read: Problem 6
// Generic Holder class that can store any data type
public class Holder<Type> {

    // Read: Problem 7
    // Variable of generic type
    private Type t;

    // Read: Problem 8
    // Constructor assigns the value to t
    public Holder(Type t) {
        this.t = t;
    }

    // Read: Problem 9
    // Returns the stored value
    public Type getValue() {
        return t;
    }

    // Read: Problem 10
    // Returns a String representation of the object
    @Override
    public String toString() {
        return "This is a Holder that contains: {" + t + '}';
    }
}