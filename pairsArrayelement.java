public class pairsArrayelement {
    public static void pair(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int curr = arr[i];
            for(int j= i+1;j<arr.length;j++)
            {
                System.err.print("("+curr+","+arr[j]+")");
            }
            System.err.println();
        }
    }

    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6};
        pair(arr);
    }
   
    
}
