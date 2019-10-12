Questions (from lab handout):

1. Problem 6.4 (ignore the average case)
    The best case scenario for bubble sort would be if all the values in the list
    are already in their desired positions in relation to one another. In this
    case, bubble sort would only need to run once through the list, which would
    be of O(n), because no values would need to be switched and the list will be
    deemed sorted. The worst case scenario would be if all the values are in the
    exact opposite order in which they need to be sorted (eg. numbers are in
    descending order when they need to be in ascending order). In this case, the
    time complexity would be of O(n^2) because every value in the list of n
    values would need to be sorted n times.

2. Problem 6.13 (for those sorts that are not stable, explain why)
    Insertion sort is stable, because similar to bubble sort, when two equal
    values are compared to one another, no change occurs. Merge sort is also stable
    because, if two arrays are to be merged, and two
    elements of equal value are compared, the element being added does not swap
    locations with the element already in the list. The element being added is
    inserted one position after the element already in the list, maintaining the
    original order of the two elements. Selection sort is not
    stable because when the array is being sorted, elements can swap positions
    with any other element in the list, which cam violate the initial ordering of equal values in the list. Quick sort is also not stable because it places elements less than a certain pivot element before that pivot, and elements greater than the pivot after the pivot, so the initial order of equal elements can be violated.

3. Problem 6.14
   *$ (-1) Actually, the answer is no. We have not moved any other elements, so
      we cannot recurse on the left and right. (However, the pivot element can
      be removed and the remaining n-1 elements can be recursed on. The array
      will be correctly sorted with these changes, but it the algorithm will be
      significantly slower (and will no longer look like quicksort).)*
    Yes, because partition would return the correct index of the leftmost value, and then quicksort would continue to execute recursively.

4. Provide a brief, high-level description of the purpose of the code in each submitted Java file.
    AddressComparator.java includes a Comparator class which allows the comparison of two
    Associations<String, Integer> based on the size of their values. It also has a static method which is used to generate a MyVector of associations between an address and the number of Students at that address.

    AnalyzeBook.java contains a main method that reads the phonebook into a vector of Students
    and then sorts that vector to answer the questions. It also contains a static method to
    generate a MyVector of Associations between area code and the number of Students who have
    that area code.

    AreaCodeComparator.java contains a Comparator class that allows the comparison of two Associations<Long, Integer> based on the size of their values.

    MyVector.java contains a class which extends Vector and includes a method which sorts
    MyVector using selection sort and a Comparator.

    NameComparator.java contains a Comparator class which compares two Students' names alphabetically and ignoring case.

    Student.java allows the creation of a Student object which contains all the information
    from a single entry in the phonebook.

    SUBoxComparator.java contains Comparator class which compares two Students' SUBox numbers
    based on size.

    VowelComparator.java contains a Comparator class which compares two Students' names based
    on how many vowels they have.

5. Finally, demonstrate that your program answers the Phonebook questions in step 5 by pasting in your program’s output. Please format this nicely so that it is easy for us to see that you correctly answered each question!

Problem 1
First name alphabetically: Aalayah Rasheed

Problem 2
*$ Make sure to print the names of the students who own these SU boxes too.*
Smallest SU Box: 1000
Largest SU Box: 5008

Problem 3
Name with largest number of vowels: Pierre-Alexandre C Meloty-Kapella

Problem 4
*$ Actually, this problem was aiming to search through the full address (aka.
   building & room number) not just the building. Can you think of a way to
   modify your code to get the correct answer?*
Students living at address 'Williams:'
Sophia A Sequeira
Miriam E Chotiner-Gardner
Alexandre D Massicotte
Virginia A Cumberbatch
Juanita A Monsalve
Alison L Hansen-Decelles
Rebecca A Bacchioni
Abiy Hailemichael
William OSP Bobseine
Teresa I Shirkova
Lawrence A O'Boyle
Alexander L Creighton
Madeleine L Nyhagen
Joseph E Mastracchio
Emily E Greenberger
Christopher A Chudzicki
Samantha V Carouso
Eben R Joondeph-Hoffer
Michael C Moorstein
III Paul J Burgdorf
Alexander N Beecher
Christina A Metcalf
Eva K Breitenbach
Kathleen D Blankshain
Carl D Breitenstein
Elizabeth B Brickley
Kimberly AM Middleton
Annick M Benavides
Alexus N Mokover
Laura M Caccamo
David A Moore
Jr David T Caparrelli
Kerani A McClelland
Alexandra J Gordon
Sophie E Mason
Kathleen A Creel
Timothy P Marinelli
Elizabeth W Curtiss
Andrew P D'Ambrosio
Michael DeJoseph
Makisha P S Maier
Mia S DeSimone
Jared PA Quinton
Sheriney L Frederick
Jonathan LB Levinsohn
Nicholas G Lebedoff
Thomas M Samuelson
Abigail M Wood
Amanda E Huey
Andrew P Wesbey-Fowler
Elizabeth M Johnson
Rebecca A Kane
Elizabeth B Kapnick
Torrey E Taussig
Eric H Koenigsberg
Ambika C Thoreson
Alexander P Taylor
Michael S Tcheyan
Nora H Spiegel
Joya C Sonnenfeldt
William B Whiston
Aaron M Slater
Cameron M Skinner
Amy D Siedlecki
Andrew E Yoo
Christina F Sanders
Hannah S Rosenthal
James S Quella
Rebecca J Pickard
Anne M O'Leary
Mathew K Obengo
Anna S Moseley
Jimi N Morales
Cassandra B Bagay
Caleb C Balderston
Audrey E Bell
Kiel R Bonhomme
Ethan P Buchsbaum
Evita D Bullen
Eunhae Cho
Edward R Mazurek
Kristen A C Clayton
Brookes LM Clemmons
Peter J Copelas
Reid C Covington
Jane E Manfred
Marina C Harnik
Timothy J Flanagan
Jonathan M Galinsky
Allison R Goldberg
Kefei Lei
Michael L Kirwan
Joanna C Hoffman
Joseph R Jacobsohn
Christine M Jones
Leah C Katzelnick
Melissa E Kemp
In Daniel Kim
Jared F Oubre
Shuntu Kuang
David S Kulik
Christopher J Law
Allegra M Hyde
Andrew S Lee
Sarah S Lee
Andrew L Graham
David L Golkin
Tarik M Fayad
Daniel P Fast
Michael G Drzyzga
Graham J McCulloch
Adam M Baron
Holti Banka
Nora C Mitchell
Taryn G Rathbone
Scott W Olesen
Andrea D Park
Ashley S Parsons
Jeffrey W Perlis
Patrick D Rhine
Martin N Rios
Marco P Sanchez
Sarah K Sedney
Evan S Seely
Elly J Teitsworth
Whitney B Thayer
Erik J Tillman
James R Trotta
Bolor Turmunkh
Kate L Yandell
Jessica G Beck
Taryn S Goodman
Riley T Maddox
Daniel J Wong
Paul W Hess
Lily C Zhou
John R Withers
Sarah L Webb
Komal K Shah
John C McLeod
James Y Kim
Esther Jun
Ryan M Glassett
Mary K Gelber
James R Dunn
Janay L Clyde
Steven PS Cheng
Bryan H Wrapp
Nancy Ma
Gary Jin
Crosby F Fish

Problem 5
10 most frequent area codes starting with most common:
413
203
718
914
978
781
212
973
860
617
