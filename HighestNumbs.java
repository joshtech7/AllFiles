import java.util.Scanner;

public class HighestNumbs{

	public static void main(String[] args){

	 int largest;
	 int smallest = 0;
	 
	int totalCount = 3;
	





	Scanner inputCollector = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int num1 = inputCollector.nextInt();

	System.out.print("Enter second number: ");
	int num2 = inputCollector.nextInt();

	System.out.print("Enter third number: ");
	int num3 = inputCollector.nextInt();

	int sum = num1 + num2 + num3;

	System.out.printf(" The sum is %d%n", sum);

	int average = (int) sum / totalCount;
	System.out.printf(" The Average is %d%n ", average);
	
	int product = num1 * num2 * num3;

	System.out.printf("The product is %d%n", product);

	if(num1 > num2 && num3 > 1 || num1 > num3 && num2 > num2)
	}
	
}
}



