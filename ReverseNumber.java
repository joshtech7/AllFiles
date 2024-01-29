import java.util.Scanner;

public class ReverseNumber{
	public static void main(String[] args){

	Scanner inputCollector = new Scanner(System.in);

	int factorial = 0;
	int reverse= 0;

	System.out.print("Enter an integer: ");
	int number = inputCollector.nextInt();

	for(int count = 1; count <= 10; count++){
	number %= 10;
	reverse = number / 10;
	
	}

  }
}