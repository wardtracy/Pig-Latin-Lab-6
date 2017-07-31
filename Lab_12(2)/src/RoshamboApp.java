import java.util.Scanner;

public class RoshamboApp extends Player {

    public static void main(String[] args) {
        String name = "";
        String gamePlayer = "";

        System.out.println("Welcome to Roshambo!!! (AKA: Rock, Paper, Scissors)");
        System.out.println("***************************************************");
        System.out.println();

        Scanner scan1 = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        name = scan1.next();

        System.out.println("Who would you like to play against: \"The Rock\" or \"The Random\"");

        System.out.println();


    }

    @Override
    public Roshambo generateRoshambo() {
        return null;
    }


}
