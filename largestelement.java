public class largestelement {

    public static int getLargelement(int arr[],int length)
    {
        int max = arr[0];
        int res=0;
      
        for (int i=0;i<length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];//-->for returning the element
                 // to return the index;
                res = i;


            }
            
        }
      //  System.err.println(max);
        return res;
    }

    public static void main(String[] args)
    {
        int arr[] ={3,32,2,64,76,45,5,94,3};
        int length = arr.length;
        int index=getLargelement(arr,length);
        System.err.println(index);
    }
    
}
