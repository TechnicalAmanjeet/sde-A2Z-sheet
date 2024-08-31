package Step_001.Lec_004;

public class P_001_CountDigits {
    public static void main(String[] args) {
        System.out.println(Solution_P_001_CountDigits.countDigitsRecursive(660));
    }
}

class Solution_P_001_CountDigits {
    public static int countDigits(int n){
        int count = 0, number = n;

        while (number>0) {
            if ((number % 10 != 0) && n% (number % 10) == 0) {
                ++count;
            }
            number/=10;
        }

        return count;
    }

    public static int countDigitsRecursive(int n) {
        return countDigitRec(n, n, 0);
    }

    protected static int countDigitRec(int num, int n, int count) {
        if ( n == 0 ) return count;

        if (n%10 != 0 && num % (n%10) == 0) {++count;}
        return countDigitRec(num, n/10, count);
    }

    public static int countDigitsLogrithmic(int n) {
        return (int) Math.log10(n);
    }
}