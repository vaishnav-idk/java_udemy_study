 //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Car {
    private String make;
    private String model;
    private int color;
    private int doors;
    private boolean convertiable;
    public void describeCar()
    {
        System.out.println("Make : " + make+" doors : " + doors+" color : " + color+" model : " + model
        );

    }

     public void setMake(String make) {
         this.make = make;
     }

     public void setModel(String model) {
         this.model = model;
     }

     public void setColor(int color) {
         this.color = color;
     }

     public void setDoors(int doors) {
         this.doors = doors;
     }

     public void setConvertiable(boolean convertiable) {
         this.convertiable = convertiable;
     }

     public String getMake() {
        return make;
    }

     public String getModel() {
         return model;
     }

     public int getDoors() {
         return doors;
     }

     public int getColor() {
         return color;
     }

     public boolean isConvertiable() {
         return convertiable;
     }
 }