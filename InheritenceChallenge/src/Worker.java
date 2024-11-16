public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;
    //endDate will get set by a method either
    //in this class or a subclass so its protected rather than private


    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        //usally we do not add endDate to employee

    }

    public int getAge()
    {
        int currentYear=2025;
        int birthYear=Integer.parseInt(birthDate.substring(6));
        return (currentYear-birthYear);
    }

}
