package midterm4;

import java.util.TreeSet;

public class Combinations {
    public static void main(String[] args) {
        combos("GOOGLE", 3);
    }

    private static void combos(String s, int k) {
        TreeSet<String> solutions = new TreeSet<String>();
        combosHelper(s, k, "", solutions);
        System.out.println(solutions);
    }

    private static void combosHelper(String s, int k, String soFar,
            TreeSet<String> solutions) {
        if (soFar.length() == k) {
            solutions.add(soFar);
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (!soFar.contains(s.substring(i, i + 1))) {
                    combosHelper(s.substring(0, i) + s.substring(i + 1), k,
                            soFar + s.substring(i, i + 1), solutions);
                }
            }
        }
    }
}
