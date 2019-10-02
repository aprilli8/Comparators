import structure5.*;
import java.util.Comparator;

public class VowelComparator implements Comparator<Student>{

  /*
   * pre: method parameters are valid Student objects
   * post: returns -1 if number of vowels in Student a's name is less than
      Student b's, 0 if they are equal, and 1 if Student a's is larger than
      Student b's
   */
  public int compare(Student a, Student b){
    int vowelsA = vowelTally(Student a);
    int vowelsB = vowelTally(Student b);

    if(vowelsA < vowelsB){
      return -1;
    }
    else if(vowelsA == vowelsB){
      return 0;
    }
    else{
      return 1;
    }
  }

  public int vowelTally(Student a){
    int tally = 0;
    for(int i = 0; i < a.getName().length(); i++){
      if(((String)(a.getName().charAt(i))).equalsIgnoreCase("a") ||
          ((String)(a.getName().charAt(i))).equalsIgnoreCase("e") ||
            ((String)(a.getName().charAt(i))).equalsIgnoreCase("i") ||
              ((String)(a.getName().charAt(i))).equalsIgnoreCase("o") ||
                ((String)(a.getName().charAt(i))).equalsIgnoreCase("u")){
                  vowelsA++;
                }
    }
    return tally;
  }

}
