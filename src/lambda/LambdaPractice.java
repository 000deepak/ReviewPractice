package lambda;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LambdaPractice {
    public static void main(String[] args) {

        Integer[] m = new Integer[]{1,2,3,6,15,6,5};
        List myList = Arrays.asList(m);

        Iterator<Integer> itr = myList.iterator();
        while (itr.hasNext()){
            Integer i = itr.next();
            System.out.println(i);
        }

        myList.forEach(n->{System.out.println(n);});

        myInterf interf = (int a, int b) -> a + b;
        System.out.println(interf.add(2, 3));
    }
}
    @FunctionalInterface
    interface myInterf {
        int add(int a, int b);
    }




