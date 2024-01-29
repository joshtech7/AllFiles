import java.util.Scanner;

public class CreditCalculator{

	public static void main(String [] args){
	
	Scanner inputCollector = new Scanner(System.in);
	
	int totalCharges = 0;
	int totalCredits = 0;
	

	System.out.print("Enter your Account Number: ");
	int acctNumber = inputCollector.nextInt();
	
	System.out.print("Enter the balance for the begining of the month: ");
	int balOfTheMonth = inputCollector.nextInt();
	
	System.out.print("Enter the total charges: ");
	totalCharges  = inputCollector.nextInt();
	
	System.out.println("Enter the total credits: ");
	totalCredits  = inputCollector.nextInt();
	
	int newBalance = balOfTheMonth + totalCharges - totalCredits;

	if(newBalance > totalCredits){
	System.out.println("Credit limit exceeded");
	}else if(newBalance < totalCredits)
	{
	System.out.print("Credit limit in range");
	}
	System.out.printf("The new balance is %d ", newBalance);
	
	
	
	while(acctNumber != -1){

	totalCharges++;
	totalCredits++;

	System.out.println("Enter your Account Number: ");
	acctNumber = inputCollector.nextInt();
	
	System.out.println("Enter the balance for the begining of the month: ");
	balOfTheMonth = inputCollector.nextInt();
	
	System.out.println("Enter the total charges of this month: ");
	totalCharges  = inputCollector.nextInt();
	
	System.out.println("Enter the total credits applied to the cutomers this month: ");

	totalCredits  = inputCollector.nextInt();

	newBalance = balOfTheMonth + totalCharges - totalCredits;

	if(newBalance > totalCredits){
	System.out.println("Credit limit exceeded");
	}else if(newBalance < totalCredits)
	{
	System.out.print("Credit limit in range");
	}
	
	System.out.printf("The new balance is %d ", newBalance);

	}




	}
}