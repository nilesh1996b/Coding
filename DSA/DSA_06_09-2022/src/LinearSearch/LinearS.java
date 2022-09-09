package LinearSearch;

public class LinearS {

    public boolean linearSearch(int[] x, int y)
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

    public static void main(String[] args) {
         int page_number[] = {86,91,34,50,0};
         int key = 2;

         LinearS ob = new LinearS();

         if(ob.linearSearch(page_number,key))
         {
             System.out.println("Search Found");
         }
         else
         {
             System.out.println("Search not found");
         }


    }

}
