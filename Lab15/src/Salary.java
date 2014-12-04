// ************************************************************
// Salary.java
//
// Computes the amount of a raise and the new salary for an employee. The current salary
// and a performance rating ("Excellent", "Good" or "Poor") are input.
// ************************************************************
import java.util.Scanner;
import java.text.NumberFormat;
public class Salary
{
	public static void main (String[] args)
	{
		double currentSalary; // employee's current salary
		double raise =0; // amount of the raise
		double newSalary; // new salary for the employee
		
		String rating; // performance rating
		Scanner scan = new Scanner(System.in);
		System.out.print ("Enter the current salary: ");
		currentSalary = scan.nextDouble();
		System.out.print ("Enter the performance rating : ");
		rating = scan.next(); 
		double rate;
		System.out.println(rating);
		switch(rating){
		case "Excellent": rate = .06;
		case "Good": rate = .04;
		case "Poor": rate = .015;
		default:{ rate =0; System.out.println("Invalid Number");}
		}
		raise = rate * currentSalary;
		

		
		newSalary = currentSalary + raise;
		
		// Print the results
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println();
		System.out.println("Current Salary: " + money.format(currentSalary));
		System.out.println("Amount of your raise: " + money.format(raise));
		System.out.println( "Your new salary: " + money. format (newSalary) );
		System.out.println();
	}
}
