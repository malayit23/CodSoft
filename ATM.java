import java.util.Scanner;

public class ATM {
    float Balance;
    int PIN = 5674;
    public void checkpin(){
        System.out.println("Enter your PIN: ");
        Scanner scn = new Scanner (System.in);
        int enteredpin = scn.nextInt();
        if( enteredpin == PIN){
            menu();
        }
        else{
            System.out.println("Please enter a valid PIN");
            
        }
    }


    public void menu(){
        System.out.println("Enter your Choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner (System.in);
        int opt = sc.nextInt();


        if( opt == 1){
            checkBalance();
        }
        else if (opt == 2){
            withdrawMoney();
        }
        else if (opt == 3){
            depositMoney();
        }
        else if (opt == 4){
            return;
        }
        else{
            System.out.println("Please enter a valid choice");
        }
    }


    public void checkBalance(){
        System.out.println("Balance: "+ Balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter Amount to withdraw: ");
        Scanner scanner = new Scanner(System.in);
        float amount = scanner.nextFloat();
        if( amount>Balance){
            System.out.println("Insufficient funds");
        }
        else{
            Balance -= amount;
            System.out.println("Money Withdrawl Successful");
        }
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter Amount to Deposit: ");
        Scanner scanner = new Scanner(System.in);
        float amount = scanner.nextFloat();
        Balance += amount;
        System.out.println("Money Deposit Successful");
        menu();
        
    }

    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }


}
