// решение с использованием set, HashSet

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        Account account1 = new Account("DE11223344");
        Account account2 = new Account("ES99887766");
        Account account3 = new Account("RU55667788");

        Transaction transaction1 = new Transaction(1, account1, account2, 100);
        Transaction transaction2 = new Transaction(2, account1, account2, 1_000);
        Transaction transaction3 = new Transaction(3, account1, account2, 500);
        Transaction transaction4 = new Transaction(2, account1, account2, 1_000);
        Transaction transaction5 = new Transaction(3, account1, account2, 500);

        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(transaction1);
        transactionList.add(transaction2);
        transactionList.add(transaction3);
        transactionList.add(transaction4);
        transactionList.add(transaction5);

        //for (int i = 0; i < transactionList.size(); i++) {
        //    System.out.println(transactionList.get(i));
        //}

        for (Transaction t: transactionList){
            System.out.println(t);
        }

        System.out.println("---------------------");
        List<Transaction> newList = deleteDuplicates(transactionList);
        for (Transaction t: newList){
            System.out.println(t);
        }

    }

    public static List<Transaction> deleteDuplicates(List <Transaction> list){
        List<Transaction> resultlist = new ArrayList<>();
        HashSet<Transaction> hashSet = new HashSet<>();
        for (Transaction t: list){
            if(!hashSet.add(t)){
                resultlist.add(new Transaction(100+t.getId(), t.getCredit(),t.getDebit(),t.getAmount()));
            }
        }
        return resultlist;
    }
}