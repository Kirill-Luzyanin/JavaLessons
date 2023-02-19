/*

Дан List<Transaction> транзакций банковских транзакций Transaction{long id, Account debit, Account credit, double amount}.
Увы при загрузке, часть транзакций в данном списке “задвоилось”. Необходимо сгенерировать список корректирующих транзакций,
для всех “задвоенных” транзакций,  т.е. сгенерировать транзакцию на ту же сумму, но с обратной корреспонденцией счетов.
Не забываем про тесты.

Пояснения:
класс Account может содержать всего одно поле String iban  - номер счета.
Транзакция [id=1  debit = account1 credit=account2  amount=100] означает, что 100 евро перечислено со счета   account1 на счет account2
* С точки зрения бухгалтерие это не совсем так, но мы не занимаемся бух.учетом.
Если в данном листе встретилось 2 одинаковых транзакции, например:
[id=1  debit = account1 credit=account2  amount=100]
[id=1  debit = account1 credit=account2  amount=100]
считаем, что произошла ошибка, и на счет account2 ушло денег в 2 раза больше чем должно было
Чтобы исправить ситуацию, необходимо создать корректирующую транзакцию:
[id=11  debit = account2 credit=account1  amount=100]
Ваша задача получить лист из корректирующих транзакций.

 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Account account1 = new Account("DE11223344");
        Account account2 = new Account("ES99887766");
        Account account3 = new Account("RU55667788");

        Transaction transaction1 = new Transaction(1, account1, account2, 100);
        Transaction transaction2 = new Transaction(2, account1, account2, 1_000);
        Transaction transaction3 = new Transaction(3, account1, account2, 500);
        Transaction transaction4 = new Transaction(4, account2, account3, 100);
        Transaction transaction5 = new Transaction(3, account1, account2, 500);

        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(transaction1);
        transactionList.add(transaction2);
        transactionList.add(transaction3);
        transactionList.add(transaction4);
        transactionList.add(transaction5);

        for (int i = 0; i < transactionList.size(); i++) {
            System.out.println(transactionList.get(i));
        }

        System.out.println(transactionCheck(transactionList));
        System.out.println(sameTransactionSearch(transactionList));
        System.out.println(correctTransactionGenerate(transactionList));
    }

    //проверка на одинаковые транзакции
    public static boolean transactionCheck (List<Transaction> list){
        int index=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(index).equals(list.get(i))) return false; // если так, то есть совпадение (значит есть неверная транзакция)
            index++;
        }
        return true;
    }

    // нахождение совпадения (совпадающей транзакции)
    public static Transaction sameTransactionSearch (List<Transaction> list){
        Transaction res=new Transaction();
        int index=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(index).equals(list.get(i))) {
                res=list.get(i);
            }
            index++;
        }
        return res;
    }

    // генерация корректной транзакции
    public static Transaction correctTransactionGenerate (List<Transaction> list){
        Transaction res=new Transaction();
        if (transactionCheck(list) == false) {
            res = reverse(sameTransactionSearch(list));
        }

        return res;
    }

    // перестановка дебит-кредит
    public static Transaction reverse (Transaction transaction){
        Transaction res=new Transaction();
        //transaction.setDebit(transaction.getCredit());
        //transaction.setCredit(transaction.getDebit());
        res = new Transaction(transaction.getId(), transaction.getCredit(), transaction.getDebit(),transaction.getAmount());
        return res;
    }


}