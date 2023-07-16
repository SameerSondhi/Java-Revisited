package com.practice.employees;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.function.Predicate.not;

public class Streams {
    public static void main(String[] args) {
        String peopleText = """
                Flinstone, Fred, 1/1/1900, Programmer, {locpd=2500,yoe=10,iq=140}
                Flinstone, Fred, 1/1/1900, Programmer, {locpd=4000,yoe=10,iq=140}
                Flinstone, Fred, 1/1/1900, Programmer, {locpd=5000,yoe=10,iq=140}
                Flinstone, Fred, 1/1/1900, Programmer, {locpd=6000,yoe=10,iq=140}
                Flinstone, Fred, 1/1/1900, Programmer, {locpd=7000,yoe=10,iq=140}
                Flinstone, Fred, 1/1/1900, Programmer, {locpd=9000,yoe=10,iq=140}
                Flinstone, Fred, 1/1/1900, Programmerzzzzz, {locpd=10000,yoe=10,iq=140}
                Flinstone2, Fred2, 1/1/1900, Programmer, {locpd=1300,yoe=14,iq=100}
                Flinstone3, Fred3, 1/1/1900, Programmer, {locpd=2300,yoe=8,iq=105}
                Flinstone4, Fred4, 1/1/1900, Programmer, {locpd=1630,yoe=3,iq=115}
                Flinstone5, Fred5, 1/1/1900, Programmer, {locpd=5,yoe=10,iq=100}
                Rubble, Barney, 2/2/1905, Manager, {orgSize=300,dr=10}
                Rubble2, Barney2, 2/2/1905, Manager, {orgSize=100,dr=4}
                Rubble3, Barney3, 2/2/1905, Manager, {orgSize=200,dr=2}
                Rubble4, Barney4, 2/2/1905, Manager, {orgSize=500,dr=8}
                Rubble5, Barney5, 2/2/1905, Manager, {orgSize=175,dr=20}
                Flinstone, Wilma, 3/3/1910, Analyst, {projectCount=3}
                Flinstone2, Wilma2, 3/3/1910, Analyst, {projectCount=4}
                Flinstone3, Wilma3, 3/3/1910, Analyst, {projectCount=5}
                Flinstone4, Wilma4, 3/3/1910, Analyst, {projectCount=6}
                Flinstone5, Wilma5, 3/3/1910, Analyst, {projectCount=9}
                Rubble, Betty, 4/4/1915, CEO, {avgStockPrice=300}
                """;

        peopleText
                .lines()
                .map(Employee::createEmployee)
                .map(e->(Employee)e)
                .map(Employee::getFirstName)
                .map(firstName -> firstName.split(""))
                .flatMap(Arrays::stream)
                .map(String::toLowerCase)
                .distinct()
                .forEach(System.out::print);


        // Pipeline
        Predicate<String> dummyEmployeeSelector = s -> s.contains("Programmerzzzzz");
        int sum = peopleText
                .lines()
                .filter(dummyEmployeeSelector.negate())
                .map(Employee::createEmployee)
                .map(e->(Employee)e)
//                .sorted((x,y)->Integer.compare(x.getSalary(),y.getSalary()))
//                .distinct()
//                .filter(not(e-> e.getLastName().equals("N/A")))
//                .filter(not(e -> e instanceof Programmer))
//                .filter(e-> e.getSalary()>5000 && e.getSalary()<10000)
                .collect(Collectors.toSet()).stream()
                .sorted(comparing(Employee::getLastName)
                        .thenComparing(Employee::getFirstName)
                        .thenComparing(Employee::getSalary))
                .mapToInt(Streams::showEmpAndGetSalary)
                .sum();

        System.out.println(sum);
    }

    public static int showEmpAndGetSalary(IEmployee e) {
        System.out.println(e);
        return e.getSalary();
    }


//        record Car(String make, String model){}
//

//        try {
//            Files.lines(Path.of("/Users/sameersondhi/Desktop/NeutrinoJava/Employees/src/main/java/com/practice/employees/employees.txt"))
//                    .forEach(System.out::println);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        Collection<String> nums = Set.of("one", "two", "three", "four");
//        nums
//            .stream()
//            .map(String::hashCode)
//            .map(Integer::toHexString)
//            .forEach(h -> System.out.printf("%h%n", h));
//
//        Stream.of("one", "two", "three", "four")
//            .map(String::hashCode)
//            .forEach(h -> System.out.printf("%h%n", h));
//
//        Stream.of(new Car("Ford", "Bronco"), new Car("Tesla", "Model X"), new Car("Tesla", "Model 3"))
//                .filter(c -> "Tesla".equals(c.make))
//                .forEach(System.out::println);
//
//        String myVar = null;
//        Stream.ofNullable(myVar) // If there are null values, the stream pipeline does not execute
//                .forEach(System.out::println);
//        Stream.empty() // If there are null values, the stream pipeline does not execute
//                .forEach(System.out::println);
//
//        IntStream.of(1,2,3,4,5) // IntStream is its own type, and needs its values to be converted to Strings
//                .forEach(System.out::println);
//
//        IntStream.range(1,101) // Not technically a stream of integers, IntStream data type
//                .forEach(System.out::println);
//
//        IntStream.rangeClosed(1,5) // start and end inclusive
//                .mapToObj(String::valueOf)
//                .map(s->s.concat("-"))
//                .forEach(System.out::println);
//
//        String[] names = {"terry", "sam", "jake"};
//        Arrays.stream(names)
//                .map(String::toUpperCase)
//                .forEach(System.out::println);;
    }

