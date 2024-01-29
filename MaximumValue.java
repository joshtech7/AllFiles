import java.util.Scanner;

public class MaximumValue{
	public static void main(String[] args){
	
	Scanner myCollector = new Scanner(System.in);

	System.out.print("Enter a number to find the max value: ");
	double number1 = myCollector.nextDouble();
	double number2 = myCollector.nextDouble();
	double number3 = myCollector.nextDouble();

	double result = maximum(number1, number2, number3);

	System.out.printf("The maximum value is: %.2f", result);
	

	public static double maximum(double x, double y, double z){
	double maximumValue = x;
	if(y > maximumValue){
	maximumValue = y;
	}
	if(z > maximumValue){
	maximumValue = z;
	}
	return maximumValue;
	}
}