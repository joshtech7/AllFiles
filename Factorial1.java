import java.util.Scanner;

public class Factorial1{
	public static void main(String[] args){
		
	Scanner inputCollector = new Scanner(System.in);
	
	System.out.print("Enter a number to find the factorial: ");
	int userInput = inputCollector.nextInt();

	int factorial =  1;

	for(int count = 1 ;count <= userInput; count++){
	 factorial *= count;
     } 
System.out.printf("The factorial of %d%nis: %d",userInput, factorial);
  }
}