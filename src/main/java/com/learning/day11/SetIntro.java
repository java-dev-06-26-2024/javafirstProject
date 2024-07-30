package com.learning.day11;

import java.util.*;

public class SetIntro {

    public static void main(String[] args) {


        // Set  => all the item are unique.

//          1. HashSet   users => 1D arrays
//          2. LinkedHashset   uses => LinkedList
//          3. TreeSet         uses => Red Black trees.


//          Ven - diagrams.

//        Set<Datatype>  variableName = new HashSet<Datatype>();


        // 1. HashSet

        Set<String> set1 = new HashSet<>();
        set1.add("adam");
        set1.add("joe");
        set1.add("roy");
        set1.add("xyz");

        System.out.println(set1);

        Set<String> set2 = new HashSet<>();

        set2.add("adam");
        set2.add("joe");
        set2.add("roy");
        set2.add("kim");
        set2.add("ana");
        set2.add("abc");

        System.out.println(set2);

//        set1.retainAll(set2);  // it will find the intersection between set1 and set2 amd it stores in set1.
          set1.removeAll(set2);  // it will find the intersection between set1 and set2 and remove it from set1.

        System.out.println(set1);

        // Hashset does not follow the insertion order.

//  --------------------------------------------------------------------------------------------------
//       LinkedHashSet

//       LinkedHashSet maintains the insertion order.
//       it needs more memory than hashset.


//  -----------------------------------------------------------------------------------------------------
        // 3.TreeSet -> Class => implements SortedSet interface.

//        Red Black trees(Balanced Binary Trees).

        // time complexity => O(logN).


//          SortedSet<datatype> variableName = new TreeSet<datatype>();


        SortedSet<Integer> set5 = new TreeSet<>();

        set5.add(40);
        set5.add(40);
        set5.add(100);
        set5.add(10);
        set5.add(45);
        set5.add(20);

        System.out.println(set5);

        set5.add(100);

        System.out.println(set5);

        Set<Integer> subset =set5.subSet(10, 45);
        System.out.println(subset);

        System.out.println(set5.tailSet(40));

        System.out.println(set5.headSet(40));

        System.out.println(set5.first());

        System.out.println(set5.last());




//                HashSet                                    LinkedHashSet                                    TreeSet
//              uses arrays                                 uses LinkedList                             Balanced Binary Trees
//    Best     we can achieve O(1)                               O(1)                                        O(logN)
//    Worst           O(logN)                                    O(logN)                                     O(logN)
//            can store null values                       can store null values                          can not store null values.
//        does not follow the insertion order            follows the insertion order                     follows the sorting order.





    }
}
