import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {

  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<Integer>(
        Arrays.asList(
            1,
            1,
            0,
            -1,
            -1
        )
    );
    plusMinus(arr);
  }
  public static void plusMinus(List<Integer> arr){
    double positive = 0;
    double negative = 0;
    double zero = 0;

    for(Integer num : arr){
      if(num > 0)
        positive++;
      else if(num < 0)
        negative++;
      else
        zero++;
    }
    double positiveRatio = positive/arr.size();
    double negativeRatio = negative/arr.size();
    double zeroRatio = zero/arr.size();

    DecimalFormat df = new DecimalFormat("0.000000");
    System.out.println(df.format(positiveRatio));
    System.out.println(df.format(negativeRatio));
    System.out.println(df.format(zeroRatio));
  }
}
