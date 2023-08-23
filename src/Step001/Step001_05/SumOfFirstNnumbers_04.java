package Step001.Step001_05;

public class SumOfFirstNnumbers_04 {
    public static void main(String[] args) {

    }

    public static long sumFirstN(long n) {
        // Write your code here.

        if (n == 0) {
            return 0;
        }

        return n + sumFirstN(n-1);
    }
}
