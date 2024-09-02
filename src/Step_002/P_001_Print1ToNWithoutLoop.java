package Step_002;

public class P_001_Print1ToNWithoutLoop {
    public static void main(String[] args) {
        Solution_P_001_Print1ToNWithoutLoop.printNos(100);
    }
}

class Solution_P_001_Print1ToNWithoutLoop
{

    public static void printNos(int N)
    {
        printNosRec(N, 1);
    }

    protected static void printNosRec(int NumberTillPrint, int currentNum) {
        if (NumberTillPrint < currentNum) return;
        System.out.printf(currentNum + " ");
        printNosRec(NumberTillPrint, currentNum + 1);
    }
}

