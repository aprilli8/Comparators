import structure5.*;
import java.util.Comparator;

public class AnalyzeBook{
  public static void main(String[] args){
    MyVector vec = new MyVector();
    vec.add(1);
    vec.add(10);
    vec.add(6);
    vec.add(100);
    vec.add(15);
    vec.add(2);
    System.out.println(vec);
    Comparator<String> c = new Comparator<String>();
    vec.sort(c);
    System.out.println(vec);
  }
}
