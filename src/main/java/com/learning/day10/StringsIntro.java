package com.learning.day10;

public class StringsIntro {

    public static void main(String[] args) {


//        -> Java Memory

//        1. Heap Memory
//                -> Java Objects will be stored in  heap, which is a portion of
//                    Java Memory dedicated to storing objects and arrays.
//                ->Heap is shared among all threads in JVM (Java virtual Machine).
//        2. Stack Memory
//                 -> Java uses stack memory to store local variables and method call information.
//                 -> Each Thread in JVM has its own stack, which is used for method calls and local variables.

//           Strings
//            String is a variable that contains a collection of Characters.
//            Strings are Immutable -> Once a String object is created, its value can not be changed.
//            When you modify a string -> it will actually create a new String.

//            String => Final class , implementing => java.io.Serializable, Comparable<String>, CharSequence,
//                                                     Constable, ConstantDesc

        String s1 = "hello world";
        String s2 = "hello world";
        String s3 = new String("hello world");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        String s4 = "hello world";
        System.out.println(s1);
        s1 = "hello";
        System.out.println(s1);

        s1 = "h";

//                   0123456789
        String s5 = "hello Java";

        System.out.println(s5.charAt(6));
        System.out.println(s5.compareTo("hello"));
        System.out.println(s5.contains("Java"));
        System.out.println(s5.startsWith("ab"));
        System.out.println(s5.endsWith("Jiva"));

        System.out.println(s5.substring(2, 7));

        System.out.println( 1== 2);  // Shallow Comparison == operator is used to check if two string
                                                              // references point to same object in memory
        System.out.println(s2.equals(s3));  // Deep Comparison => its check all the attributes and values


        //  Mutable String Classes :
//                1. StringBuilder
//                2. StringBuffer
//                     => these classes will allow you to modify strings without creating new string objects eachtime.
//                     => Both classes will provide similar functionality, but they differ in their thread safety.

//        1.StringBuilder   => its is not thread safe
//                          => which means its not suitable to use in multithreaded environments.
//                          => however it is more efficient than StringBuffer.

         StringBuilder    sb = new StringBuilder();
                    sb.append("hello");    // "hello"
                    sb.append(" ");        // "hello "
                    sb.append("world");    // "hello world"
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.toString());


//        2. StringBuffer =>  Its is thread Safe.
//                        => which means it's suitable to use in multithreaded environments.
//                        => however it is less efficient than StringBuilder.

        StringBuffer sbf = new StringBuffer();
        //           0123456789
         sbf.append("I Love Java Language");
         sbf.replace(2, 6, "Enjoy");
        System.out.println(sbf);    // the output type is still StringBuffer

        System.out.println(sbf.toString()); // the output type is String

        String output = sbf.toString();

        System.out.println(output);


    }
}
