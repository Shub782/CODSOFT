import java.util.Scanner;
/**
 * BankAccount
 */
 class BankAccount {
     private double balance;

public BankAccount(Double IntialBalance){
    this.balance= IntialBalance;
}
public double getbalance(){
    return balance;
}
   public void deposit(double amount){
    if(amount>0){
        balance += amount;
        System.out.println("Successfullly deposited the amount:"+balance);
    }else{
        System.out.println("Insufficient money to deposit");
    }
}
    public void withdraw(double amount){
        if(amount >= 0 && amount <= balance){
            balance -= amount;
            System.out.println("Successfully Withdrawed. New Balance:"+balance);
        }else{
            System.out.println("Withdraw Unsuccessful. Insufficient amount to Withdraw");
        }

        }
    }
    class ATM{
        private BankAccount account;
        private Scanner scanner;
    
      public ATM(BankAccount account){
        this.account = account;
        this.scanner = new Scanner(System.in);
      }
        public void Display(){
            System.out.println("1.Withdraw ");
            System.out.println("2.Deposit");
            System.out.println("3.CheckBalance()");
         
        }
    
     public void run(){
        int choice;
        do {
            Display();
            System.out.println("PLEASE ENTER YOUR CHOICE");
            choice = scanner.nextInt() ;
            switch(choice){
                case 1:withdraw();
                break;
                case 2:deposit();
                break;
                case 3:CheckBalance();
                System.out.println("Thank You for using ATM. Have a good day!!!");  
                break;
                default:
                   System.out.println("Invalid choice");  
            }
        }while (choice != 3);
    } 
    
    private void CheckBalance(){
        System.out.println("Your Current Balance :"+account.getbalance());
    }
    private void deposit(){
        System.out.println("Enter the required amount to Deposit");
        double amount = scanner.nextDouble();
        account.deposit(amount);
    }
    private void withdraw(){
        System.out.println("Enter the amount to Withdraw");
        double amount = scanner.nextDouble();
        account.withdraw(amount);
    }
    
    }
 
    public class ATM_Interface{
        public static void main(String[] args) {
            System.out.println("Welcome to BOB ATM");
         BankAccount userAccount = new BankAccount(10000.0);
         ATM atm = new ATM(userAccount);
         atm.run();
        }
    }


    
       

