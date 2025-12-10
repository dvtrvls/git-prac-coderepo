import java.util.ArrayList;
import java.util.Scanner;


public class Main
{
  private static ArrayList<Expense> expenses = new ArrayList<>();

  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);

    while(true)
    {
      System.out.println("\n=== Gastos Tracker ===");
      System.out.println("1. Add Expense");
      System.out.println("2. View Expenses");
      System.out.println("3. Total Spent");
      System.out.println("4. Exit");
      System.out.print("Choose: ");

      int choice;
      try
      {
      choice = Integer.parseInt(input.nextLine());
      }
      
      catch(Exception e)
      {
        System.out.println("Invalid Input");
        continue;
      }

      switch(choice)
      {
        case 1 -> addExpense(input);
        case 2 -> viewExpenses();
        case 3 -> showTotal();
        case 4 -> {System.out.println("Thank you for visiting");
                   return;}
        default -> System.out.println("Invalid Option");
      }


    } // while loop func closing bracket
    

  


  } // main func closing bracket


  private static void addExpense(Scanner input)
  {
    try
    {
    System.out.print("Description: ");
    String desc = input.nextLine();

    System.out.print("Amount: ");
    double amount = Double.parseDouble(input.nextLine());

    System.out.print("Enter Date (MM-DD-YYYY): ");
    String date = input.nextLine();
    
    expenses.add(new Expense(amount, desc, date));
    System.out.println("Added Successfuly");
    }

    catch(Exception e)
    {
      System.out.println("Error Encountered");
    }


  }

  private static void viewExpenses()
  {
    if (expenses.isEmpty())
    {
      System.out.println("Your expenses does not contain anything");
      return;
    }
      
    System.out.println("=== Your Expenses ===");

    for(Expense e: expenses)
    {
      System.out.println(e);
    }

    System.out.println("\n======================");    

  }

  private static void showTotal()
  {
    
    double total = 0;

    for (Expense e: expenses)
    {
      total += e.getAmount();
    }

    System.out.println("Your Total Expenses is: " + total);



  }







}







