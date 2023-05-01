import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        PrinterImpl printer = new PrinterImpl();
        theMethodUsePrinter(printer, "Вариант 1");
        ///////////////////////////////////////////////////////////
        Printer printer1 = (String str) -> {
            System.out.println("Лямбда");
            System.out.println(str);
        };

        System.out.println("*".repeat(30));
        theMethodUsePrinter(printer1, "Вариант 2");

        System.out.println("*".repeat(30));
        theMethodUsePrinter((str) -> System.out.println("str: " + str), "Вариант 2.1");

        System.out.println("*".repeat(30));
        theMethodUseConsumer((str) -> System.out.println("str: " + str), "Вариант consumer");

        System.out.println("------------------------------------");
        List.of("1", "2", "3").forEach((s) -> System.out.println(s));

        System.out.println("--------------stream----------------");
        System.out.println(List.of("1", "2", "3", "asf", "dsdasad", "dsdasad", "hhk").stream()
                .filter((s) -> s.length() >= 4)
                .distinct() //неповторяющиеся элементы
                .count()); //посчитать количество элементов в потоке

    }

    public static void theMethodUsePrinter(Printer printer, String msg) {
        printer.print(msg);
    }

    public static void theMethodUseConsumer(Consumer<String> printer, String msg) {
        printer.accept(msg);
    }

}
