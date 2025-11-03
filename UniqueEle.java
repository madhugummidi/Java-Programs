public class UniqueEle {
    public static void main(String[] args) {
        int[] arr = {1,1,3,2,5,1,2};
        /*int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum^arr[i];
        }
        System.out.println(sum);
        */
        int idx=0;
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            idx++;
            for(int j=0;j<arr.length;j++)
            {
                
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.println(arr[i]+" "+idx);     
            }
        }
    }
}
