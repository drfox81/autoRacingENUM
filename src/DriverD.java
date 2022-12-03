public class DriverD<D extends Bus> extends Driver{
    private final String D;
    public DriverD(String nameDriver,  int experience) {
        super(nameDriver, experience);
        this.D=DL_D;
    }

    @Override
    public String getDriverLicense() {
        return D;
    }

    public void getDriverAuto(Bus auto) {
        if (getDriverLicense() == DL_D) {
            System.out.println("водитель -" + getNameDriver() + " управляет автомобилем -" + auto.getBrand() + " " +
                    auto.getModel() + " и будет участвовать в заезде");
        } else {
            System.out.println("поменяйте права");
        }
    }
}
