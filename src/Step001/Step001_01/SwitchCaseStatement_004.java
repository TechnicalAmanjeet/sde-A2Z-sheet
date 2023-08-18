package Step001.Step001_01;

public class SwitchCaseStatement_004 {
    public static double areaSwitchCase(int ch, double []a) {
        // Write your code here

        switch (ch) {
            case 1:
                return Math.pow(a[0], 2) * Math.PI;
            case 2:
                return a[0] * a[1];
            default:
                return 0;
        }

    }
}
