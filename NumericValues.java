import java.util.Scanner;

public class NumericValues{
	public static void main(String[] args){
	
	int positive = 0;
	int negative = 0;
	int zero = 0;


	Scanner myCollector = new Scanner(System.in);

	System.out.println("Enter a negative, positive or Zero (1, 0, -1) \n");

	System.out.print("Enter first number: ");
	int num1 = myCollector.nextInt();
	
	System.out.print("Enter second number: ");
	int num2 = myCollector.nextInt();

	System.out.print("Enter third number: " );
	int num3 = myCollector.nextInt();

	System.out.print("Enter forth number: ");
	int num4 = myCollector.nextInt();

	System.out.print("Enter fifth number: ");
	int num5 = myCollector.nextInt();
	
	if(num1 > 0){
	positive++;
	}
	else if(num1 < 0){
	negative++;
	}
	if(num1 == 0){
	zero++;
	}

	if(num2 > 0){
	positive++;
	}
	else if(num2 < 0){
	negative++;
	}
	if(num2 == 0){
	zero++;
	}

	if(num3 > 0){
	positive++;
	}
	else if(num3 < 0){
	negative++;
	}
	if(num3 == 0){
	zero++;
	}

	if(num4 > 0){
	positive++;
	}
	else if(num4 < 0){
	negative++;
	}
	if(num4 == 0){
	zero++;
	}

	if(num5 > 0){
	positive++;
	}
	else if(num5 < 0){
	negative++;
	}
	if(num5 == 0){
	zero++;
	}
	 System.out.printf("The positive %d%n the negative values are %d%n the zero result are %d%n", positive, negative, zero);
	}
}

















