package Step001.Step001_04;

public class PrimeNumber_07 {
    public static void main(String[] args) {

    }

    class Solution {

        public static String isPrime(int num) {

            //Your code goes here

            if(num==0 || num==1){

                return "NO";

            }





            for(int i=2;i<=Math.sqrt(num);i++){

                if(num%i==0){

                    return "NO";

                }

            }

            return "YES";

        }

    }
}
