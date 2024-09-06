package Step_001.Lec_005;

public class P_005_SumOfFirstNTerms {
    public static void main(String[] args) {

    }
}

class Solution_P_005_SumOfFirstNTerms {
    long sumOfSeries(long n) {
        if (n <= 0) {return 0;}
        return n*n*n + sumOfSeries(n-1);
    }
}

