package Step001.Step001_05;

public class PrintNTimes_02 {
    public static void main(String[] args) {

    }

    public static void printNtimes(int n){
        // Write your code here.
        if (n == 0) {
            System.out.print("Coding Ninjas ");
            return;
        }

        printNtimes(n-1);
    }
}
