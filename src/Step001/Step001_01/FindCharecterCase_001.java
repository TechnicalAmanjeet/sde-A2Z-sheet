package Step001.Step001_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FindCharecterCase_001 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        takeInputFromBufferReaderClass();
        takeInputTwoIntegerAndReturnItsSum(sc);
        System.out.printf("Please Enter something: ");
        String userInput = sc.next();

        char charUserInput = userInput.charAt(0);

        if (charUserInput >= 'A' && charUserInput <= 'Z')
            System.out.println(1);
        else if (charUserInput >= 'a' && charUserInput <= 'z')
            System.out.println(0);
        else
            System.out.println(-1);

    }

    // Using scanner class to take input.
    public static void takeInputTwoIntegerAndReturnItsSum(Scanner sc) {
        System.out.print("Please Enter First Integer: ");
        int firstInt = sc.nextInt();
        System.out.print("Please Enter Second Integer: ");
        int secondInt = sc.nextInt();

        System.out.printf(String.valueOf(firstInt + secondInt) + " \n");
    }

    // using buffer reader to take input.
    public static void takeInputFromBufferReaderClass() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in); // --> converts raw byte based stream to char based input stream.
        BufferedReader br = new BufferedReader(isr); // --> now it provides methods like readlines() read() etc to process input data.

        System.out.print("Please Enter any value: ");
        String str = br.readLine();
        System.out.println(String.valueOf(str));

        System.out.printf("Please Enter first integer: ");
        int firstInt = Integer.parseInt(br.readLine());
        System.out.printf("Please Enter second integer: ");
        int secondInt = Integer.parseInt(br.readLine());
        System.out.printf(String.valueOf(firstInt + secondInt) + " \n");
    }
}
