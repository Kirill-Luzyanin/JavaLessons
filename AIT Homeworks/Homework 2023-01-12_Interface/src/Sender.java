public class Sender {



    public static void send (MailDeliveryService mailDeliveryService){
        System.out.printf("Отправляю почту (%s)...%n", mailDeliveryService.name());
        mailDeliveryService.sendMail();
    }
}
