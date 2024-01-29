import java.util.Scanner;

public class Reversed1{
	public static void main(String[] args){
	
	Scanner console = new Scanner(System.in);

	
	int reverseResult = 0;

	System.out.print("Enter 5 positive numbers to reverse: ");
	int userInput = console.nextInt();
       


while(userInput < 10000 || userInput > 99999);

	int digit1 = userInput / 10000;
	int digit2 = (userInput / 1000) % 10;
	int digit3 = (userInput / 100) % 10;
	int digit4 = (userInput / 10)% 10;
	int digit5 = userInput % 10;
	
	reverseResult = digit5 * 10000 + digit4 * 1000 + digit3 * 100 + digit2 * 10 + digit1 * 1;
	
	System.out.printf("The result for %d%nThe result is %d",userInput,reverseResult);	
     }
}
