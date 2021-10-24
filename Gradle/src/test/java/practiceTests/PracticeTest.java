package practiceTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PracticeTest {
    Practice p = new Practice();
    @Test
    public void givenEmail_whenProper_returnTrue(){
        boolean result = p.email("deepakkum@gmail.com");
        Assertions.assertEquals(true,result);

    }
}
