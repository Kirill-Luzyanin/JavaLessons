/*
* Дан массив, с указанием пути в виде последовтельных инструкций "NORTH", "SOUTH", "WEST", "EAST".
 Очевидно, что идущие подряд противоположные инструкции {... "NORTH", "SOUTH"....} не имеют полезного
 результата, и  могут быть сокращены. В то время как набор инструкций {"NORTH","SOUTH", "SOUTH"} - вполне
 валидный. Написать метод, который оптимизирует набор инструкций

{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"} -> {"WEST"}
* */

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = List.of("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST");
        System.out.println(optimisedPath(list));

    }

    public static List<String> optimisedPath(List<String> path) {

        Map<String, String> map = new HashMap<>();
        map.put("NORTH", "SOUTH");
        map.put("SOUTH", "NORTH");
        map.put("WEST", "EAST");
        map.put("EAST", "WEST");

        Deque<String> stack = new LinkedList<>();

        for (String direction : path) {
            if (map.get(direction).equals(stack.peek())) { //peek - смотрит, но не забирает
                stack.pop(); //pop - выкидывает элемент
            } else {
                stack.push(direction); // push - кладет элемент
            }

        }
        List<String> result = new ArrayList<>();
       /* for (Iterator<String> it = stack.descendingIterator(); it.hasNext(); ) {
            String direction = it.next();
            result.add(direction);
        }*/

        /*
            List<String> result = new ArrayList<>(stack);
            Collections.reverse(result);
            return result;
        */

        while (stack.size() != 0) {
            result.add(stack.pollLast()); //для обратного порядка
        }
        return result;
    }

}