package Step_001.Lec_005;

public class P_007_CheckIfAStringIsPalindromeOrNot {
    public static void main(String[] args) {
        Solution_P_007_CheckIfAStringIsPalindromeOrNot obj = new Solution_P_007_CheckIfAStringIsPalindromeOrNot();
        System.out.println(obj.isPalindrome("race a car"));
    }
}

class Solution_P_007_CheckIfAStringIsPalindromeOrNot {
    public boolean isPalindrome(String s) {
        return isPalindrome(s.toLowerCase(), 0, s.length()-1);
    }

    public boolean isPalindrome(String s, int start, int end) {

        while ( start < end && !((s.charAt(start) >= 'a' && s.charAt(start) <= 'z') || (s.charAt(start) <= '9' && s.charAt(start) >= '0'))) {
            start++;
        }

        while ( start < end && !((s.charAt(end) >= 'a' && s.charAt(end) <= 'z') || (s.charAt(end) <= '9' && s.charAt(end) >= '0'))) {
            end--;
        }

        if (start > end) return true;
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return isPalindrome(s, start + 1, end-1);
    }
}

