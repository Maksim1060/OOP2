public class Car extends  Bicycle {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void doService() {
      super.doService();
        updateTyre();
        checkEngie();

    }public void checkEngie(){
        System.out.println("Проверяем двигатель");
    }
        }

