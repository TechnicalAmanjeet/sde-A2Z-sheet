package Step001.Step001_04;

public class CountDigit_01 {
    public static void main(String[] args) {
        System.out.println(countDigits(35));
    }

    public static int countDigits(int n){
        // Write your code here.
        int count = 0, number = n;

        while (number>0) {
            if ((number % 10 != 0) && n% (number % 10) == 0) {
                ++count;
            }
            number/=10;
        }

        return count;
    }
}
