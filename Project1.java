package firstproject;
import java.util.*;
public class Project1 {
	static ArrayList<String> addIncomeSource = new ArrayList<String>();
	static ArrayList<Double> List = new ArrayList<Double>();
	static ArrayList<String> Product = new ArrayList<String>();
	static ArrayList<Double> expense = new ArrayList<Double>();
	
	static Double ViewBalance = 0.0;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = 0;
		while(true)
		{
			System.out.println("1) Add Income:");
			System.out.println("2) Add Expense:");
			System.out.println("3) View Transactions:");
			System.out.println("4) View Balance:");
			System.out.println("5) Exit");
			System.out.println("-----------------------------------------");
			System.out.print("Enter your choice:- ");
			 i = s.nextInt();
		
		switch(i)
		{
		case 1:
			addIncomeSource();
			amount();
		    break;
		case 2:
		{
			addExpense();
			negAmount();
			break;
		}
		case 3:
		{
			viewTransactions();
		    break;
		}
		case 4:
		{
			viewBalance();
		    break;
		}
		case 5:
		{
		System.out.println("System Terminated!...");
		System.exit(0);
		break;
		}
		default :
		{
		System.out.println("Wrong input plz give the number from given option");
		}
	   }
	}
}
	public static void addIncomeSource()
 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter that what is the source of income:- ");
		String sourceOfIncome = s.nextLine();
		addIncomeSource.add(sourceOfIncome);
			System.out.print("Your Income Source Entered Successfully");
			System.out.println("-----------------------------------------");
	}
	public static void amount()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Income:-");
		Double amount = s.nextDouble();
		ViewBalance = amount;
		if(amount >= 0)
		{
			List.add(amount);
			System.out.println("Your amount were Entered Successfully");
			System.out.println("-----------------------------------------");

		}else
		{
			System.out.println("Please enter positive value");
		}
	}
	public static void addExpense()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the product that you brought:- ");
		String Pro = s.nextLine();
		Product.add(Pro);
		System.out.println("Product added successfully...");
		System.out.println("-----------------------------------------");
	}
	public static void negAmount()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your amount that you spent on the product:- ");
		Double amount = (double) s.nextInt();
		expense.add(-amount);
		Double ViewBalance = - amount;
		System.out.println("Amount added successfully...");
		System.out.println("-----------------------------------------");
	}
	public static void viewTransactions()
	{		
		for(int i = 0; i < addIncomeSource.size() ;i++) {
			System.out.println(i + 1 + ")" + "Income Source: "+addIncomeSource.get(i));
		}
		for(int i = 0; i < List.size();i++)
		{
			System.out.println(" "+"Total Income Amount: "+ List.get(i));

		}
		for(int i = 0; i < Product.size();i++)
		{
		    System.out.println(" Product Buyed: " +Product.get(i));

		}
		for(int i = 0; i < expense.size();i++)
		{
			System.out.println(" Total Expenses: "+ expense.get(i));

		}
			System.out.println("-----------------------------------------");		
		
	}
	public static void viewBalance()
	{
		if(ViewBalance == 0)
		{
			System.out.println("Please Enter the balance first!!!");
		}else
		{
			System.out.println("Your current balance is :"+ViewBalance);
			System.out.println("-----------------------------------------");
		}
	}
}
