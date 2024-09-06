package Step_001.Lec_005;

public class P_004_PrintNToOneWtLoop {
    public static void main(String[] args) {

    }
}

class Solution_P_004_PrintNToOneWtLoop {

    void printNos(int N) {
        // code here
        if (N == 0) return;
        System.out.print(N-- + " ");
        printNos(N);
    }
}
