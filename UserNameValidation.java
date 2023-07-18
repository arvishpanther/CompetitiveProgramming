import java.io.*;
import java.util.*;
import java.util.regex.*;
//this program validates whether the entered username is according to the rule or not....
// check whats valid by simply trying few of them.......
//enjoy
public class UserNameValidation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        List<String> ar = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            ar.add(sc.next());
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Pattern.matches("[a-zA-Z]\\w{7,29}+", ar.get(i)) ?"Valid":"Invalid");
        }
        //hola!!!! these are few examples......
//        System.out.println(Pattern.matches("[a-zA-Z]\\w{7,29}+","Julia"));// 5 char
//        System.out.println(Pattern.matches("[a-zA-Z]\\w{7,29}+","Samantha"));
//        System.out.println(Pattern.matches("[a-zA-Z]\\w{7,29}+","Samantha_21"));
//        System.out.println(Pattern.matches("[a-zA-Z]\\w{7,29}+","1Samantha"));
//        System.out.println(Pattern.matches("[a-zA-Z]\\w{7,29}+","Samantha?10_2A"));
//        System.out.println(Pattern.matches("[a-zA-Z]\\w{7,29}+","JuliaZ007"));
//        System.out.println(Pattern.matches("[a-zA-Z]\\w{7,29}+","Julia@007"));
//        System.out.println(Pattern.matches("[a-zA-Z]\\w{7,29}+","_Julia007"));
//
    }
}