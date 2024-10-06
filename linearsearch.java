
public class linearsearch
{
   public static int linearSea(int arr[],int key,int length)
    {
        for (int i=0;i<length;i++)
        {
            if(arr[i]==key)
            {
                return i;  //return index value
            }
        }
        return -1;


    }



    public static void main(String[] args)
    {
        int arr[] ={1,3,2,32,5,33,45};
        int length = arr.length;
        int key =32;
        
        int index = linearSea(arr,key,length);
        System.err.println(index);

    }
}