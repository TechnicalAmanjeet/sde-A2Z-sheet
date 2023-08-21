package Step001.Step001_04

import java.util.Scanner;

class CheckArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println(number == ArmstrongOfNumber(number));;
    }

    private static int ArmstrongOfNumber(int number) {
        int numberOfDigit = (int) (Math.floor(Math.log10(number)) + 1);
        int armstrongNumber = 0;

        while (number > 0) {
            armstrongNumber += Math.pow((number%10), numberOfDigit);
            number /= 10;
        }

        return armstrongNumber;
    }
}