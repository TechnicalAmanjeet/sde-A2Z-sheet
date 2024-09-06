package Step_001.Lec_005;

public class P_002_PrintGfgNTimes {
    public static void main(String[] args) {

    }
}

class Solution_P_002_PrintGfgNTimes {
    int count = 0;

    void printGfg(int N) {
        // code here

        if (count == N) {
            return;
        }
        ++count;
        System.out.printf("GFG ");
        printGfg(N);
    }

    void printGfg1(int N) {
        // code here

        if (N-- == 0) {
            return;
        }

        System.out.printf("GFG ");
        printGfg(N);
    }
}
