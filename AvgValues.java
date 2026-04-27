// Programming Exercise - Average Values

// Write a Java program to calculate the average of several numbers entered by the user. The program should do the following:

// Ask the user how many values he or she wants to enter.
// Read that number of integer values from the user.
// Calculate the average of all the entered values.
// Display the result exactly as shown in the sample output.

// Sample Execution:
// textHow many values to enter? 5
// Value? 10
// Value? 24
// Value? 20
// Value? 9
// Value? 18
// Average = 16.2
// Requirements:

// Use exactly these prompts:
// "How many values to enter? "
// "Value? "

// The final output must be exactly: "Average = " followed by the average value.
// You may assume the user will enter a positive integer for the number of values and valid integers for each value.
// Use double to calculate the average so that decimal results can be shown.

// Answer:
import java.util.*;

public class AvgValues {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("How many values to enter? ");
        int n = kb.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Value? ");
            int value = kb.nextInt();
            sum += value;
        }

        double average = (double) sum / n;
        
        System.out.println("Average = " + average);
    }
}