import java.util.Scanner;

public class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("****** ATM MENU ******");
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.println("Choose an option:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter amout to withdraw: ₹");
                    double withdrawAmount = sc.nextDouble();
                    if (account.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawl successful!");
                    } else {
                        System.out.println("Insufficient balance or invalid amount. ");
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposit successful!");
                    break;
                case 3:
                    System.out.printf("Current Balance: ₹%.2f\n", account.checkBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }

        } while(choice != 4);

        sc.close();
    }
    
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(5000.00); //  Starting with ₹5000
        ATM atm = new ATM(userAccount);
        atm.showMenu();
    }
}
    

    
                    

            




                    
            



        


