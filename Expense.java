public class Expense
{

  private double amount = 0;
  private String description;
  private String date;

  Expense(double amount, String description, String date)
  {
    this.amount = amount;
    this.description = description;
    this.date = date;
  }

  public double getAmount()
  {
    return amount;
  }

  public String getDescription()
  {
    return description;
  }

  public String getDate()
  {
    return date;
  }

  @Override
  public String toString()
  {
    return date + "-" + description + ":$ " + amount;
  }


  
}
