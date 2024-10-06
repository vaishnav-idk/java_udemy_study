//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer c1=new Customer("Vaishnav",250.45,"vaishnav@mail.com");
        Customer c2=new Customer(250.45,"mary@mail.com");

        System.out.println(c1.getCreditLimit()+" "+c1.getEmail()+" "+c1.getName());
        System.out.println(c2.getCreditLimit()+" "+c2.getEmail()+" "+c2.getName());

    }}