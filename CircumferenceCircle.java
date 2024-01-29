import java.util.Scanner;

public class CircumferenceCircle{
	public static void main(String...args){
	
	Scanner inputCollector = new Scanner(System.in); 

	System.out.print("Enter a radius of circle: ");
	int radius = inputCollector.nextInt();
	
	int diameter = 2 * radius;
	
	System.out.printf("  The area is: %.3f%n",(Math.PI * diameter));
	
	}
}