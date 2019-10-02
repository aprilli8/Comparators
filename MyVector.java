import structure5.*;
import java.util.Comparator;

public class MyVector<E> extends Vector<E> {

  //pre: c must be non-null and must deal with objects of type E
  //post: list is sorted from smallest largest
  public void sort(Comparator<E> c){
    for(int i = elementCount - 1; i > 0; i--){
      int big = findMax(i, c);
      swap(i, big);
    }
  }

  //Find index of the largest value in the list from 0 to last
  //Returns the index of the max value
  private int findMax(int last, Comparator<E> c){
    int max = 0;
    for(int i = 1; i <= last; i++){
      //if the supposed max is less than the next value, set the index of that
      //next value to max
      if(c.compare(get(max), get(i)) == -1){
        maxPos = i;
      }
    }
    return max;
  }

  //pre: a and b are in the bounds of the list
  //post: objects at the indexes a and b swap positions in this list
  private void swap(int a, int b){
    Assert.pre(a > 0 && b > 0 && a < elementCount - 1 && b < elementCount - 1,
      "indexes in swap must be within the bounds of the list.")
    E tempA = get(a);
    E tempB = get(b);
    set(a, tempA);
    set(b, tembB);
  }
}
