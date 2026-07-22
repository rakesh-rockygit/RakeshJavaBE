package functionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import collections.arrayList;



public class implementFunction {
    public static void main(String[] args) {
        Function<String, String> strToken = (s) -> s.toUpperCase();
        Function<Integer, String> intTostr = (n) -> "Number : " + n;

        System.out.println(strToken.apply("Function"));

        //boolean
        Predicate<Integer> isEven = (n) -> {
            return (n%2 == 0);
        };

    System.out.println("isEven:" + isEven.test(10)); 
    System.out.println("isEven:" + isEven.test(11));

    List<Integer> numList = new ArrayList<>();
    numList.add(4);
    numList.add(5);
    numList.add(6);
    numList.add(9);
    numList.add(10);
    numList.add(11);
    numList.add(12);

//Streams - Identify the list of even elements from a List of integer.
List<Integer> evenList = numList.stream()
.filter(n -> (n%2 == 0))
.toList();
System.out.println("evenList:" + evenList);

Integer[] salaryArray = {4000, 5000, 7000, 9000, 6000};
Stream<Integer> streamofSalaries = Arrays.stream(salaryArray);
Stream<Integer> salaryStream = Stream.of(4000, 5000, 7000, 9000, 6000);

List<String> strs = List.of("Test1", "Test2", "Test3", "Test4");
List<String> upperStr = strs.stream()
           .map((s) -> {
            return s.toUpperCase();
           }).toList();
Stream.Builder<Integer> streamBuilder = Stream.builder();
System.out.println("upper strings:" + upperStr);

List<Integer> salHR = List.of(4000, 5000, 6000, 9000);
List<Integer> salPM = List.of(8000, 9000, 10000, 11000);
List<Integer> salEn = List.of(4000, 5000, 6000, 8000);
List<List<Integer>> salaries = Arrays.asList(salHR, salPM, salEn);

List<Integer> allSalaries = salaries.stream()
                 .peek(System.out::println)
                 .flatMap((sal) -> {
                    return sal.stream();
                 }).toList();

System.out.println("combined list of salaries:" + allSalaries);

List<Integer> numbers = Arrays.asList(2,1,4,7,10);
List<Integer> numberStream = numbers.stream()
                        .filter((Integer val) -> val >=3) //4,7,10
                        .map((Integer val) -> (val * -1)) //-4,-7,-10
                        .sorted().toList(); //-10,-7,-4

           }

           public boolean isEven(Integer n) {

            if(n%2 == 0) {
                return true;
            }
            return false;
           }

    
    






    }




