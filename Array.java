public class Array {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] c = new int[a.length + b.length];
        int n = 0;

        // Interleave elements
        for (int i = 0; i < a.length; i++) {
            c[n] = a[i];
            n++;
            c[n] = b[i];
            n++;
        }

        // Print the result
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}