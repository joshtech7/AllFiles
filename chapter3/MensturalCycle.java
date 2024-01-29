import java.time.LocalDate;
import java.util.Scanner;

public class MenstrualCycleTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menstrual Cycle Tracker");

        // Get the last menstrual period start date
        System.out.print("Enter the last menstrual period start date (YYYY-MM-DD): ");
        String lastPeriodStartDateString = scanner.next();
        LocalDate lastPeriodStartDate = LocalDate.parse(lastPeriodStartDateString);

        // Calculate the average menstrual cycle length
        int cycleLength = getAverageCycleLength();

        // Predict the next ovulation date
        LocalDate ovulationDate = lastPeriodStartDate.plusDays(cycleLength - 14);

        System.out.println("Next predicted ovulation date: " + ovulationDate);

        // You can extend this program to include more features like symptom tracking, reminders, etc.

        scanner.close();
    }

    private static int getAverageCycleLength() {
        Scanner scanner = new Scanner(System.in);

        // Get the user's average menstrual cycle length
        System.out.print("Enter your average menstrual cycle length in days: ");
        int cycleLength = scanner.nextInt();

        scanner.close();

        return cycleLength;
    }
}
