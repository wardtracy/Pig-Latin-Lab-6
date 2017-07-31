public class TheRock extends Player{

    private Roshambo r;


    @Override
    public Roshambo generateRoshambo() {

    r = Roshambo.ROCK;
        return r;
    }
}
