package com.learning.day13;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Enhancements {

    public static void main(String[] args) {

        // Lambda Expressions
        // Methods References
        // Functional Interfaces
        // Stream API
        // Default Methods
        // Static methods in interface.
        // Date and time API
        // Optional Class
        // Consumer Class
        // Predicate Class
        // Supplier Class


        // Functional Interfaces => if an Interface is having only one abstract method, we call it a functional Interface.

        // Lambda Expression => smilier to arrow functions in JavaScript.

        //For Lambda Expression=> we use "->" in java
        // ex: (int x) -> (x++);
        // (int x){
        // return x++;
        //}


        // Methods References: we use "::"

        List<String> mylist = Arrays.asList("Affenpinscher", "Affenpinscher","Afghan Hound", "Aidi", "Alano Español",
                "Alaskan Klee Kai", "Alaskan Malamute", "Bullenbeisser", "Bullmastiff", "Bully Kutta", "Burgos Pointer",
                "Cairn Terrier", "Canaan Dog", "Canadian Eskimo Dog", "Cane Corso", "Caucasian Shepherd Dog",
                "Istrian Shorthaired Hound","Istrian Shorthaired Hound", "Italian Greyhound", "Jack Russell Terrier", "Jagdterrier", "Jämthund",
                "Kai Ken", 	"Kai Ken",  "Kaikadi","Kaikadi", "Tweed Water Spaniel", "Tyrolean Hound", "Vizsla", "Volpino Italiano",
                "Weimaraner", "Welsh Sheepdog", "Welsh Springer Spaniel", "Welsh Terrier");

        // to Create a Stream:

        // Intermediate operations
        // filter
        // map
        // sorted
        // distinct

        // Terminal Operations
        // forEach
        // Collect
        // reduce
        // count

        Stream<String> mystream = mylist.stream();

        // we will do some operations without Methods References in Streams.

        // List the animals that start with "A" and make it uppercase.

            mylist.stream()
                    .filter(x -> {
                       return  x.startsWith("A");
                    })
                    .map(y -> y.toUpperCase())
                    .forEach(animal -> System.out.println(animal));


            // // we will do some operations with Methods References in Streams.

        mylist.stream()
                .filter(animal -> animal.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // collect

        List<String > animalsStartswithA =      mylist.stream()
                .filter(animal -> animal.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(animalsStartswithA);

        // Reduce


        String animalsStartswithBStr = mylist.stream()
                                             .filter(x->x.startsWith("B"))
                .map(y->y.toUpperCase())
                .reduce("this is My List of Animals that starts with B --", (a, b)-> a+" "+b);

        System.out.println(animalsStartswithBStr);

        // count

        long animalsCount = mylist.stream().filter(x-> x.startsWith("B"))
                .map(dog -> dog.toUpperCase())
                .count();

        System.out.println(animalsCount);


        //   // Date and time API

        LocalDate today = LocalDate.now();

        System.out.println(today);

        LocalDate anyDate = LocalDate.of(1971, 12, 16);
        System.out.println(anyDate);

        LocalTime time = LocalTime.now();
        System.out.println(time);


        LocalDateTime dateAndtime = LocalDateTime.now();
        System.out.println(dateAndtime);

        LocalDateTime dateAndtimeofAnyDate = LocalDateTime.of(1971,12, 16, 0,0,0);
        System.out.println(dateAndtimeofAnyDate);

        Duration duration = Duration.between(dateAndtimeofAnyDate, dateAndtime);
        System.out.println(duration.toHours());

// Optional Class: represent optional values. (might present or might not)


        Optional<String>   optionalData = Optional.ofNullable("user1");


        if(optionalData.isPresent()){
            System.out.println(optionalData.get());
        }

        if(optionalData.isEmpty()){
            System.out.println("no values");
        }


//        optionalData.ifPresent();  // if present will work only if data is present
//        optionalData.orElse();     // to provide the default value;
//        optionalData.get();        // give you the data.


//        Consumer Class: it takes an input, but it does not return any values.

        Consumer<String>  printConsumer = str -> System.out.println(str);

        printConsumer.accept("Hey Java...!");

        optionalData.ifPresent(printConsumer);


//       Predicate Class: it takes an input, its does return a boolean values.
//        Mostly, we will use this one for filtering.

        Predicate<String>   isWordStartsWithA = str -> str.startsWith("A");

        System.out.println("This is word start with A or not : " + isWordStartsWithA.test("Class"));
        List<String > animalsStartswithAwithPredicate =      mylist.stream()
                .filter(isWordStartsWithA)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(animalsStartswithAwithPredicate);

//        Supplier Class: it will not take any input, but it will provide the output.
        Supplier<String>   greetSupplier = () -> "Hey Java...!";

        System.out.println("Supplier output is :" + greetSupplier.get());


        Supplier<Integer> numberSupplier = () -> (int)(Math.random() *100);
        System.out.println(numberSupplier.get());


        Supplier<LocalTime> timeSupplier = ()-> LocalTime.now();
//          Supplier<LocalTime> timeSupplier =LocalTime::now;

        System.out.println(timeSupplier.get());


    }

}
