/*
Дан список Programmer(String name, String city, List<Task>  tasks).
Каждый программист  имеет список задач Task (int Number, String description, String status, int daysInProcessing).
Используя Stream сформировать лист из 5 задач которые дольше всего находятся в работе.
 */

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Task> tasks1 = List.of(
                new Task(1, "Backend", "в работе", 5),
                new Task(2, "Frontend", "не начат", 0),
                new Task(3, "Design", "в работе", 3)
        );

        List<Task> tasks2 = List.of(
                new Task(1, "Backend", "в работе", 10),
                new Task(2, "Frontend", "не начат", 0),
                new Task(3, "Design", "в работе", 2)
        );

        List<Task> tasks3 = List.of(
                new Task(1, "Backend", "в работе", 4),
                new Task(2, "Frontend", "не начат", 0),
                new Task(3, "Design", "в работе", 1)
        );

        List<Programmer> programmers = List.of(
                new Programmer("Кирилл", "Москва", tasks1),
                new Programmer("Алексей", "Берлин", tasks2),
                new Programmer("Наталия", "Нью-Йорк", tasks3)
        );


        Stream<Programmer> berlin = programmers.stream().filter(p -> p.getCity().equals("Берлин"));

        System.out.println(berlin.count());
        // 2 раза стрим не выполянется: // IllegalStateException в этом стриме уже исполнен терминальный оператор
        //berlin.sorted().limit(1).forEach(s-> System.out.println(s));



        List res = programmers.stream()
                .flatMap(programmer -> programmer.getTasks().stream())
                .filter(t->t.getDaysInProcessing()>0)
                //.sorted(Comparator.comparingInt(Task::getDaysInProcessing).reversed())
                // или так:
                .sorted(Comparator.comparingInt((Task t)->t.getDaysInProcessing()).reversed())
                // или так:
                //.sorted((t1,t2)->t2.getDaysInProcessing()-t1.getDaysInProcessing())
                .limit(5)
                .collect(Collectors.toList());

        //res.forEach(System.out::println);
        res.forEach(s-> System.out.println(s));
    }
}