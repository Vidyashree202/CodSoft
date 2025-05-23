import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        int[] marks = new int[numSubjects];
        int total = 0;

        //Input marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextInt();

            //Validate marks
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks entered! Please enter values between 0 to 100.");
                return;
            }
        
            total += marks[i];
        }

        //Calculate average
        double average = (double) total / numSubjects;

        //Grade calculation
        char grade;
        if (average >= 90) grade ='A';
        else if (average >= 80) grade = 'B';
        else if (average >= 70) grade = 'C';
        else if (average >= 60) grade = 'D';
        else if (average >= 50) grade = 'E';
        else grade = 'F';

        // Display resuits
        System.out.println("\n----- Results -----");
        System.out.println("Total Marks       : " + total);
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("grade            : " + grade);

        sc.close();
    }
}





    


