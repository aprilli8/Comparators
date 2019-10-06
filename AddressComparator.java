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

  public static void main(String[] args){
    //COPY THIS METHOD INTO ANALYZEBOOK
    MyVector<Student> vec = new MyVector<Student>();
    Scanner in = new Scanner(System.in);
    //Change to i < 2,052 when using real phonebook
    for(int i = 0; i < 2052; i++){
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
    //Read in addresses and tally num addresses
    MyVector<Association<String, Integer>> list = readIn(vec);
    list.sort(new AddressComparator());
    System.out.println(list);
    //From list, address shared by most students is "Williams." Print out their names
    for(Student s: vec){
      if(s.getAddress().split(" ")[0].equals("Williams")){
        System.out.println(s.getName());
      }
    }
  }
}
