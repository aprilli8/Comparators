//We are the sole authors of the work in this repository.
import structure5.*;
import java.util.Scanner;
import java.util.Comparator;

/*$ (-1) Good idea making a separate file for your tests, but consider breaking
    your main method into several helper methods (ex. by question) for better
    organization and clarity. */
public class AnalyzeBook{
  public static void main(String[] args){
    //Build Student vector
    MyVector<Student> vec = new MyVector<Student>();
    /*$ Make sure to have a message that instructs the user on how to input the
        phonebook data to the program if they don't know how to do it (ex.
        "Usage: Queries < file.txt"). */
    Scanner in = new Scanner(System.in);
    for(int i = 0; i < 2052; i++){
      String name = in.nextLine();
      String address = in.nextLine();
      long campusNum = in.nextLong();
      int SUBox = in.nextInt();
      long phoneNum = in.nextLong();
      /*$ You don't need to print out every student's information since we already
          have the txt file and this adds to your program's runtime. */
      System.out.println(name + ", " + address + ", " + campusNum + ", " + SUBox + ", " + phoneNum);
      vec.add(new Student(name, address, campusNum, SUBox, phoneNum));
      //Skips the '------'
      System.out.println(in.nextLine());
      System.out.println(in.nextLine());
    }
    //System.out.println(vec);

    //Problem 1: sorts and prints out the name of the student first in alphabetical order.
    System.out.println("Problem 1");
    Comparator<Student> d = new NameComparator();
    vec.sort(d);
    System.out.println("First name alphabetically: " + vec.get(0).getName());

    //Problem 2: sorts and prints smallest SU Box and largest SU Box
    System.out.println();
    System.out.println("Problem 2");
    Comparator<Student> c = new SUBoxComparator();
    vec.sort(c);
    System.out.println("Smallest SU Box: " + vec.get(0).getSUBox());
    System.out.println("Largest SU Box: " + vec.get(vec.size()-1).getSUBox());

    //Problem 3: sorts and prints Student's name with largest number of vowels
    System.out.println();
    System.out.println("Problem 3");
    Comparator<Student> e = new VowelComparator();
    vec.sort(e);
    System.out.println("Name with largest number of vowels: " + vec.get(0).getName());

    //Problem 4: Sorts a vector of associations to determine which address is shared by most students.
    //Then print out names of all students at the most common address.
    System.out.println();
    System.out.println("Problem 4");
    //Read in addresses and tally num addresses
    MyVector<Association<String, Integer>> list = AddressComparator.readIn(vec);
    list.sort(new AddressComparator());
    //From list, address shared by most students is "Williams." Print out their names
    System.out.println("Students living at address 'Williams:'");
    for(Student s: vec){
      if(s.getAddress().split(" ")[0].equals("Williams")){
        System.out.println(s.getName());
      }
    }

    //Problem 5: sorts and prints first 10 most frequent area codes
    System.out.println();
    System.out.println("Problem 5");
    System.out.println("10 most frequent area codes starting with most common:");
    MyVector<Association<Long, Integer>> areaFreq = new MyVector<Association<Long, Integer>>();
    Comparator<Association<Long, Integer>> f = new AreaCodeComparator();
    buildList(vec, areaFreq);
    areaFreq.sort(f);
    for(int i = areaFreq.size()-1; i > areaFreq.size()-11; i--){
      System.out.println(areaFreq.get(i).getKey());
    }
  }

  //method is intended to build a list of area codes that keeps track of the
  //frequency of their appearance
  //Pre: MyVector v populated with all the students from newphonebook.txt and MyVector a which
  //is empty
  //Post: MyVector a is populated with associations between area codes and their frequencies among students
  public static void buildList(MyVector<Student> v, MyVector<Association<Long, Integer>> a){
    for(int i = 0; i < v.size(); i++){
      if(v.get(i).getHomePhone() == -1){ //$ It doesn't seem like you need this if statement?
        i=i;
      }
      else{
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
}
