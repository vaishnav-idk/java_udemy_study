class Dog {
    // Instance variable unique to each Dog instance
    String name;

    // Constructor to initialize the instance variable
    public Dog(String name) {
        this.name = name;
    }

    // Method to display the name of the dog
    public void bark() {
        System.out.println(name + " says: Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating instances of Dog with different names
        Dog dog1 = new Dog("Buddy");
        Dog dog2 = new Dog("Bella");

        // Each dog has its own instance variable 'name'
        dog1.bark();  // Output: Buddy says: Woof!
        dog2.bark();  // Output: Bella says: Woof!
    }
}
