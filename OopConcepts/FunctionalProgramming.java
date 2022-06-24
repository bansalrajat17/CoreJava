package oopconcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import oopconcepts.covariant.Person;

public class FunctionalProgramming {
    void lambda() {
        
        Person person1 = new Person();
        person1.setName("Java");
        Person person2 = new Person();
        person2.setName("C");
        List<Person> persons = new ArrayList<>();

        persons.add(person1);
        persons.add(person2);

        // FOR EACH LOOP
        persons.forEach(p -> System.out.println("LAMBDA DEMO" + p.getName()));

        persons.forEach(System.out::println);

        // STREAM AND MAP FUNCTION

        System.out.println("STREAM AND MAP FUNCTION DEMO");
        persons.stream().map(Person::getName).forEach(System.out::println); // Using Method Reference

        // FLAT MAP FUNCTION

        List<String> s1List = Arrays.asList("a", "v", "c");
        List<String> s2List = Arrays.asList("x", "d", "f");
        List<List<String>> sList = Arrays.asList(s1List, s2List);
        List<String> flattenedList = sList.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println("FLATMAP DEMO" + flattenedList);

        // FILTER INTERMEDIATE FUNCTION

        List<Person> personList = persons.stream().filter(p -> p.getName().equals("C")).collect(Collectors.toList());

        System.out.println("FILTER DEMO" + personList);

        // SORTED INTERMEDIATE FUNCTION

        List<String> unsortedList = Arrays.asList("Java", "C", "Python");

        unsortedList = unsortedList.stream().sorted().collect(Collectors.toList());
        System.out.println("SORTED DEMO:-");
        unsortedList.forEach(System.out::println);

        // REDUCE INTERMEDIATE FUNCTION

        List<String> unreducedList = Arrays.asList("Javascript", "TypeScript", "Java", "C++");
        System.out.println("REDUCE DEMO" + unreducedList.stream()
                .reduce((string1, string2) -> string1.length() > string2.length() ? string1 : string2));

        // DISTINCT FUNCTION

        List<String> distinctList = Arrays.asList("Java", "Apple", "Java", "Mango");
        distinctList = distinctList.stream().distinct().collect(Collectors.toList());
        System.out.print("DISTINCT DEMO" + distinctList);

        // PEEK FUNCTION

        // PEEK IS USED FOR DEBUGGING PUPOSE

        System.out.println("PEEK DEMO");
        Stream.of("Java", "C", "Javascript", "C++").filter(element -> element.length() == 4)
                .peek(e -> System.out.println(e));

        // LIMIT INTERMEDIATE FUNCTION

        System.out.println("LIMIT DEMO");
        Stream.of("Java", "C", "Javascript", "C++").limit(2).forEach(System.out::print);

        // SKIP INTERMEDIATE FUNCTION

        System.out.println("SKIP DEMO");
        Stream.of("Java", "C", "Javascript", "C++").skip(2).forEach(System.out::print);

    }
}
