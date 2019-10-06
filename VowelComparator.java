//We are the sole authors of the work in this repository.
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
    int vowelsA = vowelTally(a);
    int vowelsB = vowelTally(b);

    if(vowelsA > vowelsB){
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
      if(a.getName().substring(i,i+1).equalsIgnoreCase("a") ||
          a.getName().substring(i,i+1).equalsIgnoreCase("e") ||
            a.getName().substring(i,i+1).equalsIgnoreCase("i") ||
              a.getName().substring(i,i+1).equalsIgnoreCase("o") ||
                a.getName().substring(i,i+1).equalsIgnoreCase("u")){
                  tally++;
                }
    }
    return tally;
  }

}
