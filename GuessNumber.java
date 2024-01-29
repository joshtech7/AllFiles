import java.util.Scanner;

public class GuessMyNumber{

    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        
        int number = 0;
        int guess = 0; 
        int tries = 0; 
	char c;
       
        number = (int) (Math.random() * 100) + 1;
        
        System.out.println("Guess My Number Game");
        System.out.println();
        
        do{
            System.out.print("Enter a guess between 1 and 100 : ");
            guess = console.nextInt();
                
            tries++;
                
        if (guess > number){

            System.out.println("Too high! Try Again");
        }
        else if (guess < number){
            System.out.println("Too low! Try Again");
        }
        else
        {
	    System.out.println("Correct! You got it in " + tries + " guesses!");
        }
        
        }while (guess != number);
    }  
}