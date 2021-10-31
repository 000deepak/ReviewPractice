package ExceptionPractice;

public class PracticeEx {
    public static void main(String[] args) throws  PracticeCustomEx {
        int a=6;
        int b= 0;

        try{
        divide(a,b);
        }catch ( PracticeCustomEx e){

        }
    }

    public static int divide(int a , int b) throws PracticeCustomEx{
        if(b==0){
            throw new PracticeCustomEx("b cannot be 0");}
        else
            return a/b;
    }
}
