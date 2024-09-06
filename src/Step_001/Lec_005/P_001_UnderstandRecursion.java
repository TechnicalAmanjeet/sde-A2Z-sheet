package Step_001.Lec_005;

public class P_001_UnderstandRecursion {
    public static void main(String[] args) {

    }
}

class Solution
{

    public void printNos(int N)
    {
        //Your code here
        printNosRec(N, 1);
    }

    protected static void printNosRec(int NumberTillPrint, int currentNum) {
        if (NumberTillPrint < currentNum) return;
        System.out.printf(currentNum + " ");
        printNosRec(NumberTillPrint, currentNum + 1);
    }
}
