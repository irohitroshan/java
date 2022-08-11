package com.roshan.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorDemo {

    public static void main(String[] args) {
//Spliterator from an array
        System.out.println("Spliterator from an array");
        String[] languageArray = new String[] {"Java", "C", "C++", "Python", "Scala", "Kotlin"};
        Spliterator<String> spliteratorOfArray = Arrays.spliterator(languageArray);
        System.out.println("Traversing one element by tryAdvance");
        spliteratorOfArray.tryAdvance(System.out::println);
        System.out.println("Traversing in bulk using forEachRemaining");
        spliteratorOfArray.forEachRemaining(System.out::println);


//Spliterator from a List
         System.out.println("Spliterator from an List");
         List<String> languageList = Arrays.asList("Java", "C", "C++", "Python", "Scala", "Kotlin");
         Spliterator<String> spliteratorOfList = languageList.spliterator();
         System.out.println("estimateSize "+ spliteratorOfList.estimateSize());
         System.out.println("getExactSizeIfKnown "+spliteratorOfList.getExactSizeIfKnown());
         System.out.println("characteristics "+spliteratorOfList.characteristics());
         System.out.println("hasCharacteristics "+spliteratorOfList.hasCharacteristics(16464));


        //Spliterator from a Stream
        System.out.println("Spliterator from a Stream");
        Stream<String> languageStream = Stream.of("Java", "C", "C++", "Python", "Scala", "Kotlin");
        Spliterator<String> spliteratorOfStream = languageStream.spliterator();
        Spliterator<String> spliteratorOfStream1 =spliteratorOfStream.trySplit();
        Spliterator<String> spliteratorOfStream2 =spliteratorOfStream1.trySplit();
        System.out.println("From 1st part of split  Stream");
        spliteratorOfStream.forEachRemaining(System.out::println);
        System.out.println("From 2nd part of split  Stream");
        spliteratorOfStream1.forEachRemaining(System.out::println);
        System.out.println("From 3rd part of split  Stream");
        spliteratorOfStream2.forEachRemaining(System.out::println);


    }
}
