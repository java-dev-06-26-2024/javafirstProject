package com.learning.day11and12;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsIntro {

    public static void main(String[] args) {


//        Maps    => Key and values => Pair  => pair we call it as Entry.
//        1. HashMap
//        2. LinkedHashMap
//        3. TreeMap

//        aim to reach O(1)



//                 arrays               >   Binary trees                 > Balanced Binary Trees            > hash functions
//                  O(N)                    O(logN)  -> not 100%               O(logN)                             O(1)


//         we want all the operations to be O(1).

//        Hash functions => it defines the relationship between keys and the memory index.

//
//        {   key: value
//            "ab":21,
//            "bc":45,
//            "cd": 66
//        }

        // Collisions are inserting multiple keys into single memory index.
//       Time complexity
//                 avg case               worst case
//      searching   O(N)                      O(N)
//       Inserting  O(1)                      O(N)
//       removing   O(1)                      O(N)


//        HashMap<keySDatatype, valueDataType>   variableName = new HashMap<keySDatatype, valueDataType>();

        HashMap<String, Integer> personsAge = new HashMap<>();
        personsAge.put("adam", 21);
        personsAge.put("joy", 32);
        personsAge.put("sam", 42);
        personsAge.put("null", 55);

        System.out.println(personsAge);

        System.out.println(personsAge.get("joy"));


        HashMap<Integer, Member> memberHashMap = new HashMap<>();

        Member member1 = new Member("joy", 1, 21);
        Member member2 = new Member("jim", 2, 35);
        Member member3 = new Member("kim", 3, 12);
        Member member4 = new Member("roy", 4, 27);

         memberHashMap.put(member1.getId(), member1);
         memberHashMap.put(member2.getId(), member2);
         memberHashMap.put(member3.getId(), member3);
         memberHashMap.put(member4.getId(), member4);

         System.out.println(memberHashMap);

         memberHashMap.put(member1.getId(), member4);

        System.out.println(memberHashMap);


        System.out.println(memberHashMap.get(3));

        for(String key : personsAge.keySet()){
            System.out.println(personsAge.get(key));
        }

        for (Map.Entry<String, Integer> entry: personsAge.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


//         HashMap will accept null as key.
//         HashMap does not follow the insertion order.

//        -----------------------------------------------------------------------------------------------------
//        LinkedHashMap

//        uses the Double-Linked List
//        needs more memory
//        LinkedHashMap will also accept the null as key.
//        LinkedHashMap does follow the insertion order.

//         LinkedHashMap<KeyDataType, valueDatatype> variableName = new LinkedHAshMap<KeyDataType, valueDatatype>();
        //         LinkedHashMap<KeyDataType, valueDatatype> variableName = new LinkedHAshMap<>();

//        -----------------------------------------------------------------------------------------------------

        // TreeMap -> Class -> implementing the SortedMap Interface  => O(logN)

//        Balanced Binary Trees => AVL Trees, Red-Black Trees.

//        TreeMap<KeyDataType, valueDatatype> variableName = new TreeMap<KeyDataType, valueDatatype>();

        TreeMap<Double, String> prices = new TreeMap<>();
        //
        prices.put(520.25, "dell Laptop");
        prices.put(325.35, "Lenovo Laptop");
        prices.put(112.35, "hp laptop");
        prices.put(999.99, "Mac Laptop");
        prices.put(625.75, "Asus Laptop");

        System.out.println(prices);

        System.out.println(prices.firstKey());

        System.out.println(prices.lastKey());

        System.out.println(prices.lastEntry());

        System.out.println(prices.firstEntry());



//                                         HashMap                                      LinkedHashMap                                         TreeMap
//                                       uses Arrays                               uses doubleLinkedList                               BalancedBirarytrees
//        time complexity best case       can achieve O(1)                             can achieve O(1)                                 O(longN)    => 100%
//                       worst case           O(logN)                                     O(logN)                                            O(logN);
//                                    we can have null as key                        we can have null as key                         we can not have a null as key.
//                               does not follow the insertion order              does  follow the insertion order                      follow the sorting order






    }
}
