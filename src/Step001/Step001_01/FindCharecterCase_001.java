package Step001.Step001_01;

import java.util.Scanner;

public class FindCharecterCase_001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();

        char charUserInput = userInput.charAt(0);

        if (charUserInput >= 'A' && charUserInput <= 'Z')
            System.out.println(1);
        else if (charUserInput >= 'a' && charUserInput <= 'z')
            System.out.println(0);
        else
            System.out.println(-1);


    }
}
