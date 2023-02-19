import java.util.*;

public class Main {
    public static void main(String[] args) {
/*
Дан список студентов. У каждого студента есть имя и количество сделанных ДЗ.
Необходимо получить отсортированный в невозрастающем порядке количества
cделанных дз список студентов.
 */

    }

    public static List<Student> homeWorkList(List<Student> inList) {
        //Set<Student> outSet = new TreeSet<>(new ComparatorByHomeWork().thenComparing(new ComparatorByName()));
        Set<Student> outSet = new TreeSet<>(new ComparatorByHomeWorkAndName());
        outSet.addAll(inList);
        return new ArrayList<>(outSet);
    }
}