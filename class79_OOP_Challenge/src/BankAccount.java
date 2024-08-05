public class BankAccount {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(){
        this(998,2.50f,"Default name","Default address", 123);
        System.out.println("empty constructor is called.");
    }
    public BankAccount(int accountNumber, float accountBalance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        email = email;
        phoneNumber = phoneNumber;
        System.out.println("Constructor with 5 parameters are called");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositing (double funds){
         accountBalance+=funds;
         System.out.println("Deposit of $"+funds+ " made. New balance is $"+ accountBalance);
    }

    public void withdrawing (double funds) {
        if (accountBalance < funds ) {
            System.out.println("Withdraw of $"+funds+ " isn´t made since there isn´t sufficient funds in balance.Actual balance is $"+ accountBalance);


        } else {
            accountBalance -= funds;
            System.out.println("Withdraw of $" + funds + " made. New balance is $" + accountBalance);
        }
    }
}
