# Lab 4: Comparators are my Favorite _Sort_ of Vectors

## Useful Links
 * [Course Homepage](http://cs.williams.edu/~cs136/index.html) (with TA schedule)
 * [Lab Webpage](http://cs.williams.edu/~cs136/labs/comparatorsort.html)
 * [Scanner Notes](http://cs.williams.edu/~cs136/handouts+problems/scanner.pdf): Useful for reading the input files!
    * [Structure5 Documentation](http://www.cs.williams.edu/~bailey/JavaStructures/doc/structure5/index.html)
    * [Structure5 Source](http://www.cs.williams.edu/~bailey/JavaStructures/Software_files/structure-source.tgz)


## Repository Contents
This repository contains the minimum starter file for `MyVector.java` and
`Student.java`.

In this lab, you will modify `MyVector.java`,
`Student.java`, an implementation of one or more Comparator classes,
and a program that reads the phone book from the input and answers some
pressing question using your Comparator applied to students.

  * `newphonebook.txt` is the Williams student phone book from 2006-2007.
    (Please do not distribute this file!)
  	Each student is represented by three lines:

```
Aamir U Wyne
Poker Flats B5
4135973427 3334 5406394821
```

 * The first line is the name of the student, the second is their
   campus address, and the third contains the campus phone, su box,
   and home phone. A -1 means that that data is not available,
   and you may ignore those values

Questions (from lab handout):
 1. Which student appears first in a printed phone book, if each name is printed as
 it appears in the data file (ie, first name first)?
 2. Which student has the smallest SU box? Largest?
 3. Which student has the most vowels in his or her full name? (You may ignore
 "Y"s when counting vowels.)
 4. Which address is shared by the most students, and what are their names? You
 may find it useful to build a second vector storing Associations between each
 address and the number of students living there. A special comparator can then
 be used to sort that vector by comparing the number of students at each
 address. Once the most common address is known, you can consult the original
 vector of Students and print those living at that address.
 5. Some students have address UNKNOWN because they are abroad, on leave, etc.
 These students should be ignored for this question. Any other student entries
 with strange formatting, should also be ignored. (But please let your
 instructor know if you find any weird entries.) What are the ten most common
 area codes for student home phone numbers, in decreasing order? Some phone
 numbers are -1 to indicate that the actual information is not available. You
 should simply disregard—for this question—students without a known home phone
 number.

Problem 6.3 (Refer to bubbleSort implementation in the text)

Problem 6.4 (You can ignore average case)

Problem 6.13 (For those sorts that are not stable, explain why)


