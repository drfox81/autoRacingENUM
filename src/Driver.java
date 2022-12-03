import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Driver implements GeneralMethods {
    private String nameDriver;
    private String driverLicense;
    public static final String DL_B = "Права категория В";
    public static final String DL_C = "Права категория С";
    public static final String DL_D = "Права категория D";
    private int experience;

    public Driver(String nameDriver, int experience) {
        setNameDriver(nameDriver);
        setDriverLicense(driverLicense);
        setExperience(experience);
    }

    public String getNameDriver() {
        return nameDriver;
    }

    public void setNameDriver(String nameDriver) {
        if (getNameDriver() == null || getNameDriver().isEmpty() || getNameDriver().isBlank()) {
            Pattern pattern = Pattern.compile("^[А-Я]{1}[а-я]{1,20}\\s" +
                    "[А-Я]{1}[а-я]{1,20}\\s[А-Я]{1}[а-я]{1,20}$");
            Matcher matcher = pattern.matcher(nameDriver);
            if (matcher.matches() == true) {
                this.nameDriver = nameDriver;
            } else {
                System.out.println("введите ФИО с большой буквы через пробел");
            }
        }
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        if (driverLicense == DL_B || driverLicense == DL_D || driverLicense == DL_C) {
            this.driverLicense = driverLicense;
        } else {
            System.out.println("Проверьте категорию прав и введите верное");
        }
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience < 0) {
            this.experience = Math.abs(experience);
        } else {
            this.experience = experience;
        }

    }


    @Override
    public final void start() {
        System.out.println("Начинаю движение - " + getNameDriver());
    }

    @Override
    public final void stop() {
        System.out.println("Останавливаю авто - " + getNameDriver());
    }


    public final void refill(Transport auto, int quantity) {
        if (auto.getFuel() == "дизель") {
            System.out.println("Зправляем дизелем " + auto.getBrand() +
                    " " + auto.getModel() + " - " + quantity + " литров");
        } else if (auto.getFuel() == auto.PETROL) {
            System.out.println("Зправляем бензином " + auto.getBrand() +
                    " " + auto.getModel() + " - " + quantity + " литров");
        } else if (auto.getFuel() == auto.ELECTRO) {
            System.out.println("Заряжаем на " + auto.getBrand() +
                    " " + auto.getModel() + " - на " + quantity + "рублей");
        } else {
            System.out.println("Определите тип топлива для начала");
        }
    }

    @Override
    public String toString() {
        return "Driver{" +
                "nameDriver='" + nameDriver + '\'' +
                ", driverLicense='" + driverLicense + '\'' +
                ", experience=" + experience +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return experience == driver.experience && Objects.equals(nameDriver, driver.nameDriver) && Objects.equals(driverLicense, driver.driverLicense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameDriver, driverLicense, experience);
    }
}
