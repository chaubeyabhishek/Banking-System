import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "", accountNumber = "", pin = "";
        double balance = 0.0;

        while (true) {
            System.out.println("\n--- Banking System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
                System.out.print("Enter your name: ");
                name = sc.nextLine();
                System.out.print("Create an account number: ");
                accountNumber = sc.nextLine();
                System.out.print("Set a 4-digit PIN: ");
                pin = sc.nextLine();
                System.out.print("Initial deposit amount: ");
                balance = sc.nextDouble();
                System.out.println("Account created successfully!");
            } 
            else if (choice == 2) {
                System.out.print("Enter your account number: ");
                String accNum = sc.nextLine();
                System.out.print("Enter your PIN: ");
                String enteredPin = sc.nextLine();

                if (accNum.equals(accountNumber) && enteredPin.equals(pin)) {
                    System.out.println("Login successful. Welcome, " + name + "!");
                    while (true) {
                        System.out.println("\n1. Check Balance");
                        System.out.println("2. Deposit");
                        System.out.println("3. Withdraw");
                        System.out.println("4. Logout");
                        System.out.print("Choose an option: ");

                        int subChoice = sc.nextInt();

                        if (subChoice == 1) {
                            System.out.println("Current balance: " + balance);
                        } 
                        else if (subChoice == 2) {
                            System.out.print("Enter deposit amount: ");
                            double amount = sc.nextDouble();
                            balance += amount;
                            System.out.println("Deposit successful. New balance: " + balance);
                        } 
                        else if (subChoice == 3) {
                            System.out.print("Enter withdrawal amount: ");
                            double amount = sc.nextDouble();
                            if (amount <= balance) {
                                balance -= amount;
                                System.out.println("Withdrawal successful. New balance: " + balance);
                            } else {
                                System.out.println("Insufficient balance.");
                            }
                        } 
                        else if (subChoice == 4) {
                            break;
                        } 
                        else {
                            System.out.println("Invalid option. Try again.");
                        }
                    }
                } else {
                    System.out.println("Invalid account number or PIN.");
                }
            } 
            else if (choice == 3) {
                System.out.println("Thank you for using the Banking System. Goodbye!");
                break;
            } 
            else {
                System.out.println("Invalid option. Try again.");
            }
        }
    }
}
