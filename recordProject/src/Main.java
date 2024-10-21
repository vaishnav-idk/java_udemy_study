//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for( int i =1  ; i<=5 ; i++)
        {
            Student s=new Student("S4343"+i,switch (i){
                case 1 ->"Mary";
                case 2 -> "Carol";
                case 3 -> "Bob";
                case 4 -> "Jack";
                case 5 -> "John";
                default -> "anonymous"; //requiement for a numeric switch expression
            },"05/12/2021","Java");
            System.out.println(s);

        }
        StudentRecord obj=new StudentRecord("S2323","Vaishnav","05/12/2111","JAva");
        System.out.println(obj);
        System.out.println(obj.dateofbirth());
    }
}