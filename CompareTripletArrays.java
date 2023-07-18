import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Solution {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    /**Input:{n1,n2,n3....nN} {m1,m2,m3.....mN}
     * process>> if a[n]>b[m] : 1 point to a
     *              if b[m]>a[n] : 1 point to b
     *              no point if both are equal like a[m]=b[m]
     * output>> {pointsOfa,pointsOfb}
     * @param a
     * @param b
     * @return
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        Integer[] count ={0,0};
        for (int i = 0; i < a.size(); i++) {
            //System.out.println("hehe");

            if (a.get(i) > b.get(i))
                count[0]++;
            else if (b.get(i) > a.get(i))
                count[1]++;
        }
        return Arrays.asList(count);
    }
}

public class CompareTripletArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Solution.compareTriplets(a, b);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

