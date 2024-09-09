package Step_002.Lec_001;

public class P_003_InsertionSort {
    public static void main(String[] args) {

    }
}

class Solution_P_003_InsertionSort
{
    static void insert(int arr[],int i)
    {
        // Your code here
        for (int j= i+1; j<arr.length; j++) {
            if(arr[j]<arr[i]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    //Function to sort the array using insertion sort algorithm.
    public void insertionSort(int arr[], int n)
    {
        for (int i = 0; i < n; i++) {
            insert(arr, i);
        }
    }
}