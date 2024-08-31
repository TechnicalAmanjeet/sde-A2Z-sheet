package Step_001.Lec_004;

public class P_002_EvenlyDivide {
    public static void main(String[] args) {
        System.out.println(Solution_P_002.evenlyDivide(2446));
    }
}

class Solution_P_002 {

    protected static int evenlyDivide(int N) {
        int num = N, count = 0;

        while (num > 0) {
            int divisor = num % 10;
            if (divisor != 0 && N % divisor == 0) {++count;}
            num /= 10;
        }

        return count;
    }
}