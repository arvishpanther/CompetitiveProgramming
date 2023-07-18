/**
 * to print maximum & minimum possible sum of array n-1 elements
 * */

import java.util.*;

class MiniClass {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        System.out.println(arr);
        arr.sort(Comparator.naturalOrder());
        System.out.println(arr);
        long miniSum=0L;
        long maxSum=0L;
        for(int i=0;i<arr.size()-1;i++){
            miniSum+=arr.get(i);
            if(i!=0){
                maxSum+=arr.get(i);
            }
        }
        maxSum+=arr.get(arr.size()-1);
        System.out.print(miniSum+" "+maxSum);
    }
}

public class MinMaxSum {
    public static void main(String[] args){//throws IOException{
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner=new Scanner(System.in);

//        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
        List<Integer> arr= new ArrayList<>();
        System.out.println("Enter 5 integer elements");
        for (int i = 0; i <=4; i++) {

            arr.add(scanner.nextInt());

        }
        MiniClass.miniMaxSum(arr);

//        bufferedReader.close();
    }
}

