
import java.util.Scanner;
public class ReverseString {
//    //gadbad kr raha hai char[] ko toString then boxx sa kuch lochedaar print ho ja rha >>
//    static void rev(char[] chars){
//       // String x=new String();
//        char[] c=new char[chars.toString().length()];
//        int cLength=0;
//        for (int i=chars.length-1;i>=0;i--)
//        {   c[cLength]=chars[i];cLength++;
//           // x=x+s.charAt(i);
//        }
//        System.out.println(c);
//
       // return String.valueOf(c);
      //  return x;
    static void rev(String s){
        StringBuilder s1= new StringBuilder();
        for (int i = s.length()-1; i>=0; i--) {
            s1.append(s.charAt(i));
        }
        System.out.println(s1);
    }

    public static void main(String[] args) {
        String s;
        System.out.println("enter a String...>");
        Scanner scanner=new Scanner(System.in);
        s=scanner.nextLine();
        //char[] c=s.toCharArray();
        //System.out.println(c);
        System.out.println("Reverse of "+s+" is::");
        rev(s);
    }
}
