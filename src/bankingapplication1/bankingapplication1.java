package bankingapplication1;

import java.util.Random;
import java.util.Scanner;
public class bankingapplication1 {
    public static void main(String[] args) {
        int option = 0;
        String name;
        double balance,amount;
        int number;
        Bank bank = new Bank();
        Account account;
        Scanner scanner = new Scanner(System.in);
        while (option != 6) {
            System.out.println("Main Menu");
            System.out.println("1.Display All Accounts");
            System.out.println("2.Open New Account");
            System.out.println("3.Close Existing Account");
            System.out.println("4.Deposit");
            System.out.println("5.Withdraw");
            System.out.println("6.Exit");
            System.out.println();
            System.out.print("Enter your choice: ");
            option = scanner.nextInt();
            //scanner.nextLine();

            switch (option) {
                case 1:
                   bank.listAccounts();
                    break;
                case 2:
                    System.out.println("Enter Account Name: ");
                    name = scanner.nextLine();
                    System.out.println("Enter Initial Balance: ");
                    balance = scanner.nextDouble();
                    number = generateAccountNumber();
                    System.out.println(number);
                    account = new Account(number, name, balance);
                    bank.openAccount(account);
                    break;
                case 3:
                    System.out.println("Enter Account Number: ");
                    number = scanner.nextInt();
                    bank.closeAccount(number);
                    break;
                case 4:
                    System.out.println("Enter Account Number: ");
                    number = scanner.nextInt();
                    System.out.println("Enter Amount : ");
                    amount = scanner.nextDouble();
                    bank.depositMoney(number,amount);
                    break;
                case 5:
                    System.out.println("Enter Account Number: ");
                    number = scanner.nextInt();
                    System.out.println("Enter Amount : ");
                    amount = scanner.nextDouble();
                    bank.withdrawMoney(number,amount);
                    break;

            }

            System.out.println();
        }
    }

    public static int generateAccountNumber() {
        Random rand = new Random();
        int number = 100000 + rand.nextInt(900000);
        return number;
    }

}
