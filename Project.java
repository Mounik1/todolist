package firstproject;
import java.util.*;
class Project {
	static ArrayList<String> List = new ArrayList<String>();
    static int count = 0;
    static int a; 
    static String t1 = "";
	public static void main(String[] args) {
		Task t = new Task();
		int n = 0;
		System.out.println("WELCOME, USER ");
		do
		{
			System.out.println("Choose what you wanna do:-");
			System.out.println("1) Add a Task");
			System.out.println("2) View Tasks");
			System.out.println("3) Remove a Task");
			System.out.println("4) Completed Tasks");
			System.out.println("5) Exit");
			System.out.println("--------------------------------------------------------");
			System.out.println("Give the input: ");
			Scanner s = new Scanner(System.in);
			n = s.nextInt();
			if(n > 0 && n < 6)
			{
				switch(n) {
				
				case 1:
				{
					t.addATask();
					break;
				}
				case 2:
				{
					t.viewTasks();
					break;
				}
				case 3:
				{
					t.deleteTasks();
					break;
				}
				case 4:
				{
					t.taskCompleted();
					break;
				}
				case 5:
				{
					System.out.println("System Terminated!...");
					System.exit(0);
				}
				}
			}else if(n != 1 && n != 2 && n != 3 && n != 4 && n != 5)
			{
				System.out.println("Invalid Input!");
			}
			}while(t == t);	
		}	
}
class Task extends Project
{	
	public static String addATask()
	{
		System.out.println("Enter the task:- ");
		 Scanner s = new Scanner(System.in);
		 String task = s.nextLine();
		List.add(task);
		System.out.println("Task added successfully!!!");
        System.out.println("----------------------------------------------------");
		return task;
	}
	public static int viewTasks()
	{
		int i = 0;
		
		if(List.isEmpty())
		{
			System.out.println("Please add the Task first!!!...");
		}
		else {
			for(i = 0;i < List.size();i++)
			{
				 if(a > 0)
		            {
					 if(a == i + 1)
	                 {
	                 	System.out.println(i + 1 + "." + List.get(i) + " : Completed");
	                 	continue;
	                 }
					 System.out.println(i + 1 + "." + List.get(i) + " : Progress");
					 
		            }
			}
            System.out.println("----------------------------------------------------");
           
           
           
            
		}
		return i;
	}
	public static void deleteTasks()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number that you wanted to delete:-");
		int j = s.nextInt();
		int i;
		for(i = 0; i < List.size();i++)
		{
			if(List.isEmpty())
			{
				System.out.println("Please add the Task first!!!...");
			}
			else if(j == i+1)
			{
				System.out.println(List.remove(i));
				System.out.println(i + 1+"." + " Deleted successfully!");
				System.out.println("The task" + (i + 1) + " were removed from the list...");
			}
		}
	}
	public static int taskCompleted()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Which task you wanna complete?");
		
		a = s.nextInt();
		int i = 0;
		
		if(a == i + 1)
		{
				System.out.println(i + 1 + "." + List.get(i) + " : Completed");

		}
		return a;		
	}
}
