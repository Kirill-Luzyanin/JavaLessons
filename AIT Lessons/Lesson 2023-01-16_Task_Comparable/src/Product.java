public abstract class Product implements Comparable<Product> {

    private static int counter=0; // это как поле класса (потому что Static)
    private String name; // это уже обычное поле объекта
    private double price;
    private String vendorCode;

    private int id;

    public Product(String name, double price, String vendorCode) {
        this.name = name;
        this.price = price;
        this.vendorCode = vendorCode;
        this.id=++counter;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%n%d. %s %.2f %s", id, name, price, vendorCode);
    }

    // для сортировки по имени
    //@Override
    //public int compareTo(Product p) {
    //    return this.name.compareTo(p.name);
    //}

    // для сортировки по id
    @Override
    public int compareTo(Product p) {
        return p.id-this.id;
    }
}
