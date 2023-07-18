import java.util.Scanner;

public class StringPatterns {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0 ||j==0){
                    System.out.print("e");
                }
                else System.out.print(" ");
            }
            if(i<=(n)/2) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("@");
                }
            }
            else {
                for (int j =n- i-1; j >=0 ; j--) {
                    System.out.print("@");

                }
            }
            System.out.println();
        }
        System.out.println("<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        int x= n/2;int t2=1;
        System.out.println("<<<<<<<<<<<<<<<Abhishek>>>>>>>>>>>>>>>>>>>");
        for (int i = 0; i < n + 4; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        int t = 0;
        for (int i = n; i > 0; i = i - 2) {
            for (int j = 0; j < t; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("@");
            }
            t++;
            System.out.println();
        }
        System.out.println("<<<<<<<<<<<<Arya>>>>>>>>>>>>>");


        System.out.println(x);
        for (int i = 0; i < n + 4; i++) {
            if(i<(n+4)/2 ||i>=n+2){
                for (int j = 0; j <n ; j++) {
                    System.out.print("   ");
                }
                for (int j = 0; j < n+4; j++) {
                    System.out.print(" e ");
                }}
            else{
                for (int k=0; k <x; k++) {
                    System.out.print("   ");
                }
                for (int j = 0; j <t2 &&j<n; j++) {
                    System.out.print(" * ");
                }t2+=2;
                for (int k=0;k<x; k++) {
                    System.out.print("   ");
                }
                for (int j = 0; j < n+4; j++) {
                    System.out.print(" e ");
                }
                x--;
            }

            System.out.println();
        }
    }
}
