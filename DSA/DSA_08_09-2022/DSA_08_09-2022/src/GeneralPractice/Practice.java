package GeneralPractice;

import java.util.Arrays;

public class Practice {

    public boolean checkNum(int[] x, int y)
    {
        for(int i = 0; i<x.length; i++)
        {
            if(x[i]==y)
            {
                return true;
            }
        }

        return false;
    }

    //Binary Search Implementation;

    public boolean binaryCheck(int[] x, int y)
    {
        int mid,start = 0, end = x.length-1;

        while (start<=end)
        {
            mid = (start+end)/2;

            if(x[mid]==y)
            {
                return true;
            }else if(x[mid]<y)
            {
                start = mid+1;
            }else {
                end = mid-1;
            }

        }

        return false;

    }
// Insertion Sort ######################################
    public  int[] insertionSort(int[] x)
    {

        int i,index,value;

        for(i = 1; i<x.length; i++)
        {
            value = x[i];
            index = i;
            while(index>0 && x[index-1]>value)
            {
                x[index] = x[index-1];
                index--;
            }

            x[index] = value;
        }

        return x;
    }

//    Selection Sort #####################################################################
    public int[] selectionSort(int[] x)
    {
        for(int i = 0; i<x.length-1; i++)
        {
            for(int j = i+1; j<x.length; j++)
            {
                swap(x, i, j);
            }
        }


        return x;
    }

    public int[] swap(int[] x, int i, int j)
    {
        int temp = x[i];
        x[i] = x[j];
        x[j] = temp;

        return x;
    }

    // Bubble Sort #####################################
    public int[] bubbleSort(int[] x)
    {


        for(int i = 0; i<x.length-1; i++)
        {
            int count = 0;
            for(int j = 0; j<(x.length-1)-i; j++)
            {
                if(x[j]>x[j+1])
                {
                    swap(x, j, j+1);
                    count++;
                }
            }
            if(count==0)
            {
                break;
            }
        }



        return x;
    }

    public static void main(String[] args) {

        Practice ob = new Practice();

        int arr[] = {2,5,3,4,1};

        int value = 1;

        ob.insertionSort(arr);

        System.out.println(Arrays.toString(arr));

        if(ob.binaryCheck(arr,value))
        {
            System.out.println("Number is available");
        }else
        {
            System.out.println("Number is not available");
        }
    }
}
