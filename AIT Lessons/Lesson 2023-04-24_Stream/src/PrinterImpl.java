public class PrinterImpl implements Printer{

    @Override
    public void print(String message) {
        System.out.println("Реализация принтера в классе ");
        System.out.println(message);
    }
}
