import structure5.*;
import java.util.Comparator;

public class AnalyzeBook{
  public static void main(String[] args){
    MyVector vec = new MyVector();
    vec.add(new Student("Joe", " ", 10, 5, 10));
    vec.add(new Student("Joe", " ", 10, 3, 10));
    vec.add(new Student("Joe", " ", 10, 100, 10));
    vec.add(new Student("Joe", " ", 10, 1, 10));
    vec.add(new Student("Joe", " ", 10, 25, 10));
    vec.add(new Student("Joe", " ", 10, 8, 10));
    System.out.println(vec);
    Comparator<Student> c = new SUBoxComparator();
    vec.sort(c);
    System.out.println(vec);
  }
}
