import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^[a-zA-Z][a-zA-Z0-9-.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+$");
        Matcher m = p.matcher("deepakkumbhar19@gmail.com");

        if (m.find())
            System.out.println("y");
        else
            System.out.println("n");

    }
}
