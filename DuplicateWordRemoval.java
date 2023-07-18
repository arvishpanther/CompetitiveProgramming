import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// continuous repeatation ko hata rha but have to work on this to remove every occurance

public class DuplicateWordRemoval
{
    public static void main(String[] args){

        String pattern = "(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+";
        Pattern r = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        System.out.println("/**     .....enter test cases.....   */");
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            System.out.println("\n//      enter a string line");
            String input = in.nextLine();
            Matcher m = r.matcher(input);
            //boolean findMatch = true;
            while(m.find( )){
                input = m.replaceAll("$1");

            }
            System.out.println(input);
            testCases--;
        }
    }
}