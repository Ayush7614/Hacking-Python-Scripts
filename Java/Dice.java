import java.util.Random;

/**
 *  Dice class is simulating the behaviour of a dice.
 *  Number of sides is 6 by default but can be changed to imitate many kinds of dices.
 *  Minimum number of sides is 4, to ensure it has a shape suitable for rolling.
 */

public class Dice {

    private int numberOfSides = 6;
    private Random random = new Random();

    /**
     * Returns a pseudorandom int between 1 and numberOfSides inclusively.
     * @return int, the result of rolling the dice.
     */
    public int roll() {
        return random.nextInt(numberOfSides) + 1;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(int numberOfSides) {
        if (numberOfSides > 4) {
            this.numberOfSides = numberOfSides;
        }
    }
}