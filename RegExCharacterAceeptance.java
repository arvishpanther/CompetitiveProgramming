import java.util.regex.Pattern;

public class RegExCharacterAceeptance{
    public static void main(String[] args) {
                //~~~~~~~~~~~~~~~~~`RegEx to accept alphanumeric character(s)...
                System.out.println(Pattern.matches("[a-zA-Z0-9]", "m"));// true
                System.out.println(Pattern.matches("[a-zA-Z0-9]", "mA"));//false
/*nonRepeatChar*/System.out.println(Pattern.matches("[a-zA-Z0-9]?","ma154kk"));//false

        // ~~~~~~~~~~~~~~~for more than one characters~~~~~~~~~~~~~~

                System.out.println(Pattern.matches("[a-zA-Z0-9]*", "ma154k"));// true
                System.out.println(Pattern.matches("[a-zA-Z0-9]*", "m@154k"));//false

                System.out.println(Pattern.matches("[a-zA-Z0-9]+", "mm154k"));//true


//        System.out.println(Pattern.matches("[a-zA-Z0-9]+", ""));//false (+ means char should at least occur once)....
//        System.out.println(Pattern.matches("[a-zA-Z0-9]*", ""));// true (* means it doesn't matter occur or not)....
    }
}
