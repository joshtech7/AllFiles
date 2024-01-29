import java.util.*;

public class StudentGrades{
	public static void main(String[] args){
	Scanner scr = new Scanner(System.in);

	String nameCounter = " ";
	int gradesCounter = 0;
	int aCounter = 0;
	int bCounter = 0;
	int cCounter = 0;
	int dCounter = 0;

	for(int count = 1; count <= 5; count++){
	
	System.out.println("Enter your name: ");	
	String studentName = scr.next();
	nameCounter++;

	System.out.print("Input your grades: ");
	int grades = scr.nextInt();
	gradesCounter++;

	switch(grades/10){
	case 9 - 10: 
		;
	aCounter++;
	break;
	case 7 - 8: 
		;
	bCounter++;
	break;
	case 5 - 6: 
		;
	cCounter++;
	break;
	case 3 - 4:
		;
	dCounter++;
	break;
	default: 
	System.out.print("no grades entered!!!");
	}

	}
//System.out.printf("the student names are %s%n", nameCounter);
//System.out.printf("student numbers of grades are %d%n", gradesCounter);
//System.out.printf("the student grades are "A"%d%n "B"%d%n "C"%d%n "D" %d%n", //aCounter, bCounter, cCounter, dCounter);

	
	}
}