public class linears {
    public static void main(String[] args) {
        int max=-1000;
        int[] arr={12,45,-90,98,44};
        for (int i=0;i<5;i++)
        {
            if (max>arr[i])
            {
                max=arr[i];
            }
            
        }
        System.out.println(max);


    }
    
}
