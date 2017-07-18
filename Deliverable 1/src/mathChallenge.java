/**
 * Created by Grand Circus Student on 6/29/2017.
 */
import java.util.Scanner;                               // Enables user input

/*             153  ---> 1       5       3
                       1*1*1 + 5*5*5 + 3*3*3
                         1   +  125  +  27
                                153                     <---  ex. of an Armstrong number: whose sum of the cubes of the
                                                              numbers digit's is equal to the number itself
*/

public class mathChallenge {

    public static void main(String arg[]) {
            Scanner scnr = new Scanner(System.in);      // Set-up to scan characters from: (System.in)

        int n, inputNum, sum = 0, r;

            System.out.println("Enter a Number : ");
            n = scnr.nextInt();                         // Let n = (user input) integer from scanner


            inputNum = n;                               // n being the sum of the cubes of each digit


        while (inputNum!=0) {
             r = inputNum % 10;
             sum = sum + (r * r * r);                    // finding the sum of the cubes of each digit
             inputNum = inputNum / 10;
        }

        if   (sum == n) {
             System.out.println("TRUE");                 // if sum is equal to n, then the statement is true
        }
        else {
             System.out.println("FALSE");                // if sum is not equal to n, then the statement is false
        }

        }

    }