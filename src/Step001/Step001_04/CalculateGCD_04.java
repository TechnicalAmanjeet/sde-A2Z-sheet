package Step001.Step001_04;

public class CalculateGCD_04 {
    public static void main(String[] args) {

    }

    public static int calcGCD(int n, int m){
        // Write your code here.

        while (n%m != 0) {
            int temp = n;
            n = m;
            m = temp % m;
        }

        return m;
    }
}

