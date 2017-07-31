import java.util.Scanner;


public class Test {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_ELEMENTS = 2;             // Number of elements in array
        int[] userVals = new int[NUM_ELEMENTS]; // User numbers
        int i = 0;                              // Loop index

        System.out.println("Enter " + NUM_ELEMENTS + " integer values...");
        for (i = 0; i < NUM_ELEMENTS; ++i) {
            System.out.print("Value: ");
            userVals[i] = scnr.nextInt();
        }

        System.out.print("You entered: ");
        for (i = 0; i < NUM_ELEMENTS; ++i) {
            System.out.print(userVals[i] + " ");
        }
        System.out.println();

        return;
    }

}
