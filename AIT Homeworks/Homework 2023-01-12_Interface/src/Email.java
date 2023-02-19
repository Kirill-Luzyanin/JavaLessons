public class Email implements MailDeliveryService{
    @Override
    public void sendMail() {
        System.out.println("Отправить по интернету");
    }

    @Override
    public String name() {
        return "E-mail";
    }
}
