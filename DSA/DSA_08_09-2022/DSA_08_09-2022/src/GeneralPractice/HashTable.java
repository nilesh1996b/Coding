package GeneralPractice;

import java.util.Arrays;

public class HashTable {

    static final int size = 5;
    int arr[] = new int[size];



    public HashTable()
    {
        for(int i = 0; i<size; i++)
        {
            arr[i] = -1;
        }
    }

    public int insertValue(int value)
    {

        int key = value%size,index = key;

        while(arr[index] != -1)
        {
            index = (index+1)%size;

            if(index==key)
            {
                System.out.println("Table is full");
                return 0;
            }
        }

        arr[index] = value;

        return 0;
    }

    public int deleteE(int value)
    {
        int key = value%size,index = key;

        while(arr[index] != value)
        {
            index = (index+1)%size;
            if(index==key)
            {
                return 0;
            }
        }

        arr[index] = -1;
        return 0;
    }

    public boolean search(int value)
    {
        int key = value%size,index=key;

        while(arr[index] != value)
        {
            index = (index+1)%size;
            if(index==key)
            {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        HashTable ob = new HashTable();
        System.out.println(Arrays.toString(ob.arr));
        System.out.println("___________________________");
        ob.insertValue(20);
        ob.insertValue(22);
        ob.insertValue(23);
        System.out.println(Arrays.toString(ob.arr));
        ob.deleteE(23);
        System.out.println(Arrays.toString(ob.arr));

        Boolean x = ob.search(22);

        if(x)
        {
            System.out.println("Number is there");
        }else
        {
            System.out.println("Number is not available");
        }
    }

}
