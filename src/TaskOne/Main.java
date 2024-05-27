package TaskOne;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Integer[] numbersArray = {1, 2, 3, 4, 2, 3, 4, 5, 6, 7, 8, 9, 9};
        List<Integer> numbers = Arrays.asList(numbersArray);
        numbers = numbers.stream().distinct().collect(Collectors.toList()); //Или Set <Integer> newNumbers = numbers.stream().collect(Collectors.toSet());
        System.out.println(numbers);
        numbers = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(numbers.stream().reduce(Integer::sum).get());
    }
}
