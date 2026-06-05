import java.util.*;

public class binary 
{
    public static void main(String[] args) 
    {
        int[] arr={12,34,56,76,90,99};
        int key=56;

        int r=binary(arr, key);
        if (r == -1) 
        {
            System.out.println("Not found");
        } 
        else 
        {
            System.out.println("Found at index " + r);
        }
        
    }
    public static int binary(int arr[],int key)
    {
        int r,l,i;
        r=arr.length-1;
        l=0;
        

        for (i=l;i<r;i++)
        {
            int mid=(r+l)/2;
            if (arr[mid]==key)
            {
                return mid;
            }
            else if (arr[mid]<key)
            {
                l=mid;

            }
            else if (arr[mid]>key)
            {
                r=mid;
            }
        }
        return -1;
    }
    
}
