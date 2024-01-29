import java.util.Scanner;

public class Reversed{
	public static void main(String[] args){
	
	Scanner console = new Scanner(System.in);

	int userInput;

	System.out.print("Enter a number to see it reverse order: ");
	userInput = console.nextInt();

	int temp = userInput;
	int reverse = 0;

	for(;temp > 0; temp++){
	reverse = (temp % 10) + reverse;
	temp /= 10;
	}
System.out.printf("",);
      }
    }





























int remainder = 0;
	
	for(int temp = userInput; temp > 0; temp++){

	remainder = (temp % 10) + reverse;

	temp /= 10

	//int actualValue = remainder / 10;
System.out.printf("%d",remainder);
	}

  }
}