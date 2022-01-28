package midterm1;

public class DigitSum {

    public static void main(String[] args) {
        System.out.println(digitSum(1729));
    }

    public static int digitSum(int n) {
        if (n < 0) {
            return digitSum(-n);
        } else if (n < 10) {
            return n;
        } else {
            int lastDigit = n % 10;
            int remainingDigits = n / 10;
            return lastDigit + digitSum(remainingDigits);
        }
    }

}
