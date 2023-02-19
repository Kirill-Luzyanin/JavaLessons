import java.util.Objects;

public class Car {

    private String model;
    private int price;
    private String engineType;

    private final int hash;

    public Car(String model, int price, String engineType) {
        this.model = model;
        this.price = price;
        this.engineType = engineType;
        hash=calcHashCode();

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car {" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", engineType='" + engineType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(model, car.model) && Objects.equals(engineType, car.engineType);
    }

    private int calcHashCode() {
        return Objects.hash(model, price, engineType);
    }

    @Override
    public int hashCode() {
        return hash;
    }
}
