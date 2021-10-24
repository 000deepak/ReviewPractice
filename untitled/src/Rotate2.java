import java.util.Arrays;

public class Rotate2 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3,4,8};

        rotate(a);
    }

    static void rotate(int[] a) {
        int temp1 = a[0];
        int temp2;
        a[0] = a[a.length - 1];
        for (int i = 0; i < a.length - 1; i++) {
            temp2 = a[i + 1];
            a[i + 1] = temp1;
            temp1 = temp2;
        }
        System.out.println(Arrays.toString(a));
    }
}
