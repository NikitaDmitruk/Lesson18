package TaskWithStar;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<>();
        Integer[] needsId = {1, 2, 5, 8, 9, 13};
        names.put(1, "Петро");
        names.put(2, "Ивано");
        names.put(3, "Наталья");
        names.put(4, "Иосиф");
        names.put(5, "Андрей");
        names.put(6, "Валентин");
        names.put(7, "Валентин");
        names.put(9, "Валентина");
        names.put(11, "Валентина");
        names.put(12, "Валентин");
        names.put(13, "Валентин");
        names.put(8, "Валентин");
        List<String> reverseNames = names.entrySet().stream()
                .filter(x -> Arrays.asList(needsId).contains(x.getKey()))
                .filter(x -> x.getValue().length() % 2 != 0)
                .map(y -> {
                    StringBuilder name = new StringBuilder(y.getValue());
                    return name.reverse().toString();
                })
                .collect(Collectors.toList());
        System.out.println(reverseNames);
    }
}