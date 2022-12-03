public class Bus extends Transport implements Competing {

    private CapacityBus capacityBus;
    public final TypeTransport type = TypeTransport.BUS;

    public TypeTransport getType() {
        return type;
    }

    public Bus(String brand, String model, String fuel, int capacityBus) {
        super(brand, model, fuel);
        this.capacityBus = CapacityBus.change(capacityBus);
    }

    @Override
    public String printType() {
        return "тип транспортного средства " + getBrand() + " " + getModel() + " - " + getType().name();
    }

    public Bus(String brand, String model, String fuel, double engineCapacity) {
        super(brand, model, fuel, engineCapacity);
    }

    public CapacityBus getCapacityBus() {
        return capacityBus;
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
        return getBrand() + " " + getModel() + " вместимость: " + capacityBus.getCapacityDown() +
                " - " + capacityBus.getCapacityUp() + " мест";
    }
}
