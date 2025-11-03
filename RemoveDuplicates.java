import java.util.*;
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {3,1,1,4,6,7,9,2,6,3};
        
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int num : arr)
        {
            set.add(num);
        }
        System.out.println(set);
        }
    
}
