public class Account {
    private String iban;

    public Account(String iban) {
        this.iban = iban;
    }

    public String getIban() {
        return iban;
    }

    @Override
    public String toString() {
        return String.format("%s", iban);
    }
}
