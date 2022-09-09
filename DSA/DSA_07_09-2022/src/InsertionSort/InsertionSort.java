package InsertionSort;

import java.util.Arrays;

public class InsertionSort {

    public int[] insertionSort(int[] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            int value = arr[i];
            int index = i;
            while(index>0 && arr[index -1]>value)
            {
                arr[index] = arr[index-1];
                index--;
            }

            arr[index] = value;
        }

        return arr;
    }

    public static void main(String[] args) {
        InsertionSort ob = new InsertionSort();
        int arr[] = {5,6,7,3,9,1,2,4};
        ob.insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
