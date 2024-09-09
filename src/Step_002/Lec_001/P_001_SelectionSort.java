package Step_002.Lec_001;

public class P_001_SelectionSort {
    public static void main(String[] args) {

    }
}

class Solution
{
    int  select(int arr[], int i)
    {
        // code here such that selectionSort() sorts arr[]
        while (i > 0 && arr[i-1] > arr[i]) {
            swap(arr, i, i-1);
            --i;
        }

        return i;
    }

    void selectionSort(int arr[], int n)
    {
        //code here
        for (int i = 1; i < n; i++) {
            select(arr, i);
        }
    }

    void swap(int arr[], int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
