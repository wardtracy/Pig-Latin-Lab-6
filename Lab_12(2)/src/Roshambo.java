/* create a enumeration named Roshambo that
stores three values: rock, paper and scissors.
 Include a toString method that can covert the
 seleted value to a string.
 */

public enum Roshambo {
    ROCK, PAPER, SCISSORS;

    public String toString() {
        switch (this) {
            case ROCK:
                return "rock";
            case PAPER:
                return "paper";
            case SCISSORS:
                return "scissors";
            default:
                return "";
        }
    }
}
