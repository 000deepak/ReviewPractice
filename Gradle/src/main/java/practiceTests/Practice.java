package practiceTests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice {
    public boolean email(String s) {
        Pattern p = Pattern.compile("^[a-zA-Z][a-zA-Z0-9-.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+$");
        Matcher m = p.matcher(s);

        return m.matches();
    }
}
