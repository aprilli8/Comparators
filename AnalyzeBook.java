import structure5.*;
import java.util.Comparator;

public class AnalyzeBook{
  public static void main(String[] args){
    //build Student vector
    MyVector<Student> vec = new MyVector<Student>();
    vec.add(new Student("Joe", " ", 10, 5, 6261234568L));
    vec.add(new Student("Boboa", " ", 10, 3, 4132345689L));
    vec.add(new Student("Jane", " ", 10, 100, 4133928772L));
    vec.add(new Student("John", " ", 10, 1, 4132837584L));
    vec.add(new Student("Robert", " ", 10, 25, 6262037925L));
    vec.add(new Student("Jacob", " ", 10, 8, 3249895321L));
    System.out.println(vec);

    //sorts and prints Students alphabetically by first name
    Comparator<Student> c = new SUBoxComparator();
    vec.sort(c);
    for(Student i : vec){
      System.out.println(i.getSUBox());
    }

    //sorts and prints Students by SU Box number
    Comparator<Student> d = new NameComparator();
    vec.sort(d);
    for(Student i : vec){
      System.out.println(i.getName());
    }

    //sorts and prints Students by number of vowels in their full name
    Comparator<Student> e = new VowelComparator();
    vec.sort(e);
    for(Student i : vec){
      System.out.println(i.getName());
    }

    //sorts and prints students' home phone number area codes by frequency of appearance
    MyVector<Association<Long, Integer>> areaFreq = new MyVector<Association<Long, Integer>>();
    Comparator<Association<Long, Integer>> f = new AreaCodeComparator();
    buildList(vec, areaFreq);
    areaFreq.sort(f);
    for(Association<Long, Integer> i : areaFreq){
      System.out.println(i.getKey());
    }
  }

  //method is intended to build a list of area codes that keeps track of the
  //frequency of their appearance
  public static void buildList(MyVector<Student> v, MyVector<Association<Long, Integer>> a){
    for(int i = 0; i < v.size(); i++){
      int index = a.indexOf(new Association<Long, Integer>(v.get(i).getHomePhone()/10000000L, null));
      if(index == -1){
        a.add(new Association<Long, Integer>(v.get(i).getHomePhone()/10000000L, 1));
      }
      else{
        a.get(index).setValue(a.get(index).getValue()+1);
      }
    }
  }
}
