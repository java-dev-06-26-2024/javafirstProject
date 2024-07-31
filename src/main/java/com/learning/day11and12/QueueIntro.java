package com.learning.day11and12;

import com.learning.day6and7and8.A;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueIntro {


    public static void main(String[] args) {


        // Queues

        // FIFO => First in First Out    -> O(1)

        // ArrayList and LinkedList


//        enqueue() -> Insert an Element
//        dequeue() -> Delete an Element
//        peek()    -> return a value

//          --- throws Exceptions                                    returns a value s
//              add()                                                   offer()
//              remove()                                                poll()
//              element()                                               peek()


        // Queues are useful when a resources are shared with several consumers.

//         Queues are very IMP in CPU schedules.

//        Threads are stored in Queues.


//        Queue<dataType>  variableNAme = new ArrayList<>();
//        Queue<Datatype>  variableName = new LinkedList<>();


        Queue<String> names = new LinkedList<>();
        names.offer("joy");
        names.add("jim");
        names.add("kim");
        names.offer("roy");

        System.out.println(names);

        names.remove();   // remove element

        System.out.println(names);

        names.poll();  // remove element

        System.out.println(names);

        System.out.println(names.element());
        System.out.println(names.peek());

//        ------------------------------------------------------------------------------

//        Priority Queue
//        It will sort the Queues based on Priority.
//        we will assign a priority values to every single Item.
//        elements will high priority will server before low priority elements.


       // ------------------------------------------------------------------------------
//        Deque => Double endedQueue

        Deque<Integer> values =new ArrayDeque<>();

//        addFirst();
//        addLast();
//        removeFirst();
//        removeLast();
        // ------------------------------------------------------------------------------

        Deque<String> stack = new ArrayDeque<>();

//        Stack (arrayDeque) is faster than normal stack data structure.
//         because stack is synchronized as its extended vector, that's why arrayDeque is faster than normal stack.

    }
}
