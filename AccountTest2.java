import java.util.Scanner;

public class AccountTest2 {


	public static void main(String [] args){
		Account account1 = new Account("jane Green", 50.00);
		Account acount2 = new Account("John Blue", -7.53);
	
		System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

		Scanner input = new Scanner(System.in);

		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance %n%n", depositAmount);
		account1.depost(depositAmount);

		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount);

		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.print("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
	}
}
		
		
		