//We are the sole authors of the work in this repository.
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

  //Pre: Takes a MyVector filled with students from the phonebook as an argument
  //Post: Returns a MyVector of associations between an address and number of students who live at that address
  public static MyVector<Association<String, Integer>> readIn(MyVector<Student> vec){
    MyVector<Association<String, Integer>> list = new MyVector<Association<String, Integer>>();
    for(Student s : vec){
      //Split address to find common addresses
      String[] address = s.getAddress().split(" ");
      String commonAddress = address[0];
      Association<String, Integer> temp = new Association<String, Integer>(commonAddress, 0);
      if(list.contains(temp)){
        temp.setValue(list.get(list.indexOf(temp)).getValue() + 1);
        list.setElementAt(temp, list.indexOf(temp));
      } else {
        temp.setValue(1);
        list.add(temp);
      }
    }
    return list;
  }

}
