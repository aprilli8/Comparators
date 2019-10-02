import structure5.*;
import java.util.Comparator;

public class AnalyzeBook{
  public static void main(String[] args){
    MyVector<Student> vec = new MyVector<Student>();
    vec.add(new Student("Joe", " ", 10, 5, 10));
    vec.add(new Student("Bob", " ", 10, 3, 10));
    vec.add(new Student("Jane", " ", 10, 100, 10));
    vec.add(new Student("John", " ", 10, 1, 10));
    vec.add(new Student("Robert", " ", 10, 25, 10));
    vec.add(new Student("Jacob", " ", 10, 8, 10));
    System.out.println(vec);
    Comparator<Student> c = new SUBoxComparator();
    vec.sort(c);
    for(Student i : vec){
      System.out.println(i.getSUBox());
    }
  }
}
