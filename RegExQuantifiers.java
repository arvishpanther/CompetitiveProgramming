import java.util.regex.*;
public class RegExQuantifiers {

    public static void main(String args[]){
        System.out.println("? quantifier ....");
        System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)
        System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)


        System.out.println("+ quantifier ....");
        System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)
        System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)
        System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)
        System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)
        System.out.println(Pattern.matches("[amn]+", "aamna"));//true
/*>>*/  System.out.println(Pattern.matches("[amn]+", ""));//false

        System.out.println("* quantifier ....");
        System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)
/*>>*/  System.out.println(Pattern.matches("[amn]*", ""));//true
        System.out.println(Pattern.matches("[amn]*", " "));//false

        System.out.println("{n} quantifier>> only one char can used for only n times  ....");
        System.out.println(Pattern.matches("[abz]{7}","aaaaaaa"));//true
        System.out.println(Pattern.matches("[a-z]{7}","bbbbbbb"));//true
        System.out.println(Pattern.matches("[abz]{7}","aaaaaaazzzzzzz"));//false

        System.out.println("X{n,}quantifier >> any one char out of X should be written for n or more times  ....");//
        System.out.println(Pattern.matches("[abz]{7,}","aaaaaaaaaaaaaaaaa"));//true
        System.out.println(Pattern.matches("[abz]{7,}","aaaaaaaazzzzzzzz"));//true
        System.out.println(Pattern.matches("[abz]{7,}","aaaazzzzzzzz"));//true
        System.out.println(Pattern.matches("[abz]{7,}","aaaazzzzzzzzA"));//false Anot allowed

        System.out.println("{m,n} minimum n max n times quantifier ....");
        System.out.println(Pattern.matches("[a-z]{8,30}","aaaaaaaa"));//true
//to start  with alphabetc char, rest should contain only alphanumeric and Underscore(_), raged in between 8-30
        System.out.println(Pattern.matches("[a-zA-Z]\\w{8,30}+","Juliaaah007__0@"));


    }}

