package Step001.Step001_05;

public class IsPelindrome_06 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abbcba"));
    }

    public static boolean isPalindrome(String str) {
        // Write your code here.

        if (str.length() == 1) return true;

        if (str.charAt(0) != str.charAt(str.length()-1)) return false;

        str = str.substring(1, str.length()-2);
        return isPalindrome1(str);
    }

    public static boolean isPalindrome1(String str) {
        // Write your code here.

        return str.equals(reverseString(0, str));
    }

    private static String reverseString(int i, String str) {
        if (i == (str.length()/2) - 1) {
            return swapString(str, i, (str.length() - i - 1));
        }

        str = swapString(str, i, (str.length() - i- 1));
        return reverseString(++i, str);
    }

    private static String swapString(String str, int si, int ei) {
        StringBuilder newString = new StringBuilder(str);
        char temp = str.charAt(si);
        newString.setCharAt(si, str.charAt(ei));
        newString.setCharAt(ei, temp);
        return newString.toString();
    }
}
