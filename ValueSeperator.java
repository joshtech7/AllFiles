import java.util.Scanner;

public class ValueSeperator{
	public static void main(String[] args){

	Scanner inputCollector = new Scanner(System.in);
	
	System.out.print("Enter 5 digit number: ");
	int number = inputCollector.nextInt();

	int firstCollection = number % 10;
	
	int num1 = number / 10;
	
	int secondCollection = num1 % 10;

	int num2 = num1 / 10;

	int thirdCollection = num2 % 10;

	int num3 = num2 / 10;

	int fourthCollection = num3 % 10;

	int num4 = num3 / 10;

	int fifthCollection = num4 % 10;
	
	
	System.out.printf("%d%d%d%d%d", firstCollection, secondCollection,thirdCollection, fourthCollection, fifthCollection);

	
	}
}