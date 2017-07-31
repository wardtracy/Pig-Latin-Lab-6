import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double length    = 0.0;
        double width     = 0.0;
        double perimeter = 0.0;
        double area      = 0.0;
        char   quoteMark = '"';

        Scanner scan = new Scanner(System.in);


        // Length, width, perimeter and area of "The Snug"

        System.out.print("Please enter the length of " + quoteMark + "The Snug" +  quoteMark + " classroom: ");
        length = scan.nextDouble();

        System.out.print("Please enter the width of " + quoteMark + "The Snug" +  quoteMark + " classroom: ");
        width = scan.nextDouble();

        perimeter = ((2 * length) + (2 * width));
        area      = (length * width);

        System.out.println("The perimeter of the  \"The Snug\" is: ");
        System.out.println(perimeter);

        System.out.println("The area of the " + quoteMark + "The Snug" +  quoteMark + " is: ");
        System.out.println(area);
        System.out.println();


        // Length, width, perimeter and area of "The Penthouse"

        System.out.print("Please enter the length of " + quoteMark + "The Penthouse" +  quoteMark + " classroom: ");
        length = scan.nextDouble();

        System.out.print("Please enter the width of " + quoteMark + "The Penthouse" +  quoteMark + " classroom: ");
        width = scan.nextDouble();

        System.out.println("The perimeter of the " + quoteMark + "The Penthouse" +  quoteMark + " is: ");
        System.out.println(perimeter);

        System.out.println("The area of the " + quoteMark + "The Penthouse" +  quoteMark + " is: ");
        System.out.println(area);

        System.out.println("Would you like to calculate the volume of the classrooms?" +
                " Press " + quoteMark + "Y" + quoteMark + " for Yes or " + quoteMark + "N" + quoteMark + " for No");
    }
}
