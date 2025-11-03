import java.util.Arrays;
public class duplicateele {
    public static void main(String[] args)
    {
        int[] arr = {1,1,2,3,3,5,7,8,8};
        int[] arr1 = new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length-1;i++)
        {
                if(arr[i]!=arr[i+1])
                {
                    arr1[k]=arr[i];
                    k++;
                }
        }
        arr1[k]=arr[arr.length-1];
        for(int n=0;n<=k;n++)
        {
            System.out.print(arr1[n]+" ");
        }
        //System.out.print(Arrays.toString(arr1));
    }
}
