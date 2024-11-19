package steric.vsv;

import com.abc.first.*;

public class Main {
    public static void main(String[] args) {
        Item firstItem = new Item("First Item");
        //System.out.println(firstItem);
        com.abc.first.Item thirdItem = new com.abc.first.Item("Third Item");
        //we can use fully qualified name of class and not import the package
        System.out.println(thirdItem);
    }
}
