import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by Hernan Y.Ke on 2015/11/5.
 */
public class CP5_test {
    public static void main(String[] args) {
        String test = "I am test";
        CharSequence cs = test.subSequence(1,5);
        System.out.println(cs);

        //P372
        Scanner scanner = new Scanner("The \tprogrammer");
        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }
        System.out.println("======P373=====");

        //P373
        Scanner scanner2 = new Scanner("The \tprogrammer22me");
        scanner2.useDelimiter("[\\d]+");
        while(scanner2.hasNext()){
            System.out.println(scanner2.next());
        }

        //P375
        StringTokenizer stn = new StringTokenizer("start startup");
        while (stn.hasMoreTokens()){
            System.out.println(stn.nextToken());
        }
    }
}
