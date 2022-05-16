import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LonelyInteger {

  public static void main(String[] args) {
    List<Integer> a = new ArrayList<Integer>(
        Arrays.asList(1, 2, 3, 3, 2, 8, 1)
    );
    int result = lonelyInteger(a);
    System.out.println(result);
  }

  public static int lonelyInteger(List<Integer> a){
    return removeCouples(a).get(0);
  }

  public static List<Integer> removeCouples(List<Integer> a){
    int lonelyNum = a.get(0);
    boolean changeFlag = false;
    for (int i=1; i<a.size(); i++){
      if(a.get(i) == lonelyNum){
        a.remove(i);
        a.remove(0);
        changeFlag = true;
        removeCouples(a);
      }else if((i == a.size()-1) && !changeFlag){
        a = List.of(lonelyNum);
        break;
      }
    }
    return a;
  }

}
