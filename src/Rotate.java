import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int[] a= new int[]{1,2,3};
        int[] b= new int[a.length];


        rotate(a,b);


    }
    static void rotate(int[] o, int[] p) {

        p[0] = o[o.length - 1];

        for (int i = 0; i < o.length - 1; i++) {
            p[i + 1] = o[i];
        }
        System.out.println(Arrays.toString(p));
    }
}
