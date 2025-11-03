import java.util.Arrays;
public class arrays {
    public static void main(String[] args)
    {
        int[] arr = {3,4,14,12};
        int[] arr1 = {13,1,2,7};
        int[] arr2 = new int[arr.length+arr1.length];
        // int x =0;
        // for(int i=0;i<arr.length;i++)
        // {
        //     arr2[x]=arr[i];
        //     x++;
        // }
        // for(int j=0;j<arr1.length;j++)
        // {
        //     arr2[x]=arr1[j];
        //     x++;
        // }
        for(int n=0;n<arr.length;n++)
        {
            for(int m=n+1;m<arr.length-n;m++)
            {
                int temp=0;
                if(arr[n]>arr[m])
                {
                    temp=arr[n];
                    arr[n]=arr[m];
                    arr[m]=temp;
                }
            }
            System.out.println(arr[n]);
        }
        //Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr));
    }
}
