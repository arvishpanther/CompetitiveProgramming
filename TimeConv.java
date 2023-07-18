/***********
 * this is right answer
 * **/
import java.util.*;

class TimeConv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
//        if(s.substring(0, 2).equals("12")){
//        String s1=s.substring(2,s.length()-2);
//        s= Integer.parseInt(s.substring(0, 2)) + 12 +s1;
//        System.out.println(s);
//    }}

        if (s.charAt(s.length() - 2) == 'P') {
            if (s.substring(0, 2).equals("12"))
                s = s.substring(0, s.length() - 2);
            else
                s = Integer.parseInt(s.substring(0, 2)) + 12 + s.substring(2, s.length() - 2);
        }
        else {
            if (s.charAt(s.length() - 2) == 'A') {
                if (s.substring(0, 2).equals("12")) {
                    s = "00" + s.substring(2, s.length() - 2);
                } else s = s.substring(0, s.length() - 2);
            }
        }
        System.out.println(s);


    }
}