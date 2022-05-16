import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinMaxSum {

  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<Integer>(
        Arrays.asList(
            256741038, 623958417, 467905213, 714532089, 938071625
        ));
    minMaxSum(arr);
  }


  public static void minMaxSum(List<Integer> arr){
    int maxNum = arr.get(0);
    int minNum = arr.get(0);
    long sum = 0;
    for(int i=0; i< arr.size(); i++){
      if(arr.get(i) > maxNum){
        maxNum = arr.get(i);
      }
      if(arr.get(i) < minNum){
        minNum = arr.get(i);
      }
      sum = sum + arr.get(i);
    }
    System.out.print(sum-maxNum);
    System.out.print("  ");
    System.out.print(sum-minNum);
  }

  //Another solution

//  public static void miniMaxSum(List<Integer> arr) throws Exception{
//    // Write your code here
//    if(arr == null || arr.size() != 5){
//      throw new Exception();
//    }
//    Integer[] array = arr.toArray(new Integer[arr.size()]);
//    Arrays.sort(array);
//    System.out.println((array[0].longValue() + array[1].longValue() + array[2].longValue() + array[3].longValue())+ " " + (array[1].longValue() + array[2].longValue() + array[3].longValue() + array[4].longValue()));
//  }

}
