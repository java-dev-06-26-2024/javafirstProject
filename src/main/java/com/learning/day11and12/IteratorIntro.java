package com.learning.day11and12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class IteratorIntro {

    public static void main(String[] args) {

        // it is used to read the data from all the collection implementation classes.

//        we can read  and remove the data using the Iterator.
//          Methods :
//         hashNext(); // if next element is present, then it will return true
//         next(); // value of next element
//         remove(); remove the element;


        ArrayList<String> names = new ArrayList<>();
        names.add("joy");
        names.add("jim");
        names.add("kim");
        names.add("roy");

        Iterator<String> itr = names.iterator();

        System.out.println(itr.hasNext());  // it will check if it has next element or not.
        System.out.println(itr.next());  // provide the next value

        while(itr.hasNext()){
            System.out.println(itr.next());
        }



    }
}
