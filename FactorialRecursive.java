/**
 * This is a failed program because it's unable to resolve=>> big valued fact...
 */
//bsss  fact(20) tak even after long'ing the function
/* to encounter very large numeral factorial>>
 * */
//go to "factBigNumb.java"
import java.util.Scanner;
public class FactorialRecursive {
    static long fact(Integer n){
        //base statement/condition
        if(n==1 || n==0){
            return 1;
        }
        if(n<0){
            System.out.println("negative input....agli baar dhyaan dena.....");
            throw new IllegalArgumentException();
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number...");
        int n=scanner.nextInt();
       System.out.println("Factorial of n:=>\n"+fact(n));
    }
}