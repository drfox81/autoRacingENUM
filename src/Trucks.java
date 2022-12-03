public class Trucks extends Transport implements Competing {
    private BodyTypeTruck loadCapacity;
    public final TypeTransport type = TypeTransport.TRUCK;

    public TypeTransport getType() {
        return type;
    }

    public BodyTypeTruck getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(BodyTypeTruck loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public Trucks(String brand, String model, String fuel, float loadCapacity) {
        super(brand, model, fuel);
        this.loadCapacity = BodyTypeTruck.change(loadCapacity);
    }

    @Override
    public String printType() {
        return "тип транспортного средства " + getBrand() + " " + getModel() + " - " + getType().name();
    }

    public Trucks(String brand, String model, String fuel, double engineCapacity) {
        super(brand, model, fuel, engineCapacity);
    }

    @Override
    public void pitStop() {
        System.out.println("Провести pit-stop \n" + "pit-stop - проведен!");
    }

    @Override
    public void bestTime() {
        System.out.println(getBrand() + " " + getModel() + " - показал лучшее время на этом круге!!!");
    }

    @Override
    public void maxSpeed() {
        System.out.println("достиг максимальной скорости 150 км/ч");
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + " грузоподъемность от: " + getLoadCapacity().getWeigtNumberUp() + " тонн до "
                + getLoadCapacity().getWeigtNumberDown() + " тонн";
    }
}
