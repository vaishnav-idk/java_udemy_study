public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\n");

        Car obj = new Car();
        obj.describeCar();
        System.out.println("make=" + obj.getMake());
        obj.setColor(5);
        obj.setConvertiable(true);
        obj.setDoors(2);
        obj.describeCar();

        }
    }

