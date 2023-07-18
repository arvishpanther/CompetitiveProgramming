import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class IpAddressRegex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}
//for regular Expression for IP address
class MyRegex{
    // }    000.000.000.000/0.0.0.0 to 255.255.255.255
    String forABCD="([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])";
    String pattern=forABCD+"."+forABCD+"."+forABCD+"."+forABCD;
}