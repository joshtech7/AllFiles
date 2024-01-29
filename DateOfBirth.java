import java.util.Scanner;

public class DateOfBirth{
	public static void main(String[] args){
	
	Scanner console = new Scanner(System.in);


	int currentYear = 2024;

	System.out.print("Enter year of birth: ");
	int yearOfBirth = console.nextInt();

	int age = currentYear - yearOfBirth;

	System.out.printf("User: %d%nYou are %d years old.",yearOfBirth, age);
	}
}