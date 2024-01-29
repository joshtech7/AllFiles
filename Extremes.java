import java.util.Scanner;

public class Extremes{
	public static void main(String[] args){

	int minimum = Integer.MAX_VALUE;
	int maximum = Integer.MIN_VALUE;

	Scanner myCollector = new Scanner(System.in);

	

	
	for(int i = 0; i < 3; i++){
	System.out.println("Enter a number to get the (min and max) value: ");
	int userInput = myCollector.nextInt();

	if(userInput > maximum){
	maximum = userInput;
	} 
	if(userInput < minimum){
	minimum = userInput;
	}
	}
	int sum = maximum + minimum;
	System.out.printf("the sum result is %d%n%n", sum);
	System.out.printf("The maximum value %d%n%nThe minimum value %d",maximum, minimum);
	}
}