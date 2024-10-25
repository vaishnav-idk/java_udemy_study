class Counter {
    // Static variable shared by all instances of the Counter class
    static int count = 0;

    // Constructor increments the static variable
    public Counter() {
        count++;
    }

    // Static method to get the current count
    public static int getCount() {
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating instances of Counter
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // Display the count, which is shared across all instances
        System.out.println("Number of instances created: " + Counter.getCount());
    }
}
