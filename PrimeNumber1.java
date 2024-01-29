import java.util.Scanner;

public class PrimeNumber1{
	public static void main(String[] args){

	Scanner console = new Scanner(System.in);
	
	int primeNumber = 0;

	System.out.print("Enter a prime number: ");
	int userInput = console.nextInt();

	
	    if(userInput%1 == 0){
		System.out.print("It's a prime number");
	    }
	    if(userInput%2==0){
		System.out.print("not a prime number");
		}
	

   }
}
