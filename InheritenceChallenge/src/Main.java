//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 Employee tim=new Employee("Tim","11/11/1985","01/01/2020");
        System.out.println(tim);
        System.out.println("Age = "+tim.getAge());
        System.out.println("Pay ="+tim.collectPay());
    Employee jim=new Employee("Jim","11/11/1985","01/01/2020");
        System.out.println(jim);
        System.out.println("Age = "+jim.getAge());
        System.out.println("Pay ="+jim.collectPay());
        SalariedEmployee joe=new SalariedEmployee("Joe","12/06/1985","21/02/2020",12000.05);
        System.out.println("Paycheck ="+joe.annualSalary);

    }
}