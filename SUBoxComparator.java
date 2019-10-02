import structure5.*;
import java.util.Comparator;

public class SUBoxComparator implements Comparator<Student>{
  /*
   * pre: method parameters are valid Student objects
   * post: returns -1 if Student a's SU Box number is smaller, 0 if they are
      equal, and 1 if Student a's SU Box number is larger than Student b's
   */
  public int compare(Student a, Student b){
    if(a.getSUBox() < b.getSUBox()){
      return -1;
    }
    else if(a.getSUBox() == b.getSUBox()){
      return 0;
    }
    else{
      return 1;
    }
  }

}
