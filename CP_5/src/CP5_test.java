import java.util.Scanner;

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
    }
}
