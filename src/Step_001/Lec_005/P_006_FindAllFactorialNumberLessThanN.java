package Step_001.Lec_005;

import java.util.ArrayList;

public class P_006_FindAllFactorialNumberLessThanN {
    public static void main(String[] args) {
        System.out.println(Solution_G_006_FindAllFactorialNumberLessThanN.factorialNumbers(2));
    }
}

class Solution_G_006_FindAllFactorialNumberLessThanN {
    static ArrayList<Long> arrayList = new ArrayList<Long>();
    static long count = 1, factorial = 1;

    static ArrayList<Long> factorialNumbers(long n) {
        factorial = factorial * count++;

        if (factorial > n) {return arrayList;}
        arrayList.add(factorial);
        return factorialNumbers(n);
    }
}
