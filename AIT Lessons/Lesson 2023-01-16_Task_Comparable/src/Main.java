/*
Предположим, вы пишите программу для on-line магазина (за основу можно взять проект с товарами, который мы уже писали).
У каждого товара есть наименование, артикул, цена и т.д. Ваша программа должна предлагать пользователю выбрать, как бы
он хотел сортировать товары и, в зависимости от выбора пользователя, выводить список товаров в нужном порядке.

 */


import java.util.*;

public class Main {
    public static void main(String[] args) {

        //List<Product> products = new ArrayList<>();
        List<Product> products = new LinkedList<>();

        products.add(new Food("Meat", 14.5, "f001", false));
        products.add(new Food("VeganMeat", 21.30, "F002", true));
        products.add(new Clothes("Jacket", 89.90, "J001"));
        products.add(new Food("Milk", 0.99, "F003", false));
        products.add(new Food("Cucumbers", 1.69, "F004", true));
        products.add(new Clothes("shirt", 39.59, "C001"));

        System.out.println(products);

        ProductComparator[] comparators = {
                new ProductComparatorByName(),
                new ProductComparatorByPrice(),
        };

        ComparatorSelector comparatorSelector = new ComparatorSelector(comparators);
        ProductComparator comparator = comparatorSelector.select();
        if (comparator!=null) {
            System.out.println("--------сортируем " + comparator.name() + " -----------");
            products.sort(comparator);

        } else {
            System.out.println("------сортируем по умолчанию-------");
            Collections.sort(products);
        }
        System.out.println(products);


        // делали в начале просто сортировки
        System.out.println("----------sort by ID------------");
        Collections.sort(products); // Collections - чтобы использовать sort для листа
        System.out.println(products);

        System.out.println("----------sort by price-----------");
        products.sort(new ProductComparatorByPrice());
        System.out.println(products);

        System.out.println("----------sort by name-----------");
        products.sort(new ProductComparatorByName());
        System.out.println(products);;

    }



}