import java.util.Scanner;

public class ThreeValues{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	int total = 0;
	int totalCounter = 0;

	System.out.print("enter a number press -1 to quit: ");
	int player1 = input.nextInt();
 	
	while(player1 != -1){
	 total += player1;
	 totalCounter += 1;
	System.out.print("Enter a number press 1 to quit: ");
	player1 = input.nextInt();
	}
	if(player1 != 1){
	
	System.out.print("")
	}

}

}