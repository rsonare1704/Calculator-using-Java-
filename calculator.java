import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of subjects:");
        int numSub = scanner.nextInt();

        int total= 0;
        double avgPer;

        System.out.println("Enter marks obtained (out of 100) for each subject:");
        for (int i = 1; i <= numSub; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = scanner.nextInt();
            total=total+marks;
        }

        avgPer = (double) total / numSub;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Percentage: " + avgPer + "%");

        char grade;
        if (avgPer >= 90) {
            grade = 'A';
        } else if (avgPer >= 80) {
            grade = 'B';
        } else if (avgPer >= 70) {
            grade = 'C';
        } else if (avgPer >= 60) {
            grade = 'D';
        } else if (avgPer >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
