package Step001.Step001_04;

public class SumOfAllDivisiors_06 {
    public static void main(String[] args) {

    }

    public static int sumOfAllDivisors(int n){
        // Write your code here.
        int sumOfAllDivisors = 0;

        while (n > 0) {
            sumOfAllDivisors += sumOfDivisior(n);
            --n;
        }

        return sumOfAllDivisors;
    }

    private static int sumOfDivisior(int n) {
        int sumOfAllDivisors = 0;

        int i = 1;
        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                sumOfAllDivisors += i;
                if (i != (n/i)) {
                    sumOfAllDivisors += (n/i);
                }
            }
            ++i;
        }

        return sumOfAllDivisors;
    }
}


class SolutionSumOfDivisirs {
    static final int mod = 1000000007;

    // Functions returns sum
// of numbers from 1 to n
    public static int linearSum(int n)
    {
        return (n * (n + 1) / 2) % mod;
    }

    // Functions returns sum
// of numbers from a+1 to b
    public static int rangeSum(int b, int a)
    {
        return (linearSum(b) -
                linearSum(a)) % mod;
    }

    // Function returns total
// sum of divisors
    public static int totalSum(int n)
    {

        // Stores total sum
        int result = 0;
        int i = 1;

        // Finding numbers and
        //its occurrence
        while(true)
        {

            // Sum of product of each
            // number and its occurrence
            result += rangeSum(n / i,
                    n / (i + 1)) *
                    (i % mod) % mod;

            result %= mod;

            if (i == n)
                break;

            i = n / (n / (i + 1));
        }
        return result;
    }

    public static int sumOfAllDivisors(int n){

        // Write your code here.
        return totalSum(n);

    }

}