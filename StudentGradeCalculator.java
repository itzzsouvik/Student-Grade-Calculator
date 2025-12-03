import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        int total = 0;

        // Taking marks input with validation
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of subject " + (i + 1) + " (0 to 100): ");
            marks[i] = sc.nextInt();

            // Validate mark
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid mark! Marks should be between 0 and 100.");
                return;  // Stop the program
            }

            total += marks[i];
        }

        // Calculate percentage
        double percentage = (double) total / n;

        // Determine Grade
        char grade;
        if (percentage >= 90) grade = 'A';
        else if (percentage >= 80) grade = 'B';
        else if (percentage >= 70) grade = 'C';
        else if (percentage >= 60) grade = 'D';
        else grade = 'F';

        // Output
        System.out.println("\n----- Report Card -----");
        System.out.println("Total Marks = " + total + " / " + (n * 100));
        System.out.println("Percentage = " + percentage + "%");
        System.out.println("Grade = " + grade);

        sc.close();
    }
}
