import java.util.Scanner;

public class SalesComCal{

	public static void main(String[] args){
	
	Scanner inputCollector = new Scanner(System.in);

         int item = 0;
	 double plus = 0.09;
	 int WKLBonus = 200;

	
	System.out.println("Enter the value of item: ");
 	item = inputCollector.nextInt();
	 
	System.out.print("Enter the value: ");
	double value = inputCollector.nextDouble();

	double lastWeek = (double) (value * plus) + WKLBonus;
	System.out.printf("The calculation for last week sales person's is %.2f%n", lastWeek);

	while(item != -1){

	item++;
	value++;
	System.out.println("Enter the value of item: ");
 	item = inputCollector.nextInt();
	 
	System.out.print("Enter the value: ");
	value = inputCollector.nextDouble();

	lastWeek = (double) (value * plus) + WKLBonus;
	System.out.printf("The calculation for the last week sales person's is %.2f%n", lastWeek);
	}
}
}
