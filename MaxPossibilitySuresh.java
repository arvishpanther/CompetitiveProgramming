import java.util.Scanner;

/**Ramesh vs Suresh "one by one" chance
 * to get a pot of some coins
 * there are N number of pot
 *
 * input: N
 * n1 n2 n3 n4.....nN
 * output: max number of coins by suresh so he get the confirmed win
 */
public class MaxPossibilitySuresh {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //enter no of toss
        int n=s.nextInt();
        int[] a=new int[n];
        int x=0;

        int y=0;
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
            if(i%2==0){
                x+=a[i];
            }
            else {
                y+=a[i];
            }
        }
        System.out.println(Math.max(x, y));
    }
}