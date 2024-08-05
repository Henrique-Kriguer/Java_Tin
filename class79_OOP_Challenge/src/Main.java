

public class Main {



    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

     //   BankAccount acc = new BankAccount(999,1000,"Henrique","mail",123456);
        //System.out.println("Balance: "+acc.getAccountBalance());
        acc.depositing((float) 100.90f);
        //System.out.println("Balance: "+acc.getAccountBalance());
        acc.withdrawing((float)40.8f);
       // System.out.println("Balance: "+acc.getAccountBalance());
        acc.withdrawing(100);
       // System.out.println("Balance: "+acc.getAccountBalance());

    }
}