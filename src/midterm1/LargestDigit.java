package midterm1;

public class LargestDigit {
    public static void main(String[] args) {
        System.out.println(largestDigit(8342116));
        System.out.println(largestDigit(40109));
        System.out.println(largestDigit(-163505));
    }

    // The recursive leap of faith
    public static int largestDigit(int n) {
        if (n < 0) {
            return largestDigit(-n);
        }
        if (n == 0) {
            return 0;
        }
        int lastDigit = n % 10; // 9
        int remainingDigits = n / 10; // 4010
        return Math.max(lastDigit, largestDigit(remainingDigits));
    }
}
