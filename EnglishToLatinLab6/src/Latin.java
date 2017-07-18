import java.util.Scanner;

/**
 * Created by Grand Circus Student on 7/17/2017.
 */
public class Latin {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userWord;
        String input;


    // User greeting and prompt.

        System.out.println();
        System.out.println("eetingsGray! elcomeWay otay hetay igPay atinLay anslatorTray");
        System.out.println("------------------------------------------------------------");
        System.out.println("That is to say:");
        System.out.println();
        System.out.println("Greetings! Welcome to the Pig Latin Translator!");
        System.out.println();
        System.out.println("Please enter a word to translate from English to Pig Latin: ");

    // User input with conversion of uppercase to lowercase consonants.

        userWord = scan.nextLine();
        userWord = userWord.toLowerCase();
        System.out.println(userWord);

    //Declare "vowel" to initialize user input to character index.

    for (int i = 0; i < userWord.length(); i++){
        char vowel = userWord.charAt(i);

    // If input begins with a vowel, add "way" to the end of the word.

    if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
        String newWord = userWord + "way";
        System.out.println("Your word translated into Pig Latin is: " + newWord);
       }

        break;

    // else {
    //}
    // for ()






    }

    }


    }


