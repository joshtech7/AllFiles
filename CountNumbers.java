import java.util.Scanner;


public class CountNumbers
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int number,          
            countPositive = 0, 
            countNegative = 0,
            countZero = 0;

        char choice;
	
        do{
            System.out.print("Enter the number ");
            number = console.nextInt();
        
            if(number > 0){
                countPositive++;
            }
            else if(number < 0)
            {
                countNegative++;
            }
            else
            {
                countZero++;
            }
        
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);
            
        }while(choice=='N' || choice == 'Y');
        
        System.out.printf("Positive numbers: %d", countPositive);
        System.out.printf("Negative numbers: %d", countNegative);
        System.out.println("Zero numbers: %d", countZero);
    }  
}