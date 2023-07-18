import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int i=A.length()-1;
        StringBuilder s=new StringBuilder("");
        for(;i>=0;i--){
            s=s.append(A.charAt(i));
        }
		System.out.println(s);
          if (A.equals(s.toString())==true){
            System.out.print("Yes");
        }
        else{
             System.out.print("No");
        }
    }
}


