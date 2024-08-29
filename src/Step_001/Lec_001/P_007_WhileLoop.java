package Step_001.Lec_001;

public class P_007_WhileLoop {
    public static void main(String[] args) {
        Geeks geeks = new Geeks();

        geeks.printTable(2);
    }
}

class Geeks {
    static void printTable (int n)
    {
        int multiplier=10;
        while(multiplier>0)
        {
            System.out.print(String.valueOf(multiplier*n) + " ");
            --multiplier;
        }
        System.out.println();
    }

}
