package midterm1;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("step on no pets"));
        System.out.println(isPalindrome("java"));
        System.out.println(isPalindrome("byebye"));
    }

    /*
     * Remember this example showed that recursion and iteration can both
     * be used to solve some of the same problems. It isn't the case that one
     * is better than the other. In fact, for the below problem, I think there
     * are better solutions, like the one discussed in class. Take the string
     * 's',
     * flip it, and then compare it to the original string to see if it is a
     * palindrome.
     */
    public static boolean isPalindrome(String s) {
        if (s.length() < 2) {
            return true;
        } else if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }

}
