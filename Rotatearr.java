import java.util.Arrays;

public class Rotatearr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr1 = new int[arr.length];
        int d = 2;
        int c=0;
        for(int i=d;i<arr.length;i++)
        {
            arr1[c++]=arr[i];
            System.out.println(Arrays.toString(arr1));
        }
        for(int j=0;j<d;j++)
        {
            arr1[c++]=arr[j];
            System.out.println(Arrays.toString(arr1));
        }
    }
}
