import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create the menu
        System.out.println("Main Menu");
        System.out.println("1. Create class list");
        System.out.println("2. Provide marks for a subject");
        System.out.println("3. Get grade statistics for a subject");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected Option 1");

                // Initialize the array to store student IDs
                int[] studentIDs = new int[10];
                int i = 0;
                while (i < 10) {
                    System.out.print("Enter the student ID: ");
                    int studentID = sc.nextInt();
                    studentIDs[i] = studentID;
                    i++;
                }
                break;
            case 2:
                System.out.println("You selected Option 2");

                // Initialize the ArrayList to store marks for a subject
                ArrayList<Integer> marks = new ArrayList<Integer>();
                System.out.print("Enter the subject: ");
                String subject = sc.next();

                int j = 0;
                while (j < 10) {
                    System.out.print("Enter the marks for " + subject + ": ");
                    int mark = sc.nextInt();
                    // Validate the input
                    if (mark >= 0 && mark <= 100) {
                        marks.add(mark);
                        j++;
                    } else {
                        System.out.println("Invalid mark. Please enter a value between 0 and 100.");
                    }
                }
                break;
            case 3:
                System.out.println("You selected Option 3");
                break;
            case 4:
                System.out.println("Exiting ...");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}
