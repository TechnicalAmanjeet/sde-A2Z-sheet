package Step001.Step001_04;

public class PalindroneNumber_03 {
    public static void main(String[] args) {

    }

    public static boolean palindromeNumber(int n){
        // Write your code here.

        return n == ReverseNumber(n);
    }

    private static int ReverseNumber(int n) {
        int reverseNumber = 0;

        while (n > 0) {
            reverseNumber = (reverseNumber * 10) + (n%10);
            n /= 10;
        }

        return reverseNumber;
    }


}

class Solution_9 {
    public boolean isPalindrome(int x) {
        return x == ReverseNumber(x);
    }

    private int ReverseNumber(int n) {
        int reverseNumber = 0;

        while (n > 0) {
            reverseNumber = (reverseNumber * 10) + (n%10);
            n /= 10;
        }

        return reverseNumber;
    }
}
