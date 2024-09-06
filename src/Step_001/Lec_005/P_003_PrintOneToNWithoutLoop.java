package Step_001.Lec_005;

public class P_003_PrintOneToNWithoutLoop {
    public static void main(String[] args) {

    }
}

class Solution_P_003_PrintOneToNWithoutLoop
{
    int count = 1;
    public void printNos1(int N)
    {
        if (count > N) return;
        System.out.printf(count++ + " ");
        printNos1(N);
    }

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