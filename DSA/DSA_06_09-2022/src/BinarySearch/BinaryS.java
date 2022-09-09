package BinarySearch;



public class BinaryS {


    public boolean binarySearch(int[] x, int y)
    {
        int mid, start = 0, end = x.length-1;

        while(start<=end)
        {
            mid = (start+end)/2;

            if(x[mid]==y)
            {
                return true;
            } else if(x[mid]>y)
            {
                end = mid-1;
            } else
            {
                start = mid+1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int page_number[] = {10,23,45,70,90,100,111,123};
        int key = 4;

        BinaryS ob = new BinaryS();

        if(ob.binarySearch(page_number,key))
        {
            System.out.println("Search Found");
        }
        else
        {
            System.out.println("Search not found");
        }
    }
}
