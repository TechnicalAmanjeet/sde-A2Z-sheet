package Step_001.Lec_001;

    import java.util.Scanner;

public class P_006_SumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), sumOfEven = 0, sumOfOdd = 0;


        while (number != 0) {
            if (number % 2 == 0)
                sumOfEven += number % 10;
            else
                sumOfOdd += number % 10;

            number /= 10;
        }

        System.out.printf(sumOfEven + " " + sumOfOdd);
    }
}
