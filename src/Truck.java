public class Truck extends Car {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void doService() {
        super.doService();
       checkTruck();
    }

    public void checkTruck() {
        System.out.println("Проверяем прицеп");

    }
}









