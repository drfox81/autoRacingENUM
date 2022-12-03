import java.util.Arrays;
import java.util.Objects;

public abstract class Transport implements GeneralMethods {
    private String brand;
    private String model;
    private double engineCapacity;
    private String fuel;
    public final String DESEL = "дизель";
    final String PETROL = "бензин";
    final String ELECTRO = "электричество";

    public enum TypeTransport{
        CAR,
        TRUCK,
        BUS;
    }
    public abstract String printType();

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        if (this.fuel == null || this.fuel.isEmpty() || this.fuel.isBlank()) {
            if (fuel == DESEL) {
                this.fuel = fuel;
            } else if (fuel == PETROL) {
                this.fuel = fuel;
            } else if (fuel == ELECTRO) {
                this.fuel = fuel;
            }
        }
    }

    public Transport(String brand, String model, String fuel) {
        setBrand(brand);
        setModel(model);
        setFuel(fuel);
    }

    public Transport(String brand, String model, String fuel, double engineCapacity) {
        setBrand(brand);
        setModel(model);
        setFuel(fuel);
        setEngineCapacity(engineCapacity);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (this.brand == null || this.brand.isBlank() || this.brand.isEmpty()) {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (this.model == null || this.model.isBlank() || this.model.isEmpty()) {
            this.model = model;
        }
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        if (engineCapacity <= 0) {
            this.engineCapacity = Math.abs(engineCapacity);
        } else {
            this.engineCapacity = engineCapacity;
        }
    }

    @Override
    public final void start() {
        System.out.println("Начать движение - " + getBrand() + " " + getModel());
    }

    @Override
    public final void stop() {
        System.out.println("Закончить движение - " + getBrand() + " " + getModel());
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", fuel='" + fuel + '\'' +
                ", DESEL='" + DESEL + '\'' +
                ", PETROL='" + PETROL + '\'' +
                ", ELECTRO='" + ELECTRO + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineCapacity, engineCapacity) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(fuel, transport.fuel) && Objects.equals(DESEL, transport.DESEL) && Objects.equals(PETROL, transport.PETROL) && Objects.equals(ELECTRO, transport.ELECTRO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineCapacity, fuel, DESEL, PETROL, ELECTRO);
    }
}
