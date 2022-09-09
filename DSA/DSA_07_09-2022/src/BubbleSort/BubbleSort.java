package BubbleSort;



import SelectionSort.SelectionSort;

import java.util.Arrays;

public class BubbleSort extends SelectionSort {

    int count;
    public int[] bubbleSort(int[] arr)
    {
        for(int i = 0; i<arr.length-1; i++)
        {
            for(int j = 0; j<(arr.length-1)-i; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap(j,j+1,arr);
                    count++;
                }
            }

            if(count==0)
            {
                break;
            }
        }

        return arr;
    }



    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        int arr[] = {100,50,30,20,60,40};

        ob.bubbleSort(arr);

        System.out.println(Arrays.toString(arr));

    }
}
