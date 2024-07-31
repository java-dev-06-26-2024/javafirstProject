package com.learning.day11and12;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ListIntro {

    public static void main(String[] args) {
        //         List Implementation :

//              1. ArrayList
//              2. LinkedList
//              3. Vector
//              4. Stack.

        // ArrayList

//      ArrayList<DataTyp>  variableName = new ArrayList<Datatype>();

//        int, double, boolean, float, char, long  we will not be using the primitive DataTypes.
//        Integer, Double, Long, Float, Boolean, Character   - non - primitive data type.


        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        System.out.println(numbers);
        System.out.println(numbers.size());

        numbers.remove(3);
        numbers.remove(0);
        System.out.println(numbers);

        System.out.println(numbers.size());

        System.out.println( numbers.contains(100));

//        ------------------------------------------------------------------------------------
//        time complexity : big O
//          O(1) , O(N), O(log(N)

//         1. search based on Index  -> O(1)
//         2. Search withOut Index -> O(N)
//         3. insert at end -> O(1)
//         4. inserting item at random position -> O(N)
//         5. remove last item -> O1)
//         6. remove item at random position -> O(N)

//            we have shift a lot whenever we are updating the items in ArraysList.
//            for Data retrieving ArrayList best.
//        ------------------------------------------------------------------------------------

//        LinkedList
//        Nodes
//         startingNode -> HeadNode.
//        every Node -> data and next Node Address.
        
//        All Nodes can be accessible through head node only.

//        100, 200, 300, 400, 500

        LinkedList<Integer> numberUsingLinkedList = new LinkedList<>();
        numberUsingLinkedList.add(100);
        numberUsingLinkedList.add(200);
        numberUsingLinkedList.add(300);
        numberUsingLinkedList.add(400);
        numberUsingLinkedList.add(500);
        System.out.println(numberUsingLinkedList);

        numberUsingLinkedList.remove(2);

        System.out.println(numberUsingLinkedList);
        numberUsingLinkedList.addFirst(50);

        System.out.println(numberUsingLinkedList);
        numberUsingLinkedList.addLast(1000);

        System.out.println(numberUsingLinkedList);

        System.out.println(numberUsingLinkedList.get(4));

        System.out.println(numberUsingLinkedList.getFirst());
        System.out.println(numberUsingLinkedList.getLast());

        // itme are not stored next to each other, so it's not random indexing

//          time complexity
//         1. search first Item : O(1)
//         2. searching a random element -> O(N)
//         3. Inserting element at end -> O(1)
//         4. Inserting Element at random Indexing -> O(N)
//         5. remove Last Element -> O(1)
//         6. Removing Element at random Indexing -> O(N).


//        LinkedList is used when there are more updations.


//        ---------------------------------------------------------------------------------
//         Vector

//         it's smilier to array List.
//         its synchronized -> Every operation, vector will lock the resource and unlock after the operation is done.
//         its legacy datatype.

        //        ---------------------------------------------------------------------------------

        // Stack
//        its implemented using Vector, so its synchronized.
//        LIFO => Last In Fist Out
//        pop()   -> remove the top Element
//        push()  -> add the Element at the top Of Stack.
//        peek()  -> value of Top Element.

//         Stack Memory is a special location in RAM.

        Stack<String> names = new Stack<>();
        names.push("joy");
        names.push("jim");
        names.push("kim");
        names.push("roy");

        System.out.println(names);
        System.out.println(names.peek());
        names.pop();
        System.out.println(names);

        ArrayList<Member>  users = new ArrayList<>();

        Member member1 = new Member("joy", 1, 21);
        Member member2 = new Member("jim", 2, 35);
        Member member3 = new Member("kim", 3, 12);
        Member member4 = new Member("roy", 4, 27);

        users.add(member1);
        users.add(member2);
        users.add(member3);
        users.add(member4);
        users.add(member4);
        users.add(member4);
        users.add(member4);
        users.add(member4);

        System.out.println(users);

        System.out.println(users.get(2));

        System.out.println(users.remove(member1));
        System.out.println(users);

        System.out.println(users.remove(2));
        System.out.println(users);





    }
}
