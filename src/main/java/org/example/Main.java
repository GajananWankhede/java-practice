package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList();
//        Map<Character, Long> charFrequency = "tatamotorsanddocomo".chars() //Stream<String>
//                .flatMap(a -> a.chars().mapToObj(c -> (char) c)) // Stream<Character>
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        System.out.println(charFrequency);

//        Map<Character, Long>  charFrequency =  "abcabcabcd".chars().mapToObj(c->(char)c).collect(Collectors.toList()).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(m->m.getValue()>2).collect(Collectors.toList());




//      System.out.println("abcabcabcd".chars().mapToObj(c->(char)c).collect(Collectors.toList()).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(m->m.getValue()>2).collect(Collectors.toList()));

        System.out.println("abcabcabcd".chars().mapToObj(c->(char)c).collect(Collectors.toList()).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(m->m.getKey() != 'a').collect(Collectors.toList()));

        String str = "";
        List<Character> charS = new ArrayList<>();
        for(int i=0;i< str.length();i++){
            charS.add(str.charAt(i));
        }


    }
}