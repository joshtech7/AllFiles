import java.util.Scanner;

public class ExtremesWhile{
	public static void main(String[] args){
	
	int maximum = Integer.MIN_VALUE;
	int minimum = Integer.MAX_VALUE;

	Scanner myCollector = new Scanner(System.in);

	int i = 1;
	while(i < 4){
	System.out.print("Enter number to get the min and max value: ");
	int userInput = myCollector.nextInt();
	if(userInput > maximum){
	maximum = userInput;
	}
	if(userInput < minimum){
	minimum = userInput;
	}
	i++;
	}
	System.out.printf("The result for maximum is %d%n The result for minimum %d", maximum, minimum);
	}
}