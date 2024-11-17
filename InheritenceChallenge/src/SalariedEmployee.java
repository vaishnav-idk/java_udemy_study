public class SalariedEmployee extends Employee {
    double annualSalary;
    double isRetired;
    public SalariedEmployee(String name, String birthDate, String hireDate,double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return (int)annualSalary/26;
    }

}
