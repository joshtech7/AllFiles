import java.util.Scanner;

public class SumOfASeries{
	public static void main(String[] args){
	
	Scanner myCollector = new Scanner(System.in);
	
	System.out.println("to see the accumulations of values to each other");

	int range = 10;
	int sum = 0;
	for(int count = 1; count < range; count++){
	System.out.println("Enter a number: ");
	long userInput = myCollector.nextLong();
	sum += count;
	}
System.out.printf("the summation of 10 is: %d", sum);
	}
} 