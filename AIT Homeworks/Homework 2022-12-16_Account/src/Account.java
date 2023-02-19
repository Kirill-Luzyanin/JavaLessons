public class Account {
    private String IBAN;
    private double balance;
    private Person client;

    public Account(String iBAN, double balance, Person client) {
        this.IBAN = iBAN;
        this.balance = balance;
        this.client = client;
    }

    public String getIBAN() {
        return IBAN;
    }

    public double getBalance() {
        return balance;
    }

    public Person getClient() {
        return client;
    }

    @Override
    public String toString() {
        return String.format("%s %12s (%.2f)", IBAN, client, balance);
    }
}

