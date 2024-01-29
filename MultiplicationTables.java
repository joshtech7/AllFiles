import java.util.Scanner;

public class MultiplicationTables{

	public static void main(String[] args){

	  Scanner obj = new Scanner(System.in);

	  System.out.print("Enter a number to get the time table: ");
	  int userInput = obj.nextInt();

	  for(int count = 1 ;count <= 12; count++){
    System.out.printf("%d X %d = %d%n",userInput, count, (userInput * count));
    }
  }
}