package midterm4;

public class BinaryNumbers {
    public static void main(String[] args) {
        printBinary(6, "", 50);
    }

    /*
     * 15 -> 1111 -> 2^3 + 2^2 + 2^1 + 2^0
     * 35 -> 100011 -> 2^5 + 2^1 + 2^0
     * 50 -> 110010 -> 2^5 + 2^4 + 2^1
     */
    private static void printBinary(int bits, String soFar, int desiredValue) {
        if (bits == 0) {
            if (convertToDecimal(soFar) == desiredValue) {
                System.out.println(soFar);
                return;
            }
        } else {
            printBinary(bits - 1, "0" + soFar, desiredValue);

            printBinary(bits - 1, "1" + soFar, desiredValue);
        }
    }

    private static int convertToDecimal(String bits) {
        int value = 0;
        bits = new StringBuilder(bits).reverse().toString();
        for (int i = 0; i < bits.length(); i++) {
            if (bits.charAt(i) == '1') {
                value += Math.pow(2, i);
            }
        }
        return value;
    }
}
