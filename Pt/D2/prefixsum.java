public class prefixsum {
      public static void main(String[] args) {
        
        int[] arr={3,7,9,2,5};
        int[] presum= new int[5];
        presum[0]=arr[0];
        for (int i=1;i<5;i++)
        {
            presum[i]=presum[i-1]+arr[i];
        }
        
        int j=0;

        while(j<5)
        {
            System.out.println(presum[j]);
            j++;
            

        }


    }
    
}
    

