import java.util.Scanner;


public class SubtractionQuiz{
	public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
	int number1 = (int)(Math.random() * 10);
	int number2 = (int)(Math.random() * 10);
	
	if(number1 > number2){
	int temp = number1;

	number1 = number2;
	number2 = temp;
	}
	System.out.println("What is " + number1 + "-" + number2 + "?");
	
	int answer = scanner.nextInt();

	if(number1 - number2 == answer)
	 System.out.print("You're correct!");
	  else{
	   System.out.println("You're wrong!");
	   System.out.println(number1 + "-" + number2 + " shoulde be " + (number1 - number2));

	}
	}
	}
