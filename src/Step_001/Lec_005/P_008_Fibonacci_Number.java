package Step_001.Lec_005;

public class P_008_Fibonacci_Number {
    public static void main(String[] args) {

    }
}

class Solution_P_008_Fibonacci_Number {
    public int fib(int n) {
        if (n == 0) {return 0;}
        if (n== 1) {return 1;}

        return fib(n - 1) + fib(n - 2);
    }
}

