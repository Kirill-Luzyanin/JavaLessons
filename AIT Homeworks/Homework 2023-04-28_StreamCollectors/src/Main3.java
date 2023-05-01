
/*
Допустим, Вы пишите программу для отображения статистики по играм НХЛ (привет Алексею 😀 ).
Допустим, у вас есть объект GameInfo {String team1, String team2, int goalsTeam1, int goalsTeam2}
(соответственно, goalsTeam1 – количество голов забитых командой Team1).
Естественно дан список таких объектов.
Необходимо получить Map, где ключом будет название команды, а значением, количество забитых голов.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {

        //new GameInfo("Washington", "Pittsburgh", 60, 90),
        //new GameInfo("NYR", "NJD", 120, 100),

        GameInfo game1 = new GameInfo("Boston", "Florida", 5, 1);
        GameInfo game2 = new GameInfo("Boston", "Florida", 2, 0);
        GameInfo game3 = new GameInfo("Boston", "Florida", 0, 1);
        GameInfo game4 = new GameInfo("Boston", "Florida", 0, 1);
        GameInfo game5 = new GameInfo("Boston", "Florida", 0, 1);


        Stream.of(game1, game2, game3, game4, game5)
                .collect(Collectors.groupingBy(s -> s.getTeam1(), Collectors.counting()));

        //System.out.println(persons2);

    }

    /*
    public static Map<Person,Integer> newMap(Stream<Person> persons) {
        //Map<Person,Integer> result = new HashMap<>();

        persons.collect(Collectors)

        return persons.collect(Collectors.groupingBy(s->s, s->s.length))
        //return result;
    }

     */

}