import java.util.Scanner;
public class PoundToKg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Pounds:>>   ");
        double pound=sc.nextDouble();
        System.out.println(pound+" pounds = "+pound*0.45359237+" Kg");
    }
}