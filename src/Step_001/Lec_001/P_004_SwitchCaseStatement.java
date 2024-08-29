package Step_001.Lec_001;

import java.util.List;

public class P_004_SwitchCaseStatement {
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

    static double switchCase(int choice, List<Double> arr){
        // code here
        switch (choice) {
            case 1:
                return Math.pow(arr.get(0), 2) * Math.PI;
            case 2:
                return arr.get(0) * arr.get(1);
            default:
                return 0;
        }
    }
}
