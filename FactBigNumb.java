import java.util.Scanner;
public class FactBigNumb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int[] ar =new int[500];
        int n=sc.nextInt();
        int size=1;

        ar[0]=1;
        for (int i = 2; i <n ; i++) {
            size = multiplier(i, ar, size);
        }
        System.out.println("Factorial of "+n+" :");
        for (int i = size-1; i >=0 ; i--) {
            System.out.print(ar[i]);
        }
    }
    static int multiplier(int x, int[] ar, int arraySize){
        //System.out.println(">>>>>>");
        int carry=0;
        for (int i = 0; i < arraySize; i++) {
            int product=ar[i]*x+carry;
            ar[i]=product%10;
            carry=product/10;

        }
        while (carry!=0){//array k size bdha kr carry ko sortout kr rha....ehhe
            ar[arraySize]=carry%10;
            carry/=10;
            arraySize++;
            }
      // System.out.print(Arrays.toString(ar));
        return arraySize;
    }
}