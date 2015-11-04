import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Hernan Y.Ke on 2015/11/4.
 */
public class L5_1 {
    public static void main(String[] args) {
        String targetString = "I am fine to dine at nine";
        String regex = "[fdn]ine";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(targetString);
        while(matcher.find()){
            System.out.println(matcher.group()+ " "+matcher.start()+" " +matcher.end());
        }
    }
}
