public class largenum {
    public static int largest(int arr[])
    {
        int largest=Integer.MIN_VALUE; //arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        return largest;
    }

    public static int smallest(int arr[])
    {
        int small=Integer.MAX_VALUE; //arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<small)
            {
                small=arr[i];
            }
        }
        return small;
    }

    public static void main(String[] args)
    {
        int arr[]={3,5,6,445,7,4};
        System.err.println("The largest element in array is => "+largest(arr));
        System.err.println("The smallest element in array is => "+smallest(arr));
    
    }
    
}
