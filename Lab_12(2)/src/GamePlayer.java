public class GamePlayer extends Player {

    private Roshambo r;

        @Override
        public Roshambo generateRoshambo() {

        r = Roshambo.values()[(int)(Math.random() * 3)];
        return r;
    }
}
