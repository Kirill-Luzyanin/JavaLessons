/*
Есть список машин (номер, модель, год выпуска), нужно написать метод, который вернет мапу,
где ключом является "возраст" маашины, а значением список машин этого года.
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Main {

    private final static int YEAR = 2023;

    public static void main(String[] args) {

        /*List<Car> list = List.of(
                new Car("Audi", "BR97", 2018),
                new Car("Opel", "F01", 2012),
                new Car("BMW", "G12", 2018),
                new Car("Mercedes", "A747", 2015)
        );

        System.out.println(listOfCars(list));*/

    }

    public static int getCurrentYear() {
        return YEAR;
    }

    public static Map<Integer, HashSet<Car>> listOfCars(List<Car> list) {
        Map<Integer, HashSet<Car>> result = new HashMap<>();
        for (Car car : list) {
            int carAge = getCurrentYear()- car.getYearOfRelease();
            if (!result.containsKey(carAge)) { // проверили, содержит ли мэпа ключ
                HashSet<Car> cars = new HashSet<>(); // создали новый сет для нового ключа
                cars.add(car); // положили машинку по новому ключу
                result.put(carAge,cars); // добавили сет в мэпу
            } else {
                HashSet<Car> hashSet = result.get(carAge); // получили значение сета по ключу
                hashSet.add(car); // положили машинку по старому ключу
                result.put(carAge,hashSet); // перезаписали значение в мэпу по ключу
            }
        }
        return result;
    }


}