public class Employee extends  Worker{
    private long employeeID;
    private String hireDate;
    private static int employeeCounter=1;
    //static variable
    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.hireDate = hireDate;
        this.employeeID =Employee.employeeCounter++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "endDate='" + endDate + '\'' +
                ", hireDate='" + hireDate + '\'' +
                ", employeeID=" + employeeID +
                "} " + super.toString();
    }
}
