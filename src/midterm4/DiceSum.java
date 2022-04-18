package midterm4;

import java.util.ArrayList;
import java.util.List;

public class DiceSum {

    public static void main(String[] args) {

    }

    private static void diceRoll(int numDice) {
        diceRollHelper(numDice, new ArrayList<Integer>());
    }

    private static void diceRollHelper(int numDice, List<Integer> soFar) {
        if (numDice == 0) {
            System.out.println(soFar);
        } else {
            for (int i = 1; i <= 6; i++) {
                // Choose
                soFar.add(i);

                // Explore
                diceRollHelper(numDice - 1, soFar);

                // Unchoose
                soFar.remove(soFar.size() - 1);
            }
        }
    }

}
