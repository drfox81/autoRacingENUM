public class DriverC<C extends Trucks> extends Driver{
    private final String C;

    public DriverC(String nameDriver, int experience) {
        super(nameDriver, experience);
        this.C=DL_C;
    }

    @Override
    public String getDriverLicense() {
        return C;
    }

    public void getDriverAuto(Trucks auto) {
        if (getDriverLicense() == DL_C) {
            System.out.println("водитель -" + getNameDriver() + " управляет автомобилем -" + auto.getBrand() + " " +
                    auto.getModel() + " и будет участвовать в заезде");
        } else {
            System.out.println("поменяйте права");
        }
    }
}
