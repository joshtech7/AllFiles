import java.util.Scanner;

public class LoopText{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter a number to loop: ");
	int loop = scanner.nextInt();

	for(;loop <= 10;loop++){
	System.out.printf("%d ", loop);
	}


	}
}