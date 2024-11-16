//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Animal animal = new Animal("Generic Animal","Huge","400");
    doAnimalStuff(animal,"slow");
    Dog dog = new Dog();
    doAnimalStuff(dog,"slow");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("------");

        //this method is static so it can be called from main method
    }
}