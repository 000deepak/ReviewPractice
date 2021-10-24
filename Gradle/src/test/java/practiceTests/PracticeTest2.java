package practiceTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PracticeTest2 {

    Practice2 p2 =new Practice2();

    @Test
    void givenaddition_whenProper_returnTrue(){

        int exp = 6;
        int act = p2.add(5,1);

        Assertions.assertEquals(exp,act);
    }
}
