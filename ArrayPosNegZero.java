import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int n=arr.size();
        int countPositive=0,countNegative=0,numZeroes=0;
        for (Integer integer : arr) {
            //System.out.println(integer + ">>");
            if (integer > 0){
                countPositive++;
           // System.out.println("positive");
            }
            else
                if (integer < 0) {
                countNegative++;
            } else numZeroes++;


        }
        System.out.println(String.format("%.6f",(double)countPositive/(double)n)+"\n"+String.format("%.6f",(double)countNegative/(double)n)+"\n"+String.format("%.6f",numZeroes/(double)n));
    }

}

public class ArrayPosNegZero {
    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int n = sc.nextInt();

//        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//   ~~trying~~     List<Integer> arr=Stream.of(sc.nextLine().replaceAll("\\s+$","").split(" ")).map(Integer::parseInt).collect(toList());
       List<Integer> arr= Arrays.stream(s.replaceAll("\\s+$","").split(" ")).map(Integer::parseInt).collect(toList());
        Result.plusMinus(arr);

       // bufferedReader.close();

    }
}
