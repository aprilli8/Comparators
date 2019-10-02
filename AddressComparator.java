import structure5.*;
import java.util.Comparator;
import java.util.Scanner;

//This class compares two associations and determines which has a larger value
public class AddressComparator implements Comparator<Association<String, Integer>>{
  public int compare(Association<String, Integer> a, Association<String, Integer> b){
    if(a.getValue() < b.getValue()){
      return -1;
    } else if(a.getValue() == b.getValue()){
      return 0;
    } else {
      return 1;
    }
  }

  public static void main(String[] args){
    MyVector<Student> vec = new MyVector<Student>();
    Scanner in = new Scanner(System.in);
    //Change to i < 2,052 when using real phonebook
    for(int i = 0; i < 15; i++){
      String name = in.nextLine();
      String address = in.nextLine();
      long campusNum = in.nextLong();
      int SUBox = in.nextInt();
      long phoneNum = in.nextLong();
      System.out.println(name + ", " + address + ", " + campusNum + ", " + SUBox + ", " + phoneNum);
      vec.add(new Student(name, address, campusNum, SUBox, phoneNum));
      //Skips the '------'
      System.out.println(in.nextLine());
      System.out.println(in.nextLine());
    }
    System.out.println(vec);
  }
}
