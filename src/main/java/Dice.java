import java.util.Map;
import java.util.Random;

public abstract class Dice {
    //    static int die = 1;
//    static Random roll = new Random(die);
    static int die = (int) (Math.random() * 6 + 1);
    int[] probabilities;
    int sides;

    public Dice(int[] prob, int sides) {
        this.probabilities = prob;
        this.sides = sides;
    }


    public int Roll() {
        int x = (int) (Math.random() * this.sides + 1);
        return x;
    }

    public void setProbabilities() {
        this.probabilities = probabilities;
        weightedSides();
    }


    public void weightedSides() {
        int[] list = new int[0];

        for (int i = 1; i <= this.sides; i++) {
            for (int index = 0; index < this.probabilities[i - 1]; index++) {
                //push values in the array
            }
        }
    }
}