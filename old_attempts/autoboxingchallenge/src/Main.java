import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions) {

    public Customer(String name, double initalDeposit) {
        this(name.toUpperCase(), new ArrayList<Double>(500));
        transactions.add(initalDeposit);
    }
}
public class Main {
    public static void main(String[] args) {

        Customer bob = new Customer("Bob S",1000.0);
        System.out.println(bob);

        }
    }
public Bank{
    private String name;
    private ArrayList<Customer> customers=new ArrayList<>(5000);
    public Bank(String name)
    {
        this.name=name;
    }
private Customer getCustomer(String customerName)
    {
        for (var customer.name().equalsIgnoreCase(customerName))
        {
            return; customer
        }
    }

}
