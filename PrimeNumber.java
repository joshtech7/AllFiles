import java.util.Scanner;

public class PrimeNumber{
	public static void main(String[] args){

	Scanner console = new Scanner(System.in);
	
	int primeNumber = 0;

	System.out.print("Enter a positive number: ");
	int userInput = console.nextInt();

	for(int count = 1; count <= userInput; count++){

	if(userInput % count == 0){
		primeNumber++;
	    }	
	}

	if(primeNumber > 1){

	System.out.print("not a prime number!!!");
	}

	else{
	    System.out.print("It's a prime number");
	}
   }
}
