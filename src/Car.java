public class Car extends Transport implements Competing {

    private BodyTypeCar bodyType;
    public final TypeTransport type = TypeTransport.CAR;

    public TypeTransport getType() {
        return type;
    }

    @Override
    public String printType() {
        return "тип транспортного средства " + getBrand() + " " + getModel() + " - " + getType().name();
    }

    public Car(String brand, String model, String fuel, double engineCapacity) {
        super(brand, model, fuel, engineCapacity);
    }

    public Car(String brand, String model, String fuel, String bodyType) {
        super(brand, model, fuel);
        this.bodyType = BodyTypeCar.change(bodyType);
    }

    public BodyTypeCar getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyTypeCar bodyType) {
        if (this.bodyType.getType() == "не указан" || bodyType == null) {
            this.bodyType = bodyType;
        }
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
        return  getBodyType().name() + ": " + getBodyType().getType();
    }
}
