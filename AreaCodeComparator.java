import structure5.*;
import java.util.Comparator;

public class AreaCodeComparator implements Comparator<Association<Long, Integer>>{
  /*
   * pre: method parameters are valid Student objects
   * post: returns -1 if the frequency of area code a is less than that of area
      code b, 0 if they are equal, and 1 if the frequency of a is greater than
      the frequency of b
   */
  public int compare(Association<Long, Integer> a, Association<Long, Integer> b){
    if(a.getValue() < b.getValue()){
      return -1;
    }
    else if(a.getValue() == b.getValue()){
      return 0;
    }
    else{
      return 1;
    }
  }

}
