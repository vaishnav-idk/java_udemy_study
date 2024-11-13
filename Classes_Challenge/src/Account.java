public class Account {
    private double balance;
    private int  number;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    public Account {
        System.out.println("Account Constructor empty created");
    }
    public Account(double balance, int number, String customerName, String customerEmail, String customerPhone) {
        this.balance = balance;
        this.number = number;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        System.out.println("account constructor created  "+this.balance+this.number+this.customerName+this.customerEmail+this.customerPhone);
    }

    public void depsoitFunds(double depositAmount)
    {
        this.balance = this.balance + depositAmount;
        System.out.println("Deposit amount : " + depositAmount);
        System.out.println("New Balance : " + this.balance);
    }

    public void withdrawFunds (double withdrawAmount)
    {
        if( this.balance - withdrawAmount<0){
            System.out.println("Insufficient Funds");
        }
        else{
            this.balance = this.balance - withdrawAmount;
            System.out.println("Withdraw amount : " + withdrawAmount);
            System.out.println("New Balance : " + this.balance);
        }
    }



    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
