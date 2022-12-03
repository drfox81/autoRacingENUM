public class Main {
    public static void main(String[] args) {

//        Car ladaKalina = new Car("Lada","Kalina","бензин","седан");
//        Car bmw5 = new Car("BMW","X5","бензин","хэтчбэк");
//        Car kiaRio = new Car("Kia","Rio","дизель",1.6);
//
        Trucks kamaz = new Trucks("Kamaz", "3008","дизель",3f);
        Trucks maz = new Trucks("Maz", "4008","дизель",17);
//
        Bus paz = new Bus("Паз", "2645","дизель",30);
//
//        paz.start();
//        paz.stop();
//
//        DrB fedorovD=new DrB("Федоров Федор Федорович",6, ladaKalina,Dr.DL_B);
//        System.out.println(fedorovD.getDriverLicense());
//        fedorovD.refill(ladaKalina,20);
//        fedorovD.getDriverAuto(ladaKalina);
//
//        paz.pitStop();
//        paz.bestTime();
//        paz.maxSpeed();
//        bmw5.bestTime();

        Car ladaVesta = new Car("Lada", "Vesta", "бензин","седан");
        System.out.println(ladaVesta.getBodyType().getType());

        System.out.println(ladaVesta.toString());
        System.out.println(kamaz.getLoadCapacity().name());
        System.out.println(kamaz.toString());
        System.out.println(maz.toString());
        System.out.println(paz.getCapacityBus().name());
        System.out.println(paz.toString());
        System.out.println(paz.printType());
        System.out.println(ladaVesta.printType());
        System.out.println(maz.printType());


    }
}