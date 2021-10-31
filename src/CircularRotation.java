import java.util.Arrays;
import java.util.Scanner;

public class CircularRotation {

    static int n;
    static int k;
    static int q;

    static int[] a;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("enter array size n");
        n = sc.nextInt();
        a = new int[n];

        System.out.println("enter rotations");
        k = (sc.nextInt())%n;
        System.out.println("queries");
        q = sc.nextInt();

        getArray(n);

        int j = 0;
        while (j < k) {
            rotate(a);
            j++;
        }

        query(a, q);
    }

    static void getArray(int m) {

        System.out.println("enter array elements");
        for (int i = 0; i < m; i++) {
            System.out.println("enter" + i+1 + " th element");
            a[i] = sc.nextInt();
        }
        System.out.println("given array is" + Arrays.toString(a));
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

    static void query(int[] x, int y) {
        for (int i = 0; i < y; i++) {
            System.out.println(x[i]);
        }
    }

}