//input >>He is a very very good boy, isn't he?
//10
//He
//is
//a
//very
//very
//good
//boy
//isn
//t
//he
/**test cases passed......
 *
 */

import java.io.*;
import java.util.*;

public class StringTokens {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            //code  Written here.
            StringTokenizer st = new StringTokenizer(s, " [,!?._'@]+");
            /* Checks if the String has any more tokens */
            System.out.println(st.countTokens());
            while (st.hasMoreTokens())
            {
                System.out.println(st.nextToken());
            }
            scan.close();
        }
    }

