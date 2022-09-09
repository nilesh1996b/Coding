package Hash;

import java.util.Arrays;
import java.util.HashMap;

public class HashInsert {
    static final int size = 5;
    int arr[] = new int[size];

    public HashInsert()
    {
        for(int i =0; i<size; i++)
        {
            arr[i] = -1;
        }
    }

    public int insertValue(int value)
    {
        int key = value%size, index = key;

        while(arr[index] != -1)
        {
            index = (index+1)%size;

            if(index==key)
            {
                System.out.println("Hash Table is full for " + value); return 0;
            }
        }

        arr[index] = value; return 0;
    }

    public int deleteValue(int value)
    {
        int key = value%size;
        int index = key;

        while(arr[index] != value)
        {
            index = (index+1)%value;

            if(index==key)
            {
                return 1;
            }

        }

        arr[index] = -1;
        return 0;
    }

    public int searchNumber(int value){

        int key = value%size, index = key;

        while(arr[index] != value)
        {
            index = (index+1)%size;
            if(index==key)
            {
                return 0;
            }
        }
        System.out.println( value + " is available on index " + index);
        return 0;
    }

    public static void main(String[] args) {
        HashInsert ob = new HashInsert();


        ob.insertValue(22);
        ob.insertValue(21);
        ob.insertValue(11);
        ob.insertValue(17);
        ob.insertValue(2);

        System.out.println(Arrays.toString(ob.arr));

        ob.searchNumber(11);
    }
}
