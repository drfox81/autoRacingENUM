public class DriverB<B extends Car> extends Driver {

    private final String B;
    public DriverB(String nameDriver, int experience) {
        super(nameDriver, experience);
        this.B=DL_B;
    }

    @Override
    public String getDriverLicense() {
        return B;
    }

    public void getDriverAuto(Car auto) {
        if (getDriverLicense() == DL_B) {
            System.out.println("водитель -" + getNameDriver() + " управляет автомобилем -" + auto.getBrand() + " " +
                    auto.getModel() + " и будет участвовать в заезде");
        } else {
            System.out.println("поменяйте права");
        }
    }


}
