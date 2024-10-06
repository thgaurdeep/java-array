public class second_Largestsum {
    public static int second_Largest(int arr[])
    {
        int l1=0;
        int l2=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>l1)
            {
                l2=l1;
                l1=arr[i];  //index ==i;


            }
            else if(arr[i]>l2&&arr[i]!=l1)
            {
                l2=arr[i];

            }
        }
        return l2;

    }

    public static void main(String[] args) {
        int arr[]={2,4,54,66,77,44,99};
        for(int i=0;i<arr.length;i++)
        {
            System.err.print(arr[i]+" ");
        }
        System.err.println();
        System.err.println(second_Largest(arr));
    }
    
}

