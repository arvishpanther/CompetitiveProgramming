import java.util.*;

public class Arya_SumOfList_median {
    /**
     * Merge Two Array & Remove Duplicates
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("<<Enter two array size>>\nsizeOf(array1):\t");
        int N1 = scanner.nextInt();
        System.out.println("sizeOf(array2):\t");
        int N2 = scanner.nextInt();
        System.out.println("\nenter elements of Array1:");
        List<Integer> array1 = new ArrayList<Integer>();
        for (int i = 0; i < N1; i++) {
            array1.add(scanner.nextInt());
        }
        List<Integer> array2 = new ArrayList<>();
        System.out.println("\n Enter array2 elements:");
        for (int i = 0; i < N2; i++) {
            array2.add(scanner.nextInt());
        }
        Set<Integer> list3 = new LinkedHashSet<Integer>();
        list3.addAll(array1);
        list3.addAll(array2);
        //        List array3[] = new ArrayList(list3);
        List<Integer> sortedList = new ArrayList<>(list3);
        
        Collections.sort(sortedList);
//        System.out.println("Array1 " + Arrays.toString(array1));
//        System.out.println("Array2 " + Arrays.toString(array2));
        System.out.println("Array3 " + sortedList);
        double result;
//        if(sortedList.size()%2==0){
//                //1,2,3,4 size/2>>2  (size+1)/2>>3
//                System.out.println("Array3 " + sortedList);//    size="+sortedList.size()+"   mid(s)="+sortedList.get(sortedList.size()/2)+" and "+sortedList.get((sortedList.size()-1)/2));
//               double result1=((int)sortedList.get((sortedList.size()-1)/2));
//                 result=(int)sortedList.get(sortedList.size()/2);
//                result=(result1+result)/2;
//
//            }else {
//                System.out.println("Array3 " + sortedList+"    size="+sortedList.size()+" odd     mid="+sortedList.get(sortedList.size()/2));
//                 result=  (int)sortedList.get((sortedList.size())/2);
//
//
//            }
//        System.out.println("Meadian::");
//
//            System.out.println(sortedList.size()%2!=0?(int) result:result);
//        result=sortedList.size()%2==0?result:(int)(result);
//        System.out.println(result);
//        _______________________________________________________________________
        result=sortedList.size()%2==0?(double)((int)sortedList.get(sortedList.size()/2-1)+(int)sortedList.get(sortedList.size()/2))/2:(int)sortedList.get(sortedList.size()/2);
       //printing int typed output ?(if)odd >> cz only one integer value else result is decima valued so....... String conversion....
        System.out.printf(sortedList.size()%2==0? String.valueOf(result) :String.format("%.0f%n",result));

  }
}