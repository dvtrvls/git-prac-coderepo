import java.util.Scanner;

class BankAccount {
    String owner = "Unknown";
    double balance = 0;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("You deposited: " + amount);
        System.out.println("Your new balance is: " + this.balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Amount");
            return;
        }

        balance -= amount;
        System.out.println("Your new balance is " + balance);
    }

    void checkBal() {
        System.out.println(balance);
    }
}

public class helloworld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        BankAccount account = new BankAccount(name, 0);

        System.out.println(account.owner);

        account.deposit(1000);
        account.withdraw(500);
        account.checkBal();
    }
}
