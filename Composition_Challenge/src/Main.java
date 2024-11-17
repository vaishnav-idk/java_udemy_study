//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    SmartKitchen kitchen = new SmartKitchen();
//    kitchen.getBrewMaster().setHasWorkToDo(true);
//    kitchen.getIceBox().setHasWorkToDo(true);
//    kitchen.getDishWasher().setHasWorkToDo(true);
//    kitchen.getBrewMaster().brewCoffee();
//    kitchen.getIceBox().orderFood();
//    kitchen.getDishWasher().doDishs();
        kitchen.setKitchenState(true,false,true);
        kitchen.doKitchenWork();

    }
}