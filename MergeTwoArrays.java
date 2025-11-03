import java.util.Arrays;
public class MergeTwoArrays {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3};
        int[] arr1 = {4,5,6};
        int[] arr2 = new int[arr.length+arr1.length];
        int p=0;
            for(int j=0;j<arr.length;j++)
            {
                arr2[p]=arr[j];
                p++;
            }
            for(int k=0;k<arr1.length;k++)
            {
                arr2[p]=arr1[k];
                p++;
            }
        //for(int i=0;i<arr2.length;i++)
        //{
            System.out.println(Arrays.toString(arr2));
        //}
    }
}
