public class DHL implements MailDeliveryService{

    private double price;

    public DHL(double price) {
        this.price = price;
    }

    @Override
    public void sendMail() {
        System.out.println("Положи письмо в конверт, приклей марку, отправь. Цена: " + price);
    }

    @Override
    public String name() {
        return "DHL";
    }

}
