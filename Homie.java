import java.util.Scanner;

public class Homie{
    public static void main(String[] args){
    
    int totalCount = 3;
    int largest = integer.MIN_VALUE;
    int smallest = 0;
    
    Scanner myCollector = new Scanner(System.in);
    
    System.out.print("Enter first number: ");
    int num1 = myCollector.nextInt();
    
    System.out.print("Enter second number: ");
    int num2 = myCollector.nextInt();
    
    System.out.print("Enter third number: ");
    int num2 = myCollector.nextInt();
    
    int sum = num1 + num2 + num3;
    
    int productValue = num1 * num2 * num3;
    
    int average = sum / totalCount;
    
    if(num1 < largest){
    largest++;
    }
    if(num2 < largest){
    largest++;
    }
    if(num3 < largest){
    largest++;
    }
    System.out.printf("The result for largest is %d%n The result for the smallest number is %d", largest, smallest);
    }
}