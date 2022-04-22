package midterm4;

import java.util.ArrayList;
import java.util.List;

public class DiceSum {

    private static int calls = 0;

    public static void main(String[] args) {
        diceSum(5, 19);
        System.out.println(calls);
    }

    private static void diceSum(int numDice, int desiredSum) {
        diceSumHelper(numDice, desiredSum, new ArrayList<Integer>());
    }

    private static void diceSumHelper(int numDice, int desiredSum,
            List<Integer> soFar) {
        calls++;
        if (numDice == 0) {
            if (desiredSum == 0) {
                System.out.println(soFar);
            }
        } else if (numDice <= desiredSum && numDice * 6 >= desiredSum) {
            for (int i = 1; i <= 6; i++) {
                // Choose
                soFar.add(i);

                // Explore
                diceSumHelper(numDice - 1, desiredSum - i, soFar);

                // Unchoose
                soFar.remove(soFar.size() - 1);
            }
        }
    }

}
