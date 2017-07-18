import java.util.Random;
import java.util.Scanner;

/**
 * Created by Grand Circus Student on 7/16/2017.
 */
public class DiceRoll {
    public static void rollDice() {
        Scanner scan = new Scanner(System.in);
        Random nunbers = new Random();

        int n;
        int numOfSides;
        int counter;
        int numbOfDice = 2;

        System.out.println("Welcome to Grand Circus Casino!");
        System.out.println("-------------------------------");
        System.out.print("Please enter the number of sides, between 3 and 20, for the pair of dice: ");
        
        do {
            numOfSides = scan.nextInt();
            n = numOfSides;

            for (counter = 0; counter < numbOfDice; ++counter) {
                int x = nunbers.nextInt(n);
            }        ++x;

                System.out.println(x);
                System.out.println("Would you like to roll again? + 'y' + '/' + 'n'");


        }

        }
    }