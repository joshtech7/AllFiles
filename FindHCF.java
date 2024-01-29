import java.util.Scanner;

public class FindHcf{
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
     
        int dividend;
	int divisor;
        int remainder = 0;
	int hcf = 0;
        
        System.out.print("Enter the first number: ");
        dividend = console.nextInt();
        
        System.out.print("Enter the second number: ");
        divisor = console.nextInt();        
        
        do{
            remainder = dividend % divisor;
            
            if(remainder == 0){
                hcf = divisor;
            }
	    else{
            
                dividend = divisor;
                divisor = remainder;
	    }
            
        }while(remainder != 0);

        System.out.printf("HCF: %d",  hcf);
    }  
}