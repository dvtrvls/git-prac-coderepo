import java.util.Scanner;


class BankAccount
      {
          String owner = "Unknown";
          double balance = 0;

          BankAccount(String owner, double balance)
          {
            this.owner = owner;
            this.balance = balance;
          }
            
          void deposit(double amount)
          {
            balance += amount;
            System.out.println("You deposited: " + amount);
            System.out.println("Your new balance is: " + this.balance);
          }

          void withdraw(double amount)
          {
            if (amount > balance)
            {
              System.out.println("Inefficient Amount");
              return;

            }
            
            balance -= amount;
            System.out.println("Your new balance is " + balance);
          }

          void checkBal()
          {
            System.out.println(balance);
          }





public class helloworld
{  
    public static void main(String[] args)
    {
        
    









      }
              
















    }






}
