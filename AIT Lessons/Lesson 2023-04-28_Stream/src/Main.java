import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("1: " +
                Stream.of("qwe", "qwe1", "qwe2", "qwe1")
                        //.collect(Collectors.toList())
                        //.collect(Collectors.toSet())
                        .collect(Collectors.toUnmodifiableList())
        );

        System.out.println("2: " +
                Stream.of("qwe", "qwe1", "qwe2", "qwe1")
                        .collect(Collectors.toCollection(TreeSet::new))
        );

        System.out.println("3: " +
                Stream.of("qwe87", "qwe3133", "qwe222223332", "qwe1")
                        .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(String::length))))
        );

        System.out.println("4: " +
                Stream.of("qwe0", "qwe1", "qwe2", "qwe1")
                        .collect(Collectors.joining("-", "[:", ":] stream is the best"))
        );

        System.out.println("5: " +
                Stream.of("aa", "dd", "cc", "aa", "bb", "jj")
                        .collect(Collectors.collectingAndThen(
                                Collectors.toCollection(TreeSet::new),
                                tSet -> tSet.tailSet("bb")
                        ))
        );

        Map<Integer, String> map1 = Stream.of("qwe87", "qwe3133", "qwe222223332", "qwe1", "qwe2")
                .collect(Collectors.toMap(s -> s.length(), s -> s, (s1, s2) -> (s1 + "|" + s2), TreeMap::new)); // 3 параметр - merge function // 4 параметр - какую именно коллекцию
        System.out.println("6: " + map1);


        Map<Integer, List<String>> map2 = Stream.of("qwe87", "ggw87", "qwe3133", "qwe2222222344", "qwe1", "qwe2")
                //.collect(Collectors.groupingBy(s -> s.length()));
                .collect(Collectors.groupingBy(String::length));  //собираем map, где значение - лист
        System.out.println("7.1: " + map2);


        Map<Integer, Long> map3 = Stream.of("qwe87", "ggw87", "qwe3133", "qwe2222222344", "qwe1", "qwe2")
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));  //собираем map, где значение - длина листа
        System.out.println("7.2: " + map3);


        Map<Boolean, List<String>> map4 = Stream.of("q", "ee","uu","qgw87", "gwe87", "qwe3133", "qwe2222222344", "qwe1", "qwe2").
                collect(Collectors.partitioningBy(s -> s.length() > 3));
        System.out.println("8: " + map4);


    }
}