import java.util.Scanner;

public class HighestScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        
        int highestScore = 0;
        String studentWithHighestScore = "";
        
        for (int j = 0; j < numStudents; j++) {
            System.out.print("Enter the name of student " + (j+1) + ": ");
            String name = input.next();
            System.out.print("Enter the score of student " + (j+1) + ": ");
            int score = input.nextInt();
            
            if (score > highestScore) {
                highestScore = score;
                studentWithHighestScore = name;
            }
        }
        
        System.out.println("The student with the highest score is: " + studentWithHighestScore);
    }
}