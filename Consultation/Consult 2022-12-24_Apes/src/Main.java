import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Illness cholera = new Illness("Cholera");
        Illness plaque = new Illness("Plaque"); // чума
        Illness anthrax = new Illness("Anthrax"); // сиб. язва
        Illness leprosy = new Illness("Leprosy"); // проказа
        Illness scabies = new Illness("Scabies"); // чесотка

        ArrayList<Illness> ilnesses1 = new ArrayList<>(Arrays.asList(new Illness[]{cholera,plaque,anthrax}));
        ArrayList<Illness> ilnesses2 = new ArrayList<>(Arrays.asList(new Illness[]{cholera,anthrax, scabies}));

        Flea flea1 = new Flea(ilnesses1);
        Flea flea2 = new Flea(ilnesses2);
        Flea flea3 = new Flea();
        System.out.println(flea1);

        flea1.getIllnesses().add(leprosy);
        System.out.println(flea1);
        System.out.println(flea2);
        System.out.println(flea3);

        Ape homer = new Ape("Homer", new ArrayList<>(Arrays.asList(flea1, flea2, flea3)));
        System.out.println(homer);

        Ape johnnyBonana = new Ape ("Johnny Banana", new ArrayList<>(Arrays.asList(flea1, flea3)));
        System.out.println(johnnyBonana);

        GroupOfApes kingsOfBerlin = new GroupOfApes("Berlin", new Ape[]{homer,johnnyBonana});
        System.out.println(kingsOfBerlin);

        // задание поменять болезнь leprosy у блохи Джонни Банана
        // распечатали нужную болезнь
        System.out.println(
                kingsOfBerlin
                        .getApes()[1]
                        .getFleas()
                        .get(0)
                        .getIllnesses()
                        .get(3)
        );
        // а теперь заменим на другую болезнь
        Illness saveItForFuture =
                kingsOfBerlin
                        .getApes()[1]
                        .getFleas()
                        .get(0)
                        .getIllnesses()
                        .set(3, new Illness("Runny nose"));
        System.out.println("Удаленная болезнь " + saveItForFuture);
        System.out.println(kingsOfBerlin); // проверяем, что тут уже новая болзень
    }
}