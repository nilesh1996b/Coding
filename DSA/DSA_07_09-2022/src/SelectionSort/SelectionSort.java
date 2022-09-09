package SelectionSort;

import java.util.*;
public class SelectionSort {

    public int[] sorting(int[] arr)
    {
        for(int i =0; i<arr.length-1; i++)
        {
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[i]>arr[j]) {
                    swap(i, j, arr);
                }
            }
        }
        return arr;
    }

    public int[] swap(int i, int j, int[] arr)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    public static void main(String[] args) {
        SelectionSort ob = new SelectionSort();
        int arr[] = {2,5,3,1,4,6};

        ob.sorting(arr);
        System.out.println(Arrays.toString(arr));

    }
}
