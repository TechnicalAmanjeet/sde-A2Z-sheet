package Step_001.Lec_001;

import java.util.Scanner;

public class P_005_NthFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 1 || n == 2) {
            System.out.println(1);
            return;
        }

        int prev = 1, curr = 1, temp = 0;

        while (--n >= 2) {
            temp = prev + curr;
            prev = curr;
            curr = temp;
        }

        System.out.println(curr);
    }
}
