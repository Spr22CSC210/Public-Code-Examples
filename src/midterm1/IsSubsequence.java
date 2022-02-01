package midterm1;

public class IsSubsequence {

    public static void main(String[] args) {
        System.out.println(sub("computer", "core"));
        System.out.println(sub("computer", "cope"));
        System.out.println(sub("computer", "computer"));
        System.out.println(sub("", ""));
    }

    public static boolean sub(String s1, String s2) {
        if (s2.isEmpty()) {
            return true;
        } else if (s1.isEmpty()) {
            return false;
        } else if (s1.charAt(0) == s2.charAt(0)) {
            return sub(s1.substring(1), s2.substring(1));
        } else {
            return sub(s1.substring(1), s2);
        }
    }
}