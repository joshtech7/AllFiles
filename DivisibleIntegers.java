import java.util.Scanner;

public class DivisibleIntegers{
		public static void main(String[] args){

		int odd = 0; 
		Scanner myCollector = new Scanner(System.in);

		for(int u = 1;u <= 30; u++){
		System.out.print("Enter integer values: ");
		int userInput = myCollector.nextInt();
		
		if(userInput % 3 == 0){
		odd = userInput;
		}
		}
		System.out.printf("The result for odd is %d", odd);
	}
}