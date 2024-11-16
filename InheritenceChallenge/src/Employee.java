public class Employee extends  Worker{
    private long employeeID;
    private String hireDate;

    public Employee(String name, String birthDate, String hireDate, long employeeID) {
        super(name, birthDate);
        this.hireDate = hireDate;
        this.employeeID = employeeID;
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
